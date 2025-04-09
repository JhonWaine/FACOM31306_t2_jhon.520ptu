public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo;
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhaDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhaDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteMestrado{" +
                "tipo='" + tipo + '\'' +
                ", tituloDissertacao='" + tituloDissertacao + '\'' +
                '}');
    }

    // (d) Método sobrecarregado
    public void print(boolean mesmaLinha) {
        super.print(mesmaLinha);
        if (mesmaLinha) {
            System.out.print("; Tipo: " + tipo + "; Título Dissertação: " + tituloDissertacao);
        } else {
            System.out.println("Tipo: " + tipo);
            System.out.println("Título Dissertação: " + tituloDissertacao);
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
}