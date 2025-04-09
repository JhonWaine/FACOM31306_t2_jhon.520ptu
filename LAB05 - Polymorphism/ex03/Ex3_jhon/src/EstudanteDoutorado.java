public class EstudanteDoutorado extends EstudantePosGrad {
    private String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhaDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhaDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');
    }

    // (d) Método sobrecarregado
    public void print(boolean mesmaLinha) {
        super.print(mesmaLinha);
        if (mesmaLinha) {
            System.out.print("; Título Tese: " + tituloTese);
        } else {
            System.out.println("Título Tese: " + tituloTese);
        }
    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}