public class Candidato {
    // Atributos comuns (agora private)
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean candidatoReeleicao;
    private int numeroPartido;

    // Construtor da classe Candidato
    public Candidato(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.candidatoReeleicao = candidatoReeleicao;
        this.numeroPartido = numeroPartido;
    }

    // Método toString para exibir os dados comuns
    @Override
    public String toString() {
        return "Nome Completo: " + nomeCompleto + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Gênero: " + genero + "\n" +
                "Total de Bens: R$ " + String.format("%,.2f", totalBens) + "\n" +
                "Candidato a reeleição: " + (candidatoReeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numeroPartido + "\n";
    }

    // Getters para acessar os atributos privados
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public double getTotalBens() {
        return totalBens;
    }

    public boolean isCandidatoReeleicao() {
        return candidatoReeleicao;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }
}