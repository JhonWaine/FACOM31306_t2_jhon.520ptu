public class FolhaPagamento {
    public void imprimirFolha(Funcionario[] funcionarios) {
        double totalFolha = 0;

        System.out.println("=== FOLHA DE PAGAMENTO ===");
        System.out.println("--------------------------");

        for (Funcionario func : funcionarios) {
            func.calcularSalario();
            System.out.println(func);
            System.out.println("--------------------------");
            totalFolha += func.getSalario();
        }

        System.out.println("TOTAL DA FOLHA: R$ " + String.format("%.2f", totalFolha));
    }
}