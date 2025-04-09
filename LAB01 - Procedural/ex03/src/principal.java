import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        // ....
    }

    public static void main(String[] args) {
        //ex01(); o professor já fez


        //ex02(public class ListarVetorComLoop {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] valores = new int[6]; // Vetor para armazenar os 6 valores
        //
        //        System.out.println("<< Listando um vetor >>");
        //
        //        // Lendo os valores usando um loop for
        //        for (int i = 0; i < 6; i++) {
        //            System.out.print("Entre com o número " + (i + 1) + ": ");
        //            valores[i] = scanner.nextInt();
        //        }
        //
        //        // Exibindo os valores lidos
        //        System.out.print("\nOs valores lidos são: ");
        //        for (int i = 0; i < 6; i++) {
        //            System.out.print(valores[i] + " ");
        //        }
        //
        //        scanner.close();
        //    }
        //}
        //);



        //ex03( public class ListarVetorOrdemInversa {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] valores = new int[6]; // Vetor para armazenar os 6 valores
        //
        //        System.out.println("<< Listando um vetor em ordem inversa >>");
        //
        //        // Lendo os valores usando um loop for
        //        for (int i = 0; i < 6; i++) {
        //            System.out.print("Entre com o número " + (i + 1) + ": ");
        //            valores[i] = scanner.nextInt();
        //        }
        //
        //        // Exibindo os valores na ordem inversa
        //        System.out.print("\nA ordem inversa dos números é: ");
        //        for (int i = 5; i >= 0; i--) {
        //            System.out.print(valores[i] + " ");
        //        }
        //
        //        scanner.close();
        //    }
        //});



        //ex04(public class ListarVetorNumerosPares {
        //       public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] valores = new int[6]; // Vetor para armazenar os 6 valores pares
        //        int contador = 0; // Contador para controlar a posição no vetor
        //
        //        System.out.println("<< Listando um vetor de números pares >>");
        //
        //        // Loop para ler os 6 números pares
        //        while (contador < 6) {
        //            System.out.print("Entre com o número " + (contador + 1) + ": ");
        //            int numero = scanner.nextInt();
        //
        //            // Verifica se o número é par
        //            if (numero % 2 == 0) {
        //                valores[contador] = numero; // Armazena o número par no vetor
        //                contador++; // Incrementa o contador
        //            } else {
        //                System.out.println("Erro: Valor inválido");
        //            }
        //        }
        //
        //        // Exibindo os números pares digitados
        //        System.out.print("\nOs números pares digitados foram: ");
        //        for (int i = 0; i < 6; i++) {
        //            System.out.print(valores[i] + " ");
        //        }
        //
        //        scanner.close();
        //    }
        //});


        //ex05(public class CincoValores {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] valores = new int[5]; // Vetor para armazenar os 5 valores
        //        int soma = 0; // Variável para armazenar a soma dos valores
        //        int maior, menor; // Variáveis para armazenar o maior e o menor valor
        //
        //        System.out.println("<< 5 valores >>");
        //
        //        // Lendo os 5 valores
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print("Entre com o número " + (i + 1) + ": ");
        //            valores[i] = scanner.nextInt();
        //            soma += valores[i]; // Acumula a soma dos valores
        //        }
        //
        //        // Inicializando maior e menor com o primeiro valor do vetor
        //        maior = valores[0];
        //        menor = valores[0];
        //
        //        // Encontrando o maior e o menor valor
        //        for (int i = 1; i < 5; i++) {
        //            if (valores[i] > maior) {
        //                maior = valores[i];
        //            }
        //            if (valores[i] < menor) {
        //                menor = valores[i];
        //            }
        //        }
        //
        //        // Calculando a média
        //        double media = (double) soma / 5;
        //
        //        // Exibindo os resultados
        //        System.out.print("\nOs números digitados são: ");
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print(valores[i] + " ");
        //        }
        //
        //        System.out.println("\nO maior valor é: " + maior);
        //        System.out.println("O menor valor é: " + menor);
        //        System.out.println("A média é: " + media);
        //
        //        scanner.close();
        //    }
        //});


        //ex06(import java.util.Scanner;
        //
        //public class CincoValoresComIndice {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] valores = new int[5]; // Vetor para armazenar os 5 valores
        //        int soma = 0; // Variável para armazenar a soma dos valores
        //        int maior, menor; // Variáveis para armazenar o maior e o menor valor
        //        int indiceMaior = 0, indiceMenor = 0; // Variáveis para armazenar os índices do maior e menor valor
        //
        //        System.out.println("<< 5 valores >>");
        //
        //        // Lendo os 5 valores
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print("Entre com o número " + (i + 1) + ": ");
        //            valores[i] = scanner.nextInt();
        //            soma += valores[i]; // Acumula a soma dos valores
        //        }
        //
        //        // Inicializando maior e menor com o primeiro valor do vetor
        //        maior = valores[0];
        //        menor = valores[0];
        //
        //        // Encontrando o maior e o menor valor, e seus índices
        //        for (int i = 1; i < 5; i++) {
        //            if (valores[i] > maior) {
        //                maior = valores[i];
        //                indiceMaior = i;
        //            }
        //            if (valores[i] < menor) {
        //                menor = valores[i];
        //                indiceMenor = i;
        //            }
        //        }
        //
        //        // Calculando a média
        //        double media = (double) soma / 5;
        //
        //        // Exibindo os resultados
        //        System.out.print("\nOs números digitados são: ");
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print(valores[i] + " ");
        //        }
        //
        //        System.out.println("\nO maior valor é: " + maior + ", localizado na posição " + indiceMaior + " do vetor");
        //        System.out.println("O menor valor é: " + menor + ", localizado na posição " + indiceMenor + " do vetor");
        //        System.out.println("A média é: " + media);
        //
        //        scanner.close();
        //    }
        //});


        //ex07(import java.util.Scanner;
        //
        //public class NormalizarNotas {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        double[] notas = new double[5]; // Vetor para armazenar as notas dos 5 alunos
        //        double maiorNota = 0; // Variável para armazenar a maior nota
        //
        //        System.out.println("<<Normalizando as notas>>");
        //
        //        // Lendo as notas dos 5 alunos
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print("Entre com a nota do aluno " + (i + 1) + ": ");
        //            notas[i] = scanner.nextDouble();
        //
        //            // Atualizando a maior nota
        //            if (notas[i] > maiorNota) {
        //                maiorNota = notas[i];
        //            }
        //        }
        //
        //        // Normalizando as notas
        //        for (int i = 0; i < 5; i++) {
        //            notas[i] = (notas[i] / maiorNota) * 100;
        //        }
        //
        //        // Exibindo as notas normalizadas
        //        System.out.println("\nNotas normalizadas");
        //        for (int i = 0; i < 5; i++) {
        //            System.out.println("A nota do aluno " + (i + 1) + " é " + (int) notas[i]);
        //        }
        //
        //        scanner.close();
        //    }
        //});

        //ex08(import java.util.Scanner;
        //
        //public class MediaDesvioPadrao {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        double[] valores = new double[5]; // Vetor para armazenar os 5 valores
        //        double soma = 0; // Variável para armazenar a soma dos valores
        //        double media, desvioPadrao = 0;
        //
        //        System.out.println("<< Média e desvio-padrão >>");
        //
        //        // Lendo os 5 valores
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print("Digite o valor " + (i + 1) + ": ");
        //            valores[i] = scanner.nextDouble();
        //            soma += valores[i]; // Acumula a soma dos valores
        //        }
        //
        //        // Calculando a média
        //        media = soma / 5;
        //
        //        // Calculando o desvio padrão amostral
        //        for (int i = 0; i < 5; i++) {
        //            desvioPadrao += Math.pow(valores[i] - media, 2); // Soma dos quadrados das diferenças
        //        }
        //        desvioPadrao = Math.sqrt(desvioPadrao / (5 - 1)); // Normalizado por N-1 (amostral)
        //
        //        // Exibindo os resultados
        //        System.out.println("A média é " + media + " e o desvio-padrão é " + desvioPadrao);
        //
        //        scanner.close();
        //    }
        //});


        //ex09(import java.util.Scanner;
        //
        //public class MediaTurma {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int maxAlunos = 100; // Número máximo de alunos permitido
        //        double[] notas = new double[maxAlunos]; // Vetor para armazenar as notas dos alunos
        //        double soma = 0; // Variável para armazenar a soma das notas
        //        double media;
        //
        //        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        //
        //        // Solicita o número de alunos
        //        System.out.print("Entre com o número de alunos: ");
        //        int numAlunos = scanner.nextInt();
        //
        //        // Verifica se o número de alunos é válido
        //        if (numAlunos > maxAlunos || numAlunos <= 0) {
        //            System.out.println("Erro! O número máximo de alunos permitido é 100.");
        //        } else {
        //            // Lê as notas dos alunos
        //            for (int i = 0; i < numAlunos; i++) {
        //                System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
        //                notas[i] = scanner.nextDouble();
        //                soma += notas[i]; // Acumula a soma das notas
        //            }
        //
        //            // Calcula a média
        //            media = soma / numAlunos;
        //
        //            // Exibe o relatório de notas
        //            System.out.println("\nRelatório de Notas");
        //            for (int i = 0; i < numAlunos; i++) {
        //                System.out.println("A nota do aluno " + i + " é: " + notas[i]);
        //            }
        //
        //            // Exibe a média da turma
        //            System.out.println("A média da turma é: " + media);
        //        }
        //
        //        scanner.close();
        //    }
        //});


        //ex10(import java.util.Scanner;
        //
        //public class SubtracaoVetores {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] A = new int[3]; // Vetor A com 3 números inteiros
        //        int[] B = new int[3]; // Vetor B com 3 números inteiros
        //        int[] C = new int[3]; // Vetor C para armazenar A - B
        //
        //        System.out.println("<< Subtração de vetores >>");
        //
        //        // Lendo os valores do vetor A
        //        System.out.println("Digite os valores de A:");
        //        for (int i = 0; i < 3; i++) {
        //            System.out.print("Digite o valor " + (i + 1) + " de A: ");
        //            A[i] = scanner.nextInt();
        //        }
        //
        //        // Lendo os valores do vetor B
        //        System.out.println("\nDigite os valores de B:");
        //        for (int i = 0; i < 3; i++) {
        //            System.out.print("Digite o valor " + (i + 1) + " de B: ");
        //            B[i] = scanner.nextInt();
        //        }
        //
        //        // Calculando o vetor C = A - B
        //        for (int i = 0; i < 3; i++) {
        //            C[i] = A[i] - B[i];
        //        }
        //
        //        // Exibindo o vetor C
        //        System.out.print("\nO vetor C, definido como C = A - B, é (");
        //        for (int i = 0; i < 3; i++) {
        //            System.out.print(C[i]);
        //            if (i < 2) {
        //                System.out.print(", ");
        //            }
        //        }
        //        System.out.println(")");
        //
        //        scanner.close();
        //    }
        //});


        // ex11(import java.util.Scanner;
        //
        //public class ParesImpares {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] v = new int[5]; // Vetor original com 5 números inteiros
        //        int[] v1 = new int[5]; // Vetor para armazenar os números ímpares
        //        int[] v2 = new int[5]; // Vetor para armazenar os números pares
        //        int countImpares = 0; // Contador de números ímpares
        //        int countPares = 0; // Contador de números pares
        //
        //        System.out.println("<< Pares e Ímpares >>");
        //
        //        // Lendo os 5 valores
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print("Digite o valor " + (i + 1) + ": ");
        //            v[i] = scanner.nextInt();
        //
        //            // Separando pares e ímpares
        //            if (v[i] % 2 == 0) {
        //                v2[countPares] = v[i]; // Armazena no vetor de pares
        //                countPares++;
        //            } else {
        //                v1[countImpares] = v[i]; // Armazena no vetor de ímpares
        //                countImpares++;
        //            }
        //        }
        //
        //        // Exibindo os números ímpares
        //        System.out.print("\nÍmpares: ");
        //        for (int i = 0; i < countImpares; i++) {
        //            System.out.print(v1[i]);
        //            if (i < countImpares - 1) {
        //                System.out.print(", ");
        //            }
        //        }
        //
        //        // Exibindo os números pares
        //        System.out.print("\nPares: ");
        //        for (int i = 0; i < countPares; i++) {
        //            System.out.print(v2[i]);
        //            if (i < countPares - 1) {
        //                System.out.print(", ");
        //            }
        //        }
        //
        //        scanner.close();
        //    }
        //});


        //ex12(import java.util.Scanner;
        //
        //public class ProbabilidadeBolinhas {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] bolinhas = new int[4]; // Vetor para armazenar a quantidade de bolinhas de cada cor
        //        String[] cores = {"Verde", "Azul", "Amarela", "Vermelha"}; // Nomes das cores
        //        double[] probabilidades = new double[4]; // Vetor para armazenar as probabilidades
        //        int totalBolinhas = 0; // Variável para armazenar o total de bolinhas
        //        int indiceMaiorProbabilidade = 0; // Índice da cor com maior probabilidade
        //
        //        System.out.println("<< Probabilidades >>");
        //        System.out.println("Digite a quantidade de bolinhas:");
        //
        //        // Lendo a quantidade de bolinhas de cada cor
        //        for (int i = 0; i < 4; i++) {
        //            System.out.print(cores[i] + ": ");
        //            bolinhas[i] = scanner.nextInt();
        //            totalBolinhas += bolinhas[i]; // Acumula o total de bolinhas
        //        }
        //
        //        // Calculando as probabilidades
        //        for (int i = 0; i < 4; i++) {
        //            probabilidades[i] = (double) bolinhas[i] / totalBolinhas * 100;
        //        }
        //
        //        // Encontrando a cor com maior probabilidade
        //        for (int i = 1; i < 4; i++) {
        //            if (probabilidades[i] > probabilidades[indiceMaiorProbabilidade]) {
        //                indiceMaiorProbabilidade = i;
        //            }
        //        }
        //
        //        // Exibindo as probabilidades
        //        System.out.println("\nProbabilidades");
        //        for (int i = 0; i < 4; i++) {
        //            System.out.printf("%s: %.1f%%", cores[i], probabilidades[i]);
        //            if (i == indiceMaiorProbabilidade) {
        //                System.out.print(" << Maior probabilidade");
        //            }
        //            System.out.println();
        //        }
        //
        //        scanner.close();
        //    }
        //});


        //ex13(import java.util.Scanner;
        //
        //public class ZerandoNegativos {
        //    public static void main(String[] args) {
        //        Scanner scanner = new Scanner(System.in);
        //        int[] vetor = new int[5]; // Vetor para armazenar os 5 valores
        //
        //        System.out.println("<< Zerando negativos >>");
        //
        //        // Lendo os 5 valores
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print("Entre com o número " + (i + 1) + ": ");
        //            vetor[i] = scanner.nextInt();
        //        }
        //
        //        // Zerando os valores negativos
        //        for (int i = 0; i < 5; i++) {
        //            if (vetor[i] < 0) {
        //                vetor[i] = 0;
        //            }
        //        }
        //
        //        // Exibindo o vetor final
        //        System.out.print("\nZerando os negativos, obtém-se: ");
        //        for (int i = 0; i < 5; i++) {
        //            System.out.print(vetor[i] + " ");
        //        }
        //
        //        scanner.close();
        //    }
        //});

    }


}
