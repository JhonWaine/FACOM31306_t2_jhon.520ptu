import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Método alteraPreco
    // Desc: modifica o preço de um produto
    // Entrada:
    //    preco: preço do produto (passado por referência)
    //    porcentagem: valor percentual a ser alterado, podendo
    //    ser negativo para diminuir valores
    // Retorno:
    //    true - sucesso
    //    false - erro
    public static boolean alteraPreco(float[] preco, int index, float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100;
            preco[index] *= temp;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Configuração de locale para lidar com números decimais
        scanner.useLocale(Locale.US);
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("\nInforme o nome do produto:");
                nome[i] = scanner.next();

                System.out.println("Informe o preço do produto (usar ponto para decimais, ex: 10.5):");
                while (!scanner.hasNextFloat()) {
                    System.out.println("Valor inválido para preço. Tente novamente (exemplo: 10.5):");
                    scanner.next();
                }
                preco[i] = scanner.nextFloat();

                System.out.println("Informe a quantidade em estoque:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Valor inválido para quantidade em estoque. Tente novamente:");
                    scanner.next();
                }
                qtdEstoque[i] = scanner.nextInt();

            } catch (Exception e) {
                System.out.println("Erro ao processar os dados do produto. Por favor, tente novamente.");
                scanner.nextLine(); // Limpa o buffer do scanner para evitar loops infinitos
                i--; // Recomeça a entrada para o mesmo índice
            }
        }

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        if (!alteraPreco(preco, 0, -110)) {
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        }
        alteraPreco(preco, 2, 10);

        System.out.println("\nReduzindo o preco em 5% do produto 2");
        if (!alteraPreco(preco, 1, -5)) {
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        } else {
            System.out.println("Preco alterado com sucesso");
        }

        System.out.println("\nAlterando o preco do prod. 3");
        if (!alteraPreco(preco, 3, -110)) {
            System.out.println("Erro: preco nao alterado. Porcentagem invalida");
        }

        System.out.println("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d\n", nome[i], preco[i], qtdEstoque[i]);
        }

        scanner.close();
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD