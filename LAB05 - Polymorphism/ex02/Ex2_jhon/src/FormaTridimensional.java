public abstract class FormaTridimensional extends Forma {
    public abstract double obterArea();
    public abstract double obterVolume();

    @Override
    public String obterDescricao() {
        return "Forma Tridimensional - Área: " + String.format("%.2f", obterArea()) +
                ", Volume: " + String.format("%.2f", obterVolume());
    }
}