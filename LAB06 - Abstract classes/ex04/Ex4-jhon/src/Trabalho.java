class Trabalho extends Contato {
    String tipo;

    public Trabalho(String apelido, String nome, String email, String aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return "Tipo: Colega de Trabalho\n" +
                imprimirBasico() + "\n" +
                "Tipo no trabalho: " + tipo;
    }
}