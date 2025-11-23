import java.util.Scanner;

public class GestorFinanceiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Meu Gestor de Finanças ===");

        // 1. INPUT ANTERIOR AO LOOP
        System.out.println("Salário mensal: R$ ");
        double salarioMensal = scanner.nextDouble();

        // 2. INICIALIZAÇÃO (O CARRINHO VAZIO)
        double totalDespesa = 0.0;  // O ACUMULADOR (Variável FORA do loop)
        double despesa;             // Variável para guardar o input da volta atual
        String continuar;                  // Variável de controle do loop ('1' ou '2')

        // 3. O LOOP DO-WHILE COMEÇA AQUI
        do {

            // 4. AÇÃO (Sempre acontece pelo menos uma vez)
            System.out.println("Despesa: R$ ");
            despesa = scanner.nextDouble();

            // 5. ACUMULAÇÃO (Adiciona o item lido ao total)
            totalDespesa += despesa; // aqui vai calcular o total da despesa

            // 6. SENTINELA (Pergunta de controle)
            System.out.println("Deseja adicionar mais uma despesa?");
            System.out.println("SIM ou NÃO");
            scanner.nextLine(); // Limpa o ENTER pendente para não finalizar o programa sem ler a resposta do usuário
            continuar = scanner.nextLine();

            // 7. CONDIÇÃO DE CONTINUIDADE
        } while (continuar.trim().equalsIgnoreCase("s") || continuar.trim().equalsIgnoreCase("sim"));
        // .trim() -> remove espaços em branco
        // .equalsIgnoreCase -> compara valores e não faz distinção

        // 8. CÁLCULO FINAL (SÓ RODA QUANDO O LOOP PARA)
        double saldoRestante = salarioMensal - totalDespesa;

        // ... (Impressão do resumo e do saldo restante)
        if (saldoRestante < 0) {
            System.out.println("\n===ATENÇÃO!=== \nSeu saldo está negativo!");
            System.out.println("\nSalário Mensal: R$ " + salarioMensal);
            System.out.printf("Despesa total: R$ %.2f ", totalDespesa);
            System.out.printf("\nSaldo Restante: R$ %.2f", saldoRestante);

        } else {
            System.out.println("\nSalário Mensal: R$ " + salarioMensal);
            System.out.printf("Despesa total: R$ %.2f ", totalDespesa);
            System.out.printf("\nTotal do Saldo Restante: R$ R$ %.2f", saldoRestante);
        }

        scanner.close();
    }
}
