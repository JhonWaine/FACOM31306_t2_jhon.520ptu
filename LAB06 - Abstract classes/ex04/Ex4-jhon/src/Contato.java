abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contato(String apelido, String nome, String email, String aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprimirBasico() {
        return "Apelido: " + apelido + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Aniversário: " + aniversario;
    }

    public abstract String imprimirContato();
}