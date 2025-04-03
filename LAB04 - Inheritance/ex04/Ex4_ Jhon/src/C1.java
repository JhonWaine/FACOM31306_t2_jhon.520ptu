class C1 {
    public int atributoPublicoC1;
    protected int atributoProtegidoC1;
    private int atributoPrivadoC1;

    // Construtor padrão sem parâmetros
    public C1() {
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    // Construtor com parâmetros
    public C1(int atributoPublicoC1, int atributoProtegidoC1, int atributoPrivadoC1) {
        this.atributoPublicoC1 = atributoPublicoC1;
        this.atributoProtegidoC1 = atributoProtegidoC1;
        this.atributoPrivadoC1 = atributoPrivadoC1;
        System.out.println("Classe C1: chamada do construtor com parametros");
    }

    // Método para mostrar atributos sem usar super
    public void mostrarAtributos() {
        System.out.println("Atributos da classe C1:");
        System.out.println("public: " + atributoPublicoC1);
        System.out.println("protected: " + atributoProtegidoC1);
        System.out.println("private: " + atributoPrivadoC1);
    }

    // Método para mostrar atributos usando super
    public void mostrarAtributosSuper() {
        mostrarAtributos();
    }
}