import java.util.Date;
class Operario extends Funcionario {
    private double valorPorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, Date dataNascimento, double valorPorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento);
        this.valorPorProducao = valorPorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public void calcularSalario() {
        this.salario = valorPorProducao * quantidadeProduzida;
    }
}