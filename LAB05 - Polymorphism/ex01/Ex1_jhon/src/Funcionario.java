import java.time.LocalDate;

public abstract class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private double salario;

    public Funcionario(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public abstract void calcularSalario();

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de Nascimento: " + dataNascimento +
                "\nSalário: R$ " + String.format("%.2f", salario);
    }
}