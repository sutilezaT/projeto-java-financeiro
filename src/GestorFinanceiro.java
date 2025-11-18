import java.util.Scanner;

public class GestorFinanceiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Meu Gestor de Finanças ===");

        System.out.println("Salário mensal: R$ ");
        double salarioMensal = scanner.nextDouble();

        double despesa;
        double totalDespesa = 0.0; // contagem da despesa
        int opcao;

        do {
            System.out.println("Despesa: R$ ");
            despesa = scanner.nextDouble();

            totalDespesa += despesa; // aqui vai calcular o total da despesa

            System.out.println("Deseja adicionar mais uma despesa?");
            System.out.println("1- SIM 2- NÃO");
            opcao = scanner.nextInt();

        } while (opcao == 1);

        double saldoRestante = salarioMensal - totalDespesa;

        if (saldoRestante < 0) {
            System.out.println("\n===ATENÇÃO!=== \nSeu saldo está negativo!");
            System.out.printf("Saldo Restante: R$ %.2f", saldoRestante);

        } else {
            System.out.println("\nSalário Mensal: R$ " + salarioMensal);
            System.out.printf("Total do Saldo Restante: R$ R$ %.2f\n", saldoRestante);
        }

        scanner.close();
    }
}
