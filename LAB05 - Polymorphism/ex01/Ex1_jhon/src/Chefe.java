import java.time.LocalDate;

public class Chefe extends Funcionario {
    private double salarioFixo;

    public Chefe(String nome, LocalDate dataNascimento, double salarioFixo) {
        super(nome, dataNascimento);
        this.salarioFixo = salarioFixo;
    }


    @Override
    public void calcularSalario() {
        setSalario(salarioFixo);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Chefe";
    }
}