import java.util.Scanner;

public class Exemplo04 {

    // Função altera_preco
    // Desc: modifica o preço de um *produto*
    // Entrada:
    //    preco: preço do produto
    //    porcentagem: valor percentual a ser alterado, podendo
    //    ser negativo para diminuir valores
    // Retorno:
    //    0 - sucesso
    //    -1 - erro
    public static int alteraPreco(float[] preco, int index, float porcentagem) {
        if (porcentagem > -100) {
            float temp = 1 + porcentagem / 100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
            preco[index] = preco[index] * temp;  // preço modificado
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto " + (i + 1) + ":");
            nome[i] = scanner.next();
            preco[i] = scanner.nextFloat();
            qtdEstoque[i] = scanner.nextInt();
        }

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        alteraPreco(preco, 0, -110);
        alteraPreco(preco, 2, 10);

        preco[0] = preco[0] * -110;
        System.out.println("\nReduzindo o preco em 5% do produto 2");
        if (alteraPreco(preco, 1, -5) == -1) {
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        } else {
            System.out.println("\n\n Preco alterado com sucesso");
        }

        System.out.println("\nAlterando o preco do prod. 3");
        if (alteraPreco(preco, 3, -110) == -1) {
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        }

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nProduto: " + nome[i] + "\nPreco: " + preco[i] + "\nEstoque: " + qtdEstoque[i]);
        }

        scanner.close();
    }
}