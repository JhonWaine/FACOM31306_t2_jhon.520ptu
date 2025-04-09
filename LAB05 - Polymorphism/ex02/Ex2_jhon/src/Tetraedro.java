public class Tetraedro extends FormaTridimensional {
    private double aresta;

    public Tetraedro(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double obterArea() {
        return Math.pow(aresta, 2) * Math.sqrt(3);
    }

    @Override
    public double obterVolume() {
        double areaBase = (Math.pow(aresta, 2) * Math.sqrt(3)) / 4;
        double altura = aresta * Math.sqrt(6) / 3;
        return (1.0/3.0) * areaBase * altura;
    }

    @Override
    public String obterDescricao() {
        return "Tetraedro de aresta " + aresta + " - " + super.obterDescricao();
    }
}