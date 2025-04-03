class C2 extends C1 {
    public int atributoPublicoC2;
    protected int atributoProtegidoC2;
    private int atributoPrivadoC2;

    // Construtor padrão sem parâmetros
    public C2() {
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    // Construtor com parâmetros
    public C2(int atributoPublicoC2, int atributoProtegidoC2, int atributoPrivadoC2) {
        this.atributoPublicoC2 = atributoPublicoC2;
        this.atributoProtegidoC2 = atributoProtegidoC2;
        this.atributoPrivadoC2 = atributoPrivadoC2;
        System.out.println("Classe C2: chamada do construtor com parametros");
    }

    // Método para mostrar atributos sem usar super
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Atributos da classe C2:");
        System.out.println("public: " + atributoPublicoC2);
        System.out.println("protected: " + atributoProtegidoC2);
        System.out.println("private: " + atributoPrivadoC2);
    }

    // Método para mostrar atributos usando super
    @Override
    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
        System.out.println("Atributos da classe C2:");
        System.out.println("public: " + atributoPublicoC2);
        System.out.println("protected: " + atributoProtegidoC2);
        System.out.println("private: " + atributoPrivadoC2);
    }
}