public class GestorFinanceiro {
    public static void main(String[] args) {

        System.out.println("\n=== Meu Gestor de Finanças ===");

        double despesa1 = 50.0;
        double despesa2 = 85.5;
        double despesa3 = 138.9;

        double salarioMensal = 2385.14;

        double totalDespesas = despesa1 + despesa2 + despesa3;

        double saldoRestante = salarioMensal - totalDespesas;

        System.out.println("Salário Mensal: R$ " + salarioMensal);
        System.out.println("Total de Despesas: R$ " + totalDespesas);
        System.out.println("Total do Saldo Restante: R$ " + saldoRestante);
    }
}