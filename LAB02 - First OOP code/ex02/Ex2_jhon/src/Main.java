public class Main {
    public static void main(String[] args) {
        // Instanciando os três candidatos
        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
        Candidato candidato3 = new Candidato();

        // Atribuindo valores aos atributos do primeiro candidato
        candidato1.setNomeCompleto("FAGNER JOAQUIM DE ANDRADE");
        candidato1.setDataNascimento("12/10/1986");
        candidato1.setGenero("Masculino");
        candidato1.setTotalBens(1369637.00);
        candidato1.setCandidatoReeleicao(false);
        candidato1.setNumeroPartido(40);
        candidato1.setCargoPretendido("Prefeito");

        // Atribuindo valores aos atributos do segundo candidato
        candidato2.setNomeCompleto("IGOR PEREIRA DOS SANTOS");
        candidato2.setDataNascimento("09/02/1997");
        candidato2.setGenero("Masculino");
        candidato2.setTotalBens(181658.35);
        candidato2.setCandidatoReeleicao(true);
        candidato2.setNumeroPartido(44);
        candidato2.setCargoPretendido("Prefeito");

        // Atribuindo valores aos atributos do terceiro candidato
        candidato3.setNomeCompleto("OLAVO REMIGIO CONDÉ");
        candidato3.setDataNascimento("14/02/1957");
        candidato3.setGenero("Masculino");
        candidato3.setTotalBens(15056602.62);
        candidato3.setCandidatoReeleicao(false);
        candidato3.setNumeroPartido(45);
        candidato3.setCargoPretendido("Prefeito");

        // Exibindo as informações dos candidatos
        System.out.println("Informações dos Candidatos:");
        System.out.println("--------------------------");
        candidato1.exibirInformacoes();
        candidato2.exibirInformacoes();
        candidato3.exibirInformacoes();
        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }

    // Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD
}