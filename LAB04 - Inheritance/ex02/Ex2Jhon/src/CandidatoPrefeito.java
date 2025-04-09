public class CandidatoPrefeito extends Candidato {
    // Atributos específicos para prefeito
    private String nomeVice;
    private String partidoVice;

    // Construtor
    public CandidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String nomeVice, String partidoVice) {
        // Chama o construtor da superclasse (Candidato)
        super(nomeCompleto, dataNascimento, genero, totalBens, candidatoReeleicao, numeroPartido);
        this.nomeVice = nomeVice;
        this.partidoVice = partidoVice;
    }

    // Método toString para exibir os dados específicos de prefeito
    @Override
    public String toString() {
        return "Candidato a Prefeito:\n" +
                super.toString() + // Chama o toString da superclasse
                "Nome do Vice: " + nomeVice + "\n" +
                "Partido do Vice: " + partidoVice + "\n";
    }
}