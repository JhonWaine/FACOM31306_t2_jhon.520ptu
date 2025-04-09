public class Main {
    public static void main(String[] args) {
        // Criando um funcionário com salário inicial de R$ 30.000
        Funcionario funcionario = new Funcionario("123.456.789-00", "João Silva", 30000.0);

        try {
            // Tentando aumentar o salário em 50% (ficaria R$ 45.000, acima do teto)
            funcionario.aumentarSalario(50);
        } catch (TetoSalarialExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual: R$ " + funcionario.getSalario());
        }

        // Testando com um aumento válido
        try {
            // Aumentando o salário em 10% (ficaria R$ 33.000)
            funcionario.aumentarSalario(10);
        } catch (TetoSalarialExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual: R$ " + funcionario.getSalario());
        }

        // Alterando o teto salarial para R$ 50.000
        Funcionario.setTetoSalarial(50000.0);
        System.out.println("Novo teto salarial: R$ " + Funcionario.getTetoSalarial());

        // Tentando o aumento de 50% novamente (agora ficaria R$ 49.500, dentro do novo teto)
        try {
            funcionario.aumentarSalario(50);
        } catch (TetoSalarialExcecao e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Salário atual: R$ " + funcionario.getSalario());
        }
        System.out.println("Auno: Jhon Waine Mendes Gonçalves 12021BCC028:");
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD