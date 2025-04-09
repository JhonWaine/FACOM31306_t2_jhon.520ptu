import java.time.LocalDate;

public class Horista extends Funcionario {
    private double valorPorHora;
    private double horasTrabalhadas;

    public Horista(String nome, LocalDate dataNascimento,
                   double valorPorHora, double horasTrabalhadas) {
        super(nome, dataNascimento);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularSalario() {
        setSalario(valorPorHora * horasTrabalhadas);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo: Horista" +
                "\nHoras trabalhadas: " + horasTrabalhadas;
    }
}