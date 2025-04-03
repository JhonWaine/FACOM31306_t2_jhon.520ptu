public class Candidato {
    // Atributos privados
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean candidatoReeleicao;
    private int numeroPartido;
    private String cargoPretendido;

    // Métodos setters para modificar os atributos
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTotalBens(double totalBens) {
        this.totalBens = totalBens;
    }

    public void setCandidatoReeleicao(boolean candidatoReeleicao) {
        this.candidatoReeleicao = candidatoReeleicao;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }

    // Métodos getters para acessar os atributos
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

    public String getCargoPretendido() {
        return cargoPretendido;
    }

    // Método para exibir informações do candidato
    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Gênero: " + genero);
        System.out.println("Total de Bens: R$ " + String.format("%,.2f", totalBens));
        System.out.println("Candidato a reeleição: " + (candidatoReeleicao ? "Sim" : "Não"));
        System.out.println("Número do Partido: " + numeroPartido);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println(); // Linha em branco para separar os candidatos
    }
}