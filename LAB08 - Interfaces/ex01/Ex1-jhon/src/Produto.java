public class Produto implements Classificavel {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Produto compara = (Produto) obj;
        return this.codigo < compara.codigo;
    }

    @Override
    public String toString() {
        return "Produto{codigo=" + codigo + ", nome='" + nome + "', preco=" + preco + "}";
    }
}