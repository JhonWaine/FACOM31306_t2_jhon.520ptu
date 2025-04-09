public class CandidatoVereador {
    // Atributos comuns
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean candidatoReeleicao;
    private int numeroPartido;

    // Atributos específicos para vereador
    private String numeroCandidato; // Usando String para número de três dígitos
    private String bairro;

    // Construtor
    public CandidatoVereador(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String numeroCandidato, String bairro) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.candidatoReeleicao = candidatoReeleicao;
        this.numeroPartido = numeroPartido;
        this.numeroCandidato = numeroCandidato;
        this.bairro = bairro;
    }

    // Método toString para exibir os dados
    @Override
    public String toString() {
        return "Candidato a Vereador:\n" +
                "Nome Completo: " + nomeCompleto + "\n" +
                "Data de Nascimento: " + dataNascimento + "\n" +
                "Gênero: " + genero + "\n" +
                "Total de Bens: R$ " + String.format("%,.2f", totalBens) + "\n" +
                "Candidato a reeleição: " + (candidatoReeleicao ? "Sim" : "Não") + "\n" +
                "Número do Partido: " + numeroPartido + "\n" +
                "Número do Candidato: " + numeroCandidato + "\n" +
                "Bairro: " + bairro + "\n";
    }
}