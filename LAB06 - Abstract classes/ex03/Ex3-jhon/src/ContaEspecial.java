class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float lim) {
        super(val, num, pwd);
        limite = lim;
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha)
            return false;
        if (estado != 1)
            return false;
        if (val <= 0)
            return false;
        if (val > (saldo + limite))
            return false;

        saldo -= val;
        return true;
    }

    public float getLimite(int pwd) {
        if (senha == pwd)
            return limite;
        else
            return -1;
    }

    public void setLimite(int pwd, float lim) {
        if (senha == pwd)
            limite = lim;
    }
}