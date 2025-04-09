public class EstudantePosGrad extends Estudante {
    private String formacao;
    private String linhaDePesquisa;

    public EstudantePosGrad(String nome, String endereco, String formacao, String linhaDePesquisa) {
        super(nome, endereco);
        this.formacao = formacao;
        this.linhaDePesquisa = linhaDePesquisa;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudantePosGrad{" +
                "formacao='" + formacao + '\'' +
                ", linhaDePesquisa='" + linhaDePesquisa + '\'' +
                '}');
    }

    // (d) Método sobrecarregado
    public void print(boolean mesmaLinha) {
        super.print(mesmaLinha);
        if (mesmaLinha) {
            System.out.print("; Formação: " + formacao + "; Linha de Pesquisa: " + linhaDePesquisa);
        } else {
            System.out.println("Formação: " + formacao);
            System.out.println("Linha de Pesquisa: " + linhaDePesquisa);
        }
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getLinhaDePesquisa() {
        return linhaDePesquisa;
    }

    public void setLinhaDePesquisa(String linhaDePesquisa) {
        this.linhaDePesquisa = linhaDePesquisa;
    }
}