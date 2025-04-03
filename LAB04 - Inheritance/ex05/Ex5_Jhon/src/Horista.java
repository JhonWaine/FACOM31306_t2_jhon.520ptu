import java.util.Date;
class Horista extends Funcionario {
    private double valorPorHora;
    private int horasTrabalhadas;

    public Horista(String nome, Date dataNascimento, double valorPorHora, int horasTrabalhadas) {
        super(nome, dataNascimento);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularSalario() {
        this.salario = valorPorHora * horasTrabalhadas;
    }
}