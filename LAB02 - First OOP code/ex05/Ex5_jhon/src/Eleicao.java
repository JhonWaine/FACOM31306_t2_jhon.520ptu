import java.util.List;

public class Eleicao {
    // Atributos privados
    private String nomeMunicipio;
    private int numeroVotantes;
    private List<Candidato> candidatos;
    private String dataEleicao;
    private String zonaEleitoral;

    // Construtor para inicializar os atributos
    public Eleicao(String nomeMunicipio, int numeroVotantes, List<Candidato> candidatos, String dataEleicao, String zonaEleitoral) {
        this.nomeMunicipio = nomeMunicipio;
        this.numeroVotantes = numeroVotantes;
        this.candidatos = candidatos;
        this.dataEleicao = dataEleicao;
        this.zonaEleitoral = zonaEleitoral;
    }

    // Métodos getters para acessar os atributos
    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public int getNumeroVotantes() {
        return numeroVotantes;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public String getDataEleicao() {
        return dataEleicao;
    }

    public String getZonaEleitoral() {
        return zonaEleitoral;
    }

    // Método para exibir informações da eleição
    public void exibirInformacoes() {
        System.out.println("Informações da Eleição:");
        System.out.println("----------------------");
        System.out.println("Município: " + nomeMunicipio);
        System.out.println("Número de Votantes: " + numeroVotantes);
        System.out.println("Data da Eleição: " + dataEleicao);
        System.out.println("Zona Eleitoral: " + zonaEleitoral);
        System.out.println("Candidatos:");
        for (Candidato candidato : candidatos) {
            candidato.exibirInformacoes();
        }
        System.out.println(); // Linha em branco para separar as eleições
    }
}