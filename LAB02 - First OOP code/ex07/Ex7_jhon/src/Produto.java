public class Produto {
    // Atributos privados
    private String nome;
    private float preco;
    private int quantidadeEstoque;

    // Construtor 1: Inicializa todos os atributos
    public Produto(String nome, float preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Construtor 2: Inicializa apenas o nome (preço e estoque com valores padrão)
    public Produto(String nome) {
        this(nome, 0.0f, 0); // Chama o primeiro construtor com valores padrão
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco >= 0) { // Validação para evitar preços negativos
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço não pode ser negativo.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) { // Validação para evitar estoque negativo
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            System.out.println("Erro: Quantidade em estoque não pode ser negativa.");
        }
    }

    // Método para alterar o preço com base em uma porcentagem
    public void alteraPreco(float porcentagem) {
        if (porcentagem >= -100) { // Validação para evitar redução maior que 100%
            this.preco *= (1 + porcentagem / 100);
        } else {
            System.out.println("Erro: Porcentagem inválida para alteração de preço.");
        }
    }

    // Método para exibir informações do produto
    public void imprimeProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println(); // Linha em branco para separar os produtos
    }
}