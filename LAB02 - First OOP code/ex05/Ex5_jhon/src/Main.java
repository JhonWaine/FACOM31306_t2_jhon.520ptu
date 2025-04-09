import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando candidatos para o primeiro município
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

        // Lista de candidatos para o primeiro município
        List<Candidato> candidatosMunicipio1 = Arrays.asList(candidato1, candidato2, candidato3);

        // Instanciando a primeira eleição
        Eleicao eleicao1 = new Eleicao(
                "São João da Fronteira",
                50000,
                candidatosMunicipio1,
                "15/11/2023",
                "Zona 001"
        );

        // Criando candidatos para o segundo município
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

        // Lista de candidatos para o segundo município
        List<Candidato> candidatosMunicipio2 = Arrays.asList(candidato4, candidato5);

        // Instanciando a segunda eleição
        Eleicao eleicao2 = new Eleicao(
                "Vila Nova",
                30000,
                candidatosMunicipio2,
                "15/11/2023",
                "Zona 002"
        );

        // Exibindo informações das eleições
        eleicao1.exibirInformacoes();
        eleicao2.exibirInformacoes();

        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }

    // Todos os direitos reservados a Jhon Waine Mendes Gonçalves LTD
}