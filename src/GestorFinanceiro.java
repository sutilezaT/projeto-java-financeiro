import java.util.Scanner;

public class GestorFinanceiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Meu Gestor de Finanças ===");

        System.out.println("Salário mensal: R$ ");
        double salarioMensal = scanner.nextDouble();

        System.out.println("valor da despesa 1: R$ ");
        double despesa1 = scanner.nextDouble();

        System.out.println("Valor da despesa 2: R$ ");
        double despesa2 = scanner.nextDouble();

        System.out.println("Valor da despes 3: R$ ");
        double despesa3 = scanner.nextDouble();

        double totalDespesas = despesa1 + despesa2 + despesa3;

        double saldoRestante = salarioMensal - totalDespesas;

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
