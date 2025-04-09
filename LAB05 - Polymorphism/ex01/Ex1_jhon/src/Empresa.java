import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args) {
        // Criando um array de Funcionarios (usando polimorfismo)
        Funcionario[] funcionarios = new Funcionario[4];

        // Preenchendo o array com diferentes tipos de funcionários
        funcionarios[0] = new Chefe("João Silva", LocalDate.of(1980, 5, 15), 8500.00);
        funcionarios[1] = new Vendedor("Maria Souza", LocalDate.of(1990, 8, 22), 1500.00, 50.00, 120);
        funcionarios[2] = new Operario("Carlos Oliveira", LocalDate.of(1985, 3, 10), 15.50, 350);
        funcionarios[3] = new Horista("Ana Costa", LocalDate.of(1995, 11, 5), 45.00, 160);

        // Criando e usando a folha de pagamento
        FolhaPagamento folha = new FolhaPagamento();
        folha.imprimirFolha(funcionarios);
    }
}