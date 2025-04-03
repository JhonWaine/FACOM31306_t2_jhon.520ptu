import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando um vetor de produtos
        Produto[] produtos = new Produto[5];

        // Instanciando produtos
        produtos[0] = new Produto("Notebook", 3500.00f, 10);
        produtos[1] = new Produto("Smartphone", 1500.00f, 20);
        produtos[2] = new Produto("Tablet", 1200.00f, 15);
        produtos[3] = new Produto("Monitor", 800.00f, 5);
        produtos[4] = new Produto("Teclado", 150.00f, 30);

        // Exibindo produtos antes da ordenação
        System.out.println("Produtos antes da ordenação:");
        for (Produto p : produtos) {
            p.imprimeProduto();
        }

        // Ordenando o vetor de produtos pelo nome
        ordenarProdutosPorNome(produtos);

        // Exibindo produtos após a ordenação
        System.out.println("Produtos após a ordenação:");
        for (Produto p : produtos) {
            p.imprimeProduto();
        }
    }

    // Método para ordenar o vetor de produtos pelo nome (Selection Sort)
    public static void ordenarProdutosPorNome(Produto[] produtos) {
        for (int i = 0; i < produtos.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < produtos.length; j++) {
                if (produtos[j].getNome().compareToIgnoreCase(produtos[indiceMenor].getNome()) < 0) {
                    indiceMenor = j;
                }
            }
            // Troca os produtos de posição
            Produto temp = produtos[indiceMenor];
            produtos[indiceMenor] = produtos[i];
            produtos[i] = temp;
        }
        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }

// Todos os direitos reservados a Jhon Waine Mendes Gonçalves LTD
}