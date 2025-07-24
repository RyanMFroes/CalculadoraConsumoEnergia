import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criando o leitor de entrada (teclado)

        // Solicita a tarifa de energia elétrica (em R$/kWh)
        System.out.print("Informe o valor da tarifa (R$/kWh): ");
        double tarifa = sc.nextDouble();

        // Pergunta quantos aparelhos o usuário quer cadastrar
        System.out.print("Quantos aparelhos deseja cadastrar (1-7)? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner

        // Cria um vetor (array) para armazenar os aparelhos
        Equipamento[] equipamentos = new Equipamento[qtd];

        // Loop para cadastrar cada aparelho
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%n--- Aparelho #%d ---\n", i + 1);
            equipamentos[i] = Equipamento.criarEquipamento(sc); // Cria o aparelho com entrada do usuário
        }

        // Variáveis para guardar o total de consumo e custo
        double totalKwh = 0;
        double totalCusto = 0;

        // Mostra os resultados por aparelho
        System.out.println("\n=== Resultados ===");

        for (Equipamento e : equipamentos) {
            double consumo = e.calcularConsumo();        // Calcula consumo em kWh
            double custo = consumo * tarifa;             // Multiplica pelo valor da tarifa

            // Exibe o resultado individual
            System.out.printf("%s: %.2f kWh → R$ %.2f\n", e.nome, consumo, custo);

            totalKwh += consumo;
            totalCusto += custo;
        }

        // Exibe o total geral
        System.out.printf("\nTotal: %.2f kWh → R$ %.2f\n", totalKwh, totalCusto);

        sc.close(); // Encerra o uso do Scanner
    }
}
