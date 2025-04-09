public class Quadrado extends FormaBidimensional {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return lado * lado;
    }

    @Override
    public String obterDescricao() {
        return "Quadrado de lado " + lado + " - " + super.obterDescricao();
    }
}