public class Main {
    public static void main(String[] args) {
        // Criando endereços (partes)
        Endereco endereco1 = new Endereco("Rua A", "São Paulo");
        Endereco endereco2 = new Endereco("Rua B", "Rio de Janeiro");

        // Vetor de endereços para a pessoa
        Endereco[] enderecos = {endereco1, endereco2};

        // Criando uma pessoa (todo) que compõe os endereços (partes)
        Pessoa pessoa = new Pessoa("João Silva", enderecos);

        // Exibindo informações da pessoa
        pessoa.exibirInformacoes();

        // Removendo a pessoa (todo)
        pessoa = null; // O objeto pessoa é destruído

        // O que acontece com os endereços (partes)?
        // Em Java, os objetos Endereco serão elegíveis para coleta de lixo (garbage collection),
        // pois não há mais referências a eles após a pessoa ser destruída.
        System.out.println("Pessoa removida. Endereços também serão destruídos.");

        System.out.println("Auno: Jhon Waine Mendes Gonçalves 12021BCC028:");
    }// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD
}