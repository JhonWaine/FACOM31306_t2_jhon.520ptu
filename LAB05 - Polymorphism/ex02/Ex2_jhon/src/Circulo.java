public class Circulo extends FormaBidimensional {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String obterDescricao() {
        return "Círculo de raio " + raio + " - " + super.obterDescricao();
    }
}