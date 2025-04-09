class UsaBanco {
    public static void main(String[] args) {
        // Criando contas especiais
        ContaEspecial conta1 = new ContaEspecial(1000, 12345, 1111, 500);
        ContaEspecial conta2 = new ContaEspecial(2000, 54321, 2222, 1000);

        // Testando operações
        System.out.println("Saldo conta1: " + conta1.getSaldo(1111));
        System.out.println("Debitando 1200 da conta1: " + conta1.debitaValor(1200, 1111));
        System.out.println("Novo saldo conta1: " + conta1.getSaldo(1111));

        System.out.println("\nSaldo conta2: " + conta2.getSaldo(2222));
        System.out.println("Debitando 2500 da conta2: " + conta2.debitaValor(2500, 2222));
        System.out.println("Novo saldo conta2: " + conta2.getSaldo(2222));

        System.out.println("\n");
        System.out.println("Auno: Jhon Waine Mendes Gonçalves 12021BCC028:");
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD