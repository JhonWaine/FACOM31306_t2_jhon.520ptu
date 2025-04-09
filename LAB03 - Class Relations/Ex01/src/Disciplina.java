class Disciplina {
    private String nome;
    private Professor professor; // Associação com a classe Professor

    // Construtor
    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo professor
    public Professor getProfessor() {
        return professor;
    }

    // Setter para o atributo professor
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}