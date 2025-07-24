import java.util.Scanner;

public class Equipamento {
    // Atributos (características) do equipamento
    public String nome;
    public double potencia;     // Potência em watts (W)
    public double horasPorDia;  // Quantas horas por dia o equipamento é usado
    public int dias;            // Por quantos dias ele será usado

    // Construtor — usado para criar o objeto com os dados preenchidos
    public Equipamento(String nome, double potencia, double horasPorDia, int dias) {
        this.nome = nome;
        this.potencia = potencia;
        this.horasPorDia = horasPorDia;
        this.dias = dias;
    }

    // Método estático para pedir ao usuário os dados do equipamento
    public static Equipamento criarEquipamento(Scanner sc) {
        // Lista de nomes padrões e respectivas potências
        String[] nomes = {
                "Televisor (150W)",
                "Geladeira (200W)",
                "Ar-condicionado (1000W)",
                "Ventilador (75W)",
                "Computador (200W)",
                "Micro-ondas (60W)",
                "Outro (personalizado)"
        };

        double[] potencias = {150, 200, 1000, 75, 200, 60, 0};

        // Exibe o menu de aparelhos
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%d. %s\n", i + 1, nomes[i]);
        }

        // Lê a opção escolhida pelo usuário
        int escolha;
        do {
            System.out.print("Escolha uma opção (1–7): ");
            escolha = sc.nextInt();
        } while (escolha < 1 || escolha > 7);

        sc.nextLine(); // Limpa o buffer

        String nome;
        double potencia;

        // Se o usuário escolheu "Outro", pede os dados manualmente
        if (escolha == 7) {
            System.out.print("Digite o nome do aparelho: ");
            nome = sc.nextLine();
            System.out.print("Potência (W): ");
            potencia = sc.nextDouble();
        } else {
            // Usa o nome e a potência padrão conforme a escolha
            nome = nomes[escolha - 1].split(" ")[0]; // Pega só o nome (exclui "(150W)")
            potencia = potencias[escolha - 1];
        }

        // Pede os dados de uso
        System.out.print("Horas de uso por dia: ");
        double horas = sc.nextDouble();

        System.out.print("Dias no período: ");
        int dias = sc.nextInt();

        // Cria e retorna um novo objeto do tipo Equipamento
        return new Equipamento(nome, potencia, horas, dias);
    }

    // Método que calcula o consumo total em kWh
    public double calcularConsumo() {
        return (potencia / 1000) * horasPorDia * dias;
    }
}
