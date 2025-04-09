import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando 5 candidatos para o município
        Candidato candidato1 = new Candidato(
                "FAGNER JOAQUIM DE ANDRADE",
                "12/10/1986",
                "Masculino",
                1369637.00,
                false,
                40,
                "Prefeito"
        );

        Candidato candidato2 = new Candidato(
                "IGOR PEREIRA DOS SANTOS",
                "09/02/1997",
                "Masculino",
                181658.35,
                true,
                44,
                "Prefeito"
        );

        Candidato candidato3 = new Candidato(
                "OLAVO REMIGIO CONDÉ",
                "14/02/1957",
                "Masculino",
                15056602.62,
                false,
                45,
                "Prefeito"
        );

        Candidato candidato4 = new Candidato(
                "MARIA SILVA",
                "20/05/1980",
                "Feminino",
                500000.00,
                true,
                12,
                "Prefeito"
        );

        Candidato candidato5 = new Candidato(
                "JOSÉ CARLOS",
                "10/08/1975",
                "Masculino",
                1200000.00,
                false,
                15,
                "Prefeito"
        );

        // Lista de candidatos para o município
        List<Candidato> candidatosMunicipio = Arrays.asList(candidato1, candidato2, candidato3, candidato4, candidato5);

        // Instanciando a eleição
        Eleicao eleicao = new Eleicao(
                "São João da Fronteira",
                50000,
                candidatosMunicipio,
                "15/11/2023",
                "Zona 001"
        );

        // Exibindo informações da eleição
        eleicao.exibirInformacoes();

        // Encontrando o candidato mais rico
        Candidato candidatoMaisRico = eleicao.encontrarCandidatoMaisRico();
        System.out.println("Candidato com o maior valor de bens:");
        candidatoMaisRico.exibirInformacoes();

        // Calculando o percentual de bens do candidato mais rico
        double percentualBens = eleicao.calcularPercentualBens(candidatoMaisRico);
        System.out.println("Percentual de bens do candidato mais rico em relação aos outros candidatos: " + String.format("%.2f", percentualBens) + "%");

        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }

    // Todos os direitos reservados a Jhon Waine Mendes Gonçalves LTD
}