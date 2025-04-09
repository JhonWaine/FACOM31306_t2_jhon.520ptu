public class Main {
    public static void main(String[] args) {
        // Criando um vetor de formas (usando polimorfismo)
        Forma[] formas = new Forma[6];

        // Formas bidimensionais
        formas[0] = new Circulo(5.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Triangulo(3.0, 4.0);

        // Formas tridimensionais
        formas[3] = new Esfera(3.0);
        formas[4] = new Cubo(2.5);
        formas[5] = new Tetraedro(3.0);

        // Percorrendo o vetor e mostrando as informações
        for (Forma forma : formas) {
            System.out.println(forma.obterDescricao());

            if (forma instanceof FormaBidimensional) {
                FormaBidimensional forma2D = (FormaBidimensional) forma;
                System.out.println("Área: " + String.format("%.2f", forma2D.obterArea()));
            }
            else if (forma instanceof FormaTridimensional) {
                FormaTridimensional forma3D = (FormaTridimensional) forma;
                System.out.println("Volume: " + String.format("%.2f", forma3D.obterVolume()));
            }

            System.out.println("--------------------------");
        }
    }
}