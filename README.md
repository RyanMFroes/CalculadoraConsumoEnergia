# 💡 Calculadora de Consumo de Energia Elétrica

Este é um projeto simples em Java que simula o consumo de energia elétrica de diferentes equipamentos utilizados em uma residência ou ambiente. O programa calcula o consumo total em **kWh (quilowatt-hora)** e estima o custo com base na **tarifa de energia informada pelo usuário**.

## 🛠️ Funcionalidades

- Cadastro de 1 até 7 aparelhos elétricos.
- Escolha entre aparelhos pré-definidos ou personalizados.
- Cálculo do consumo de cada equipamento com base em:
  - Potência (W)
  - Horas de uso por dia
  - Número de dias de uso
- Cálculo do custo estimado com base na tarifa informada.
- Exibição do consumo individual e total em kWh e em R$.

## 📸 Exemplo de Execução

```bash
Informe o valor da tarifa (R$/kWh): 0.85
Quantos aparelhos deseja cadastrar (1-7)? 2

--- Aparelho #1 ---
1. Televisor (150W)
2. Geladeira (200W)
3. Ar-condicionado (1000W)
4. Ventilador (75W)
5. Computador (200W)
6. Micro-ondas (60W)
7. Outro (personalizado)
Escolha uma opção (1–7): 1
Horas de uso por dia: 5
Dias no período: 30

--- Aparelho #2 ---
Escolha uma opção (1–7): 4
Horas de uso por dia: 8
Dias no período: 30

=== Resultados ===
Televisor: 22.50 kWh → R$ 19.13  
Ventilador: 18.00 kWh → R$ 15.30

Total: 40.50 kWh → R$ 34.43
---------------------------------------------------------------------------------------
```

##👨‍💻 Autor

- Desenvolvido por Ryan Muto
- GitHub: @RyanMFroes
