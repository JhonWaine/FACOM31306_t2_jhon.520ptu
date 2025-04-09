class Pessoa {
    private String nome;
    private Endereco[] enderecos; // Composição com a classe Endereco

    // Construtor
    public Pessoa(String nome, Endereco[] enderecos) {
        this.nome = nome;
        this.enderecos = enderecos;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    // Método para exibir informações da pessoa e seus endereços
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereços:");
        for (Endereco endereco : enderecos) {
            System.out.println(" - Rua: " + endereco.getRua() + ", Cidade: " + endereco.getCidade());
        }
        System.out.println("-----------------------------");
    }
}