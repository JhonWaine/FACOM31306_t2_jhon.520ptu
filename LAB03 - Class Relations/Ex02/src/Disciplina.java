class Disciplina {
    private String nome;
    private Professor professor; // Agregação com a classe Professor

    // Construtor
    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}