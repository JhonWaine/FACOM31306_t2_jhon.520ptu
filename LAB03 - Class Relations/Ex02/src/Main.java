public class Main {
    public static void main(String[] args) {
        // Criando objetos independentes
        Professor professor1 = new Professor("Dr. Silva");
        Professor professor2 = new Professor("Dra. Costa");

        // Criando disciplinas associadas a professores
        Disciplina disciplina1 = new Disciplina("Matemática", professor1);
        Disciplina disciplina2 = new Disciplina("Física", professor2);

        // Vetor de disciplinas para o departamento
        Disciplina[] disciplinas = {disciplina1, disciplina2};

        // Criando um departamento que agrega as disciplinas
        Departamento departamento = new Departamento("Ciências Exatas", disciplinas);

        // Exibindo informações do departamento
        departamento.exibirInformacoes();
        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028:");
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD