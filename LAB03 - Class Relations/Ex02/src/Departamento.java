class Departamento {
    private String nome;
    private Disciplina[] disciplinas; // Vetor para multiplicidade N

    // Construtor
    public Departamento(String nome, Disciplina[] disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    // Método para exibir informações do departamento e suas disciplinas
    public void exibirInformacoes() {
        System.out.println("Departamento: " + nome);
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(" - " + disciplina.getNome() + " (Professor: " + disciplina.getProfessor().getNome() + ")");
        }
        System.out.println("-----------------------------");
    }
}