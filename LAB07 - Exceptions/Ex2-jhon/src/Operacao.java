class Operacao {
    // Método que inicia a operação e trata possíveis exceções
    public void iniciarOperacao(int numerador, int denominador) {
        try {
            double resultado = calcular(numerador, denominador);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (DivisaoPorZeroException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    // Método que chama a divisão e pode propagar a exceção
    public double calcular(int numerador, int denominador) throws DivisaoPorZeroException {
        return dividir(numerador, denominador);
    }

    // Método que realiza a divisão e lança exceção se denominador for zero
    public double dividir(int numerador, int denominador) throws DivisaoPorZeroException {
        if (denominador == 0) {
            throw new DivisaoPorZeroException("Divisão por zero não é permitida!");
        }
        return (double) numerador / denominador;
    }
}