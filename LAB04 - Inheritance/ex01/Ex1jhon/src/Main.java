public class Main {
    public static void main(String[] args) {
        // Criando um candidato a prefeito
        CandidatoPrefeito prefeito = new CandidatoPrefeito(
                "FAGNER JOAQUIM DE ANDRADE",
                "12/10/1986",
                "Masculino",
                1369637.00,
                false,
                40,
                "IGOR PEREIRA DOS SANTOS",
                "Partido da Cidadania"
        );

        // Criando um candidato a vereador
        CandidatoVereador vereador = new CandidatoVereador(
                "OLAVO REMIGIO CONDÉ",
                "14/02/1957",
                "Masculino",
                15056602.62,
                false,
                45,
                "123",
                "Centro"
        );

        // Exibindo os dados dos candidatos
        System.out.println(prefeito.toString());
        System.out.println(vereador.toString());

        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD