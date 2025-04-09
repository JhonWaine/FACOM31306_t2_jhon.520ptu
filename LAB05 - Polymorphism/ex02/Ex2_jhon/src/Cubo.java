public class Cubo extends FormaTridimensional {
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double obterArea() {
        return 6 * aresta * aresta;
    }

    @Override
    public double obterVolume() {
        return Math.pow(aresta, 3);
    }

    @Override
    public String obterDescricao() {
        return "Cubo de aresta " + aresta + " - " + super.obterDescricao();
    }
}