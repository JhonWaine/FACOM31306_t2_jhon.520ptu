import java.util.Date;
class Funcionario {
    private String nome;
    private Date dataNascimento;
    protected double salario;

    public Funcionario(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularSalario() {
        // Método genérico, será sobrescrito nas subclasses
    }
}