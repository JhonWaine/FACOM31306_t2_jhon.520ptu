import java.time.LocalDate;

public class Operario extends Funcionario {
    private double valorPorProducao;
    private int quantidadeProduzida;

    public Operario(String nome, LocalDate dataNascimento,
                    double valorPorProducao, int quantidadeProduzida) {
        super(nome, dataNascimento);
        this.valorPorProducao = valorPorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public void calcularSalario() {
        setSalario(valorPorProducao * quantidadeProduzida);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Operário" +
                "\nPeças produzidas: " + quantidadeProduzida;
    }
}