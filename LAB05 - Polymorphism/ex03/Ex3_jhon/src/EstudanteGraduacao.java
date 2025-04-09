public class EstudanteGraduacao extends Estudante {
    private String tituloTCC;

    public EstudanteGraduacao(String nome, String endereco, String tituloTCC) {
        super(nome, endereco);
        this.tituloTCC = tituloTCC;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteGraduacao{" +
                "tituloTCC='" + tituloTCC + '\'' +
                '}');
    }

    // (d) Método sobrecarregado
    public void print(boolean mesmaLinha) {
        super.print(mesmaLinha);
        if (mesmaLinha) {
            System.out.println("; Título TCC: " + tituloTCC);
        } else {
            System.out.println("Título TCC: " + tituloTCC);
        }
    }

    public String getTituloTCC() {
        return tituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        this.tituloTCC = tituloTCC;
    }
}