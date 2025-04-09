public class Candidato {
    // Atributos comuns (agora protected para serem acessados pelas classes filhas)
    protected String nomeCompleto;
    protected String dataNascimento;
    protected String genero;
    protected double totalBens;
    protected boolean candidatoReeleicao;
    protected int numeroPartido;

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
}