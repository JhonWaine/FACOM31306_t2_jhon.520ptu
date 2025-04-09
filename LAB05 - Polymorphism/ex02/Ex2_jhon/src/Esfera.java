public class Esfera extends FormaTridimensional {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    @Override
    public double obterVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String obterDescricao() {
        return "Esfera de raio " + raio + " - " + super.obterDescricao();
    }
}