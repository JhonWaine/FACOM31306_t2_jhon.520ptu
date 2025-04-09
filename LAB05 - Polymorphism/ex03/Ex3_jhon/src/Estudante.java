public class Estudante {
    private String nome;
    private String endereco;

    public Estudante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Método original
    public void print() {
        System.out.println("Estudante{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}');
    }

    // (d) Método sobrecarregado
    public void print(boolean mesmaLinha) {
        if (mesmaLinha) {
            System.out.print("Nome: " + nome + "; Endereço: " + endereco);
        } else {
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}