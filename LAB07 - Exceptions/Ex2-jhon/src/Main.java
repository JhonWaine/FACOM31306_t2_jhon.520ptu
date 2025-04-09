public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();

        // Teste 1: Divisão válida (10 / 2)
        System.out.println("Testando 10 / 2:");
        operacao.iniciarOperacao(10, 2);

        // Teste 2: Divisão por zero (5 / 0)
        System.out.println("\nTestando 5 / 0:");
        operacao.iniciarOperacao(5, 0);

        // Teste 3: Outra divisão válida (7 / 3)
        System.out.println("\nTestando 7 / 3:");
        operacao.iniciarOperacao(7, 3);
    }
}