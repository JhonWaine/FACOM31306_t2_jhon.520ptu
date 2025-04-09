class Amigos extends Contato {
    int grau;

    public Amigos(String apelido, String nome, String email, String aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        String grauAmizade = "";
        switch(grau) {
            case 1: grauAmizade = "Melhor amigo"; break;
            case 2: grauAmizade = "Amigo"; break;
            case 3: grauAmizade = "Conhecido"; break;
        }

        return "Tipo: Amigo\n" +
                imprimirBasico() + "\n" +
                "Grau de amizade: " + grauAmizade;
    }
}