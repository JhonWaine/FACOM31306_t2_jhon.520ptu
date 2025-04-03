public class CandidatoPrefeito {
    // Atributos comuns
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean candidatoReeleicao;
    private int numeroPartido;

    // Atributos específicos para prefeito
    private String nomeVice;
    private String partidoVice;

    // Construtor
    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String nomeVice, String partidoVice) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.candidatoReeleicao = candidatoReeleicao;
        this.numeroPartido = numeroPartido;
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }

    // Método toString para exibir os dados
    @Override
    public String toString() {
        return "Candidato a Prefeito:\n" +
                "Nome Completo: " + nomeCompleto + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Gênero: " + genero + "\n" +
                "Total de Bens: R$ " + String.format("%,.2f", totalBens) + "\n" +
                "Candidato a reeleição: " + (candidatoReeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numeroPartido + "\n" +
                "Nome do Vice: " + nomeVice + "\n" +
                "Partido do Vice: " + partidoVice + "\n";
    }
}