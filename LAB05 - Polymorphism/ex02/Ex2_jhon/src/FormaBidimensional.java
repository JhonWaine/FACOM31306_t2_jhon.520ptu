public abstract class FormaBidimensional extends Forma {
    public abstract double obterArea();

    @Override
    public String obterDescricao() {
        return "Forma Bidimensional - Área: " + String.format("%.2f", obterArea());
    }
}