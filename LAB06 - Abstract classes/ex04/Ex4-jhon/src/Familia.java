class Familia extends Contato {
    String parentesco;

    public Familia(String apelido, String nome, String email, String aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return "Tipo: Família\n" +
                imprimirBasico() + "\n" +
                "Parentesco: " + parentesco;
    }
}
