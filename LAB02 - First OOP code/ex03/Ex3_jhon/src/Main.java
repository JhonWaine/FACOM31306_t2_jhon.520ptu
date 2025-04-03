public class Main {
    public static void main(String[] args) {
        // Criando um vetor de candidatos com tamanho 3
        Candidato[] candidatos = new Candidato[3];

        // Instanciando e configurando o primeiro candidato
        candidatos[0] = new Candidato();
        candidatos[0].setNomeCompleto("FAGNER JOAQUIM DE ANDRADE");
        candidatos[0].setDataNascimento("12/10/1986");
        candidatos[0].setGenero("Masculino");
        candidatos[0].setTotalBens(1369637.00);
        candidatos[0].setCandidatoReeleicao(false);
        candidatos[0].setNumeroPartido(40);
        candidatos[0].setCargoPretendido("Prefeito");

        // Instanciando e configurando o segundo candidato
        candidatos[1] = new Candidato();
        candidatos[1].setNomeCompleto("IGOR PEREIRA DOS SANTOS");
        candidatos[1].setDataNascimento("09/02/1997");
        candidatos[1].setGenero("Masculino");
        candidatos[1].setTotalBens(181658.35);
        candidatos[1].setCandidatoReeleicao(true);
        candidatos[1].setNumeroPartido(44);
        candidatos[1].setCargoPretendido("Prefeito");

        // Instanciando e configurando o terceiro candidato
        candidatos[2] = new Candidato();
        candidatos[2].setNomeCompleto("OLAVO REMIGIO CONDÉ");
        candidatos[2].setDataNascimento("14/02/1957");
        candidatos[2].setGenero("Masculino");
        candidatos[2].setTotalBens(15056602.62);
        candidatos[2].setCandidatoReeleicao(false);
        candidatos[2].setNumeroPartido(45);
        candidatos[2].setCargoPretendido("Prefeito");

        // Exibindo informações com laço for tradicional
        System.out.println("Exibindo informações com laço for tradicional:");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < candidatos.length; i++) {
            candidatos[i].exibirInformacoes();
        }

        // Exibindo informações com enhanced-for (for-each)
        System.out.println("Exibindo informações com enhanced-for:");
        System.out.println("-------------------------------------");
        for (Candidato candidato : candidatos) {
            candidato.exibirInformacoes();
        }
        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }
    // Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD
}