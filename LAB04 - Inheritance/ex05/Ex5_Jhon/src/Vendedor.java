import java.util.Date;
class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private int vendas;

    public Vendedor(String nome, Date dataNascimento, double valorFixo, double comissao, int vendas) {
        super(nome, dataNascimento);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    @Override
    public void calcularSalario() {
        this.salario = valorFixo + (comissao * vendas);
    }
}