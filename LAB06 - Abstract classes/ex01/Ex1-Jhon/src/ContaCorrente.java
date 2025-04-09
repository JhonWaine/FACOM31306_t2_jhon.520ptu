public class ContaCorrente {
    private float saldo;
    private int estado; // 1=conta ativa 2=conta inativa
    private int numConta;
    private int senha;

    public ContaCorrente(float val, int num, int pwd) {
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1; // conta ativa
    }

    public boolean debitaValor(float val, int pwd) {
        if (pwd != senha)
            return false; // senha deve ser válida
        if (estado != 1)
            return false; // conta deve ser ativa
        if (val <= 0)
            return false; // val > 0
        if (val > saldo)
            return false;

        saldo -= val;
        if (saldo == 0)
            estado = 2; // torna conta inativa
        return true;
    }

    public void debitaValor(float val) {
        saldo -= val;
    }

    public float getSaldo(int pwd) {
        if (senha == pwd)
            return saldo;
        else
            return -1; // indicando que houve problema na senha
    }

    public void creditaValor(int pwd, float val) {
        if (senha == pwd)
            saldo += val;
    }

    protected int getEstado(int pwd) {
        if (senha == pwd)
            return estado;
        else
            return -1;
    }

    protected void setEstado(int pwd, int e) {
        if (senha == pwd)
            estado = e;
    }

    protected boolean isSenha(int pwd) {
        return senha == pwd;
    }

    public static void main(String[] args) {
        // Criando uma conta corrente
        ContaCorrente conta = new ContaCorrente(1000.0f, 12345, 1234);

        // Testando operações
        System.out.println("Saldo inicial: " + conta.getSaldo(1234));

        // Tentando debitar com senha errada
        boolean sucesso = conta.debitaValor(200.0f, 9999);
        System.out.println("Débito com senha errada: " + (sucesso ? "Sucesso" : "Falha"));

        // Débito com senha correta
        sucesso = conta.debitaValor(200.0f, 1234);
        System.out.println("Débito de 200: " + (sucesso ? "Sucesso" : "Falha"));
        System.out.println("Novo saldo: " + conta.getSaldo(1234));

        // Crédito na conta
        conta.creditaValor(1234, 500.0f);
        System.out.println("Saldo após crédito de 500: " + conta.getSaldo(1234));

        // Tentando debitar valor maior que saldo
        sucesso = conta.debitaValor(2000.0f, 1234);
        System.out.println("Débito de 2000: " + (sucesso ? "Sucesso" : "Falha"));

        // Zerando a conta (deve inativar)
        sucesso = conta.debitaValor(conta.getSaldo(1234), 1234);
        System.out.println("Zerando conta: " + (sucesso ? "Sucesso" : "Falha"));
        System.out.println("Estado da conta: " + (conta.getEstado(1234) == 1 ? "Ativa" : "Inativa"));

        // Tentando operar com conta inativa
        sucesso = conta.debitaValor(100.0f, 1234);
        System.out.println("Débito em conta inativa: " + (sucesso ? "Sucesso" : "Falha"));
    }
}