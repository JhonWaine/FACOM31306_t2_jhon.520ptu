public class Main {
    public static void main(String[] args) {

        Classificador classificador = new Classificador();

        // Criando e ordenando vetor de Produtos
        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto(3, "Notebook", 2500.00);
        produtos[1] = new Produto(1, "Mouse", 50.00);
        produtos[2] = new Produto(2, "Teclado", 120.00);

        System.out.println("Produtos antes da ordenação:");
        imprimirVetor(produtos);

        classificador.ordena(produtos);

        System.out.println("\nProdutos após ordenação por código:");
        imprimirVetor(produtos);

        // Criando e ordenando vetor de Clientes
        Cliente[] clientes = new Cliente[3];
        clientes[0] = new Cliente("Carlos", 30, "111.111.111-11");
        clientes[1] = new Cliente("Ana", 25, "222.222.222-22");
        clientes[2] = new Cliente("Bruno", 40, "333.333.333-33");

        System.out.println("\nClientes antes da ordenação:");
        imprimirVetor(clientes);

        classificador.ordena(clientes);

        System.out.println("\nClientes após ordenação por nome:");
        imprimirVetor(clientes);

        // Criando e ordenando vetor de Serviços
        Servico[] servicos = new Servico[3];
        servicos[0] = new Servico("Formatação", 120.00, 102);
        servicos[1] = new Servico("Instalação", 80.00, 101);
        servicos[2] = new Servico("Manutenção", 200.00, 103);

        System.out.println("\nServiços antes da ordenação:");
        imprimirVetor(servicos);

        classificador.ordena(servicos);

        System.out.println("\nServiços após ordenação por preço:");
        imprimirVetor(servicos);
        System.out.println("Auno: Jhon Waine Mendes Gonçalves 12021BCC028:");
    }

    // Método auxiliar para imprimir vetores
    public static void imprimirVetor(Classificavel[] vetor) {
        for (Classificavel item : vetor) {
            System.out.println(item);
        }

    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD