public class Cliente implements Classificavel {
    private String nome;
    private int idade;
    private String cpf;

    public Cliente(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        Cliente compara = (Cliente) obj;
        return this.nome.compareTo(compara.nome) < 0;
    }

    @Override
    public String toString() {
        return "Cliente{nome='" + nome + "', idade=" + idade + ", cpf='" + cpf + "'}";
    }
}