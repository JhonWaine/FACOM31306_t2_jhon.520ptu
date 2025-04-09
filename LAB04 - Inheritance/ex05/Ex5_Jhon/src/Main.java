import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Criando arrays para cada tipo de funcionário
        Chefe[] chefes = new Chefe[2];
        Vendedor[] vendedores = new Vendedor[2];
        Operario[] operarios = new Operario[2];
        Horista[] horistas = new Horista[2];

        // Instanciando chefes
        chefes[0] = new Chefe("João Silva", new Date(), 10000);
        chefes[1] = new Chefe("Maria Oliveira", new Date(), 12000);

        // Instanciando vendedores
        vendedores[0] = new Vendedor("Carlos Souza", new Date(), 2000, 50, 100);
        vendedores[1] = new Vendedor("Ana Costa", new Date(), 2500, 60, 150);

        // Instanciando operários
        operarios[0] = new Operario("Pedro Rocha", new Date(), 15, 500);
        operarios[1] = new Operario("Luiza Mendes", new Date(), 20, 600);

        // Instanciando horistas
        horistas[0] = new Horista("Fernando Lima", new Date(), 30, 160);
        horistas[1] = new Horista("Patricia Alves", new Date(), 35, 180);

        // Calculando e exibindo salários
        for (Chefe chefe : chefes) {
            chefe.calcularSalario();
            System.out.println("Chefe: " + chefe.getNome() + " - Salário: " + chefe.getSalario());
        }

        for (Vendedor vendedor : vendedores) {
            vendedor.calcularSalario();
            System.out.println("Vendedor: " + vendedor.getNome() + " - Salário: " + vendedor.getSalario());
        }

        for (Operario operario : operarios) {
            operario.calcularSalario();
            System.out.println("Operário: " + operario.getNome() + " - Salário: " + operario.getSalario());
        }

        for (Horista horista : horistas) {
            horista.calcularSalario();
            System.out.println("Horista: " + horista.getNome() + " - Salário: " + horista.getSalario());
        }
        System.out.println("Jhon Waine Mendes Gonçalves 12021BCC028");

    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD