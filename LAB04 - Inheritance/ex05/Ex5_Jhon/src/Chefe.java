import java.util.Date;
class Chefe extends Funcionario {
    public Chefe(String nome, Date dataNascimento, double salarioFixo) {
        super(nome, dataNascimento);
        this.salario = salarioFixo;
    }

    @Override
    public void calcularSalario() {
        // O salário do chefe é fixo, não precisa de cálculo adicional
    }
}