public class Estudante implements Comparable<Estudante> {
    private String nome;
    private int matricula;

    public Estudante(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nome + " (matrícula: " + matricula + ")";
    }

    @Override
    public int compareTo(Estudante outro) {
        return this.nome.compareTo(outro.nome); // critério: ordem alfabética pelo nome
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Estudante)) return false;
        Estudante outro = (Estudante) obj;
        return this.nome.equals(outro.nome) && this.matricula == outro.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }
}
