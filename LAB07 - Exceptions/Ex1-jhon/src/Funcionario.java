class Funcionario {
    private String cpf;
    private String nome;
    private double salario;
    private static double tetoSalarial = 40000.0;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws TetoSalarialExcecao {
        if (salario < 0) {
            throw new TetoSalarialExcecao("Valor inválido de salário");
        }
        if (salario > tetoSalarial) {
            throw new TetoSalarialExcecao("Valor ultrapassa o teto");
        }
        this.salario = salario;
    }

    // Métodos para o teto salarial
    public static double getTetoSalarial() {
        return tetoSalarial;
    }

    public static void setTetoSalarial(double novoTeto) {
        tetoSalarial = novoTeto;
    }

    // Método para aumentar o salário
    public void aumentarSalario(double percentual) throws TetoSalarialExcecao {
        double novoSalario = salario * (1 + percentual / 100);
        setSalario(novoSalario);
    }
}