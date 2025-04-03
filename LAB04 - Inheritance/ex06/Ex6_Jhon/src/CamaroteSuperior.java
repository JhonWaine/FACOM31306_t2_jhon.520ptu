class CamaroteSuperior extends VIP {
    private double valorAdicionalCamarote;

    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicionalCamarote) {
        super(valor, valorAdicional);
        this.valorAdicionalCamarote = valorAdicionalCamarote;
    }

    public double getValorCamaroteSuperior() {
        return getValorVIP() + valorAdicionalCamarote;
    }

    @Override
    public void escreveValor() {
        System.out.println("Valor do ingresso Camarote Superior: R$ " + getValorCamaroteSuperior());
    }
}