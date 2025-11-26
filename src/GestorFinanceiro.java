import java.util.Scanner;

public class GestorFinanceiro {

    public static double solicitarSalario(Scanner scanner) {
        System.out.println("Digite seu salário: R$ ");

        double salarioUsuario = scanner.nextDouble();
        return salarioUsuario;
    }

    public static double solicitarDespesas(Scanner scanner) {

        double totalDesopesas = 0.0;
        String continuar;

        do {
            System.out.println("Valor da despesa: R$ ");
            double despesa = scanner.nextDouble();

            totalDesopesas += despesa;

            System.out.println("Adicionar outra? (S/N)");
            continuar = scanner.next();

        } while (continuar.trim().equalsIgnoreCase("s") || continuar.trim().equalsIgnoreCase("sim"));

        return totalDesopesas;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=====Gestor Financeiro=====");

        double salario = solicitarSalario(scanner);
        double gastos = solicitarDespesas(scanner);

        double saldoRestante = salario - gastos;


        if (saldoRestante < 0) {
            System.out.println("\n===== ATENÇÃO =====");
            System.out.println("Seu saldo está negativado!");

            System.out.println("\nResumo Financeiro:");
            System.out.println("Salário: " + salario);
            System.out.println("Despesas: " + gastos);
            System.out.println("Saldo: " + saldoRestante);
        } else {
            System.out.println("\nResumo Financeiro:");
            System.out.println("Salário: " + salario);
            System.out.println("Despesas: " + gastos);
            System.out.println("Saldo: " + saldoRestante);
        }

        scanner.close();
    }
}
