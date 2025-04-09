public class Main {
    public static void main(String[] args) {
        System.out.println("Auno: Jhon Waine Mendes Gonçalves 12021BCC028:");
        Classificador classificador = new Classificador();

        // Teste com Produtos
        Produto[] produtos = {
                new Produto(3, "Notebook", 2500.00),
                new Produto(1, "Mouse", 50.00),
                new Produto(2, "Teclado", 120.00)
        };

        System.out.println("Produtos antes da ordenação:");
        imprimirVetor(produtos);

        classificador.ordena(produtos);

        System.out.println("\nProdutos após ordenação:");
        imprimirVetor(produtos);

        // Teste com Clientes e Serviços (similar ao exemplo anterior)
        // ...
    }

    public static void imprimirVetor(Classificavel[] vetor) {
        for (Classificavel item : vetor) {
            System.out.println(item);
        }
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD