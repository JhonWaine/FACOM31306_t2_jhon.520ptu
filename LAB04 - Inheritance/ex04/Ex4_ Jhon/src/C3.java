class C3 extends C2 {
    public int atributoPublicoC3;
    protected int atributoProtegidoC3;
    private int atributoPrivadoC3;

    // Construtor padrão sem parâmetros
    public C3() {
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    // Construtor com parâmetros
    public C3(int atributoPublicoC3, int atributoProtegidoC3, int atributoPrivadoC3) {
        this.atributoPublicoC3 = atributoPublicoC3;
        this.atributoProtegidoC3 = atributoProtegidoC3;
        this.atributoPrivadoC3 = atributoPrivadoC3;
        System.out.println("Classe C3: chamada do construtor com parametros");
    }

    // Construtor que usa super para chamar o construtor da classe C2 com parâmetro
    public C3(int atributoPublicoC2, int atributoProtegidoC2, int atributoPrivadoC2,
              int atributoPublicoC3, int atributoProtegidoC3, int atributoPrivadoC3) {
        super(atributoPublicoC2, atributoProtegidoC2, atributoPrivadoC2);
        this.atributoPublicoC3 = atributoPublicoC3;
        this.atributoProtegidoC3 = atributoProtegidoC3;
        this.atributoPrivadoC3 = atributoPrivadoC3;
        System.out.println("Classe C3: chamada do construtor com parametros e super");
    }

    // Método para mostrar atributos sem usar super
    @Override
    public void mostrarAtributos() {
        super.mostrarAtributos();
        System.out.println("Atributos da classe C3:");
        System.out.println("public: " + atributoPublicoC3);
        System.out.println("protected: " + atributoProtegidoC3);
        System.out.println("private: " + atributoPrivadoC3);
    }

    // Método para mostrar atributos usando super
    @Override
    public void mostrarAtributosSuper() {
        super.mostrarAtributosSuper();
        System.out.println("Atributos da classe C3:");
        System.out.println("public: " + atributoPublicoC3);
        System.out.println("protected: " + atributoProtegidoC3);
        System.out.println("private: " + atributoPrivadoC3);
    }
}