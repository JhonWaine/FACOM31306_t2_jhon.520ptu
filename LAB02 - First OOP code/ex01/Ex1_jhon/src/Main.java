public class Main {
    public static void main(String[] args) {
        // Instanciando os três candidatos
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

        // Exibindo as informações dos candidatos


        System.out.println("Informações dos Candidatos:");
        System.out.println("--------------------------");
        candidato1.exibirInformacoes();
        candidato2.exibirInformacoes();
        candidato3.exibirInformacoes();
        System.out.println(); // Linha em branco
        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }
// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD
}