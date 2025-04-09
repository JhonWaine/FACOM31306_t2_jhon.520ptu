public class Servico implements Classificavel {
    private String descricao;
    private double preco;
    private int codigo;

    public Servico(String descricao, double preco, int codigo) {
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Servico compara = (Servico) obj;
        return this.preco < compara.preco;
    }

    @Override
    public String toString() {
        return "Servico{descricao='" + descricao + "', preco=" + preco + ", codigo=" + codigo + "}";
    }
}