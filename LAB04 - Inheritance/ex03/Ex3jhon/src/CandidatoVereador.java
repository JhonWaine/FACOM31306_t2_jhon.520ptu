public class CandidatoVereador extends Candidato {
    // Atributos específicos para vereador
    private String numeroCandidato; // Usando String para número de três dígitos
    private String bairro;

    // Construtor padrão
    public CandidatoVereador(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String numeroCandidato, String bairro) {
        // Chama o construtor da superclasse (Candidato)
        super(nomeCompleto, dataNascimento, genero, totalBens, candidatoReeleicao, numeroPartido);
        this.numeroCandidato = numeroCandidato;
        this.bairro = bairro;
    }

    // Novo construtor que recebe um objeto Candidato e os atributos específicos de vereador
    public CandidatoVereador(Candidato candidato, String numeroCandidato, String bairro) {
        // Chama o construtor da superclasse usando os getters do objeto Candidato
        super(candidato.getNomeCompleto(), candidato.getDataNascimento(), candidato.getGenero(), candidato.getTotalBens(), candidato.isCandidatoReeleicao(), candidato.getNumeroPartido());
        this.numeroCandidato = numeroCandidato;
        this.bairro = bairro;
    }

    // Método toString para exibir os dados específicos de vereador
    @Override
    public String toString() {
        return "Candidato a Vereador:\n" +
                super.toString() + // Chama o toString da superclasse
                "Número do Candidato: " + numeroCandidato + "\n" +
                "Bairro: " + bairro + "\n";
    }
}