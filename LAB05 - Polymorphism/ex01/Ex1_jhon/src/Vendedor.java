import java.time.LocalDate;

public class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissaoPorVenda;
    private int quantidadeVendas;

    public Vendedor(String nome, LocalDate dataNascimento, double valorFixo,
                    double comissaoPorVenda, int quantidadeVendas) {
        super(nome, dataNascimento);
        this.valorFixo = valorFixo;
        this.comissaoPorVenda = comissaoPorVenda;
        this.quantidadeVendas = quantidadeVendas;
    }

    @Override
    public void calcularSalario() {
        setSalario(valorFixo + (comissaoPorVenda * quantidadeVendas));
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Vendedor" +
                "\nVendas realizadas: " + quantidadeVendas;
    }
}