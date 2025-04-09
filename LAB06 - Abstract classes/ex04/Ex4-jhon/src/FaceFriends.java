import java.util.ArrayList;
import java.util.Scanner;
class FaceFriends {
    private static ArrayList<Contato> contatos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        System.out.println("Auno: Jhon Waine Mendes Gonçalves 12021BCC028:");
        do {
            System.out.println("\n=== MENU FACE FRIENDS ===");
            System.out.println("1. Inserir novo contato");
            System.out.println("2. Imprimir todos os contatos");
            System.out.println("3. Imprimir somente familiares");
            System.out.println("4. Imprimir somente amigos");
            System.out.println("5. Imprimir somente colegas de trabalho");
            System.out.println("6. Imprimir melhores amigos, irmãos e colegas");
            System.out.println("7. Imprimir contato por índice");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch(opcao) {
                case 1: inserirContato(); break;
                case 2: imprimirTodos(); break;
                case 3: imprimirFamiliares(); break;
                case 4: imprimirAmigos(); break;
                case 5: imprimirColegasTrabalho(); break;
                case 6: imprimirEspecificos(); break;
                case 7: imprimirPorIndice(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

    }

    private static void inserirContato() {
        System.out.println("\nTipo de contato:");
        System.out.println("1. Família");
        System.out.println("2. Amigo");
        System.out.println("3. Colega de trabalho");
        System.out.print("Escolha: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Apelido: ");
        String apelido = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = scanner.nextLine();

        switch(tipo) {
            case 1:
                System.out.print("Parentesco: ");
                String parentesco = scanner.nextLine();
                contatos.add(new Familia(apelido, nome, email, aniversario, parentesco));
                break;
            case 2:
                System.out.print("Grau de amizade (1=melhor, 2=amigo, 3=conhecido): ");
                int grau = scanner.nextInt();
                scanner.nextLine();
                contatos.add(new Amigos(apelido, nome, email, aniversario, grau));
                break;
            case 3:
                System.out.print("Tipo no trabalho: ");
                String tipoTrabalho = scanner.nextLine();
                contatos.add(new Trabalho(apelido, nome, email, aniversario, tipoTrabalho));
                break;
            default:
                System.out.println("Tipo inválido!");
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void imprimirTodos() {
        System.out.println("\n=== TODOS OS CONTATOS ===");
        for(Contato c : contatos) {
            System.out.println(c.imprimirContato() + "\n");
        }
    }

    private static void imprimirFamiliares() {
        System.out.println("\n=== FAMILIARES ===");
        for(Contato c : contatos) {
            if(c instanceof Familia) {
                System.out.println(c.imprimirContato() + "\n");
            }
        }
    }

    private static void imprimirAmigos() {
        System.out.println("\n=== AMIGOS ===");
        for(Contato c : contatos) {
            if(c instanceof Amigos) {
                System.out.println(c.imprimirContato() + "\n");
            }
        }
    }

    private static void imprimirColegasTrabalho() {
        System.out.println("\n=== COLEGAS DE TRABALHO ===");
        for(Contato c : contatos) {
            if(c instanceof Trabalho) {
                System.out.println(c.imprimirContato() + "\n");
            }
        }
    }

    private static void imprimirEspecificos() {
        System.out.println("\n=== MELHORES AMIGOS, IRMÃOS E COLEGAS ===");
        for(Contato c : contatos) {
            if(c instanceof Amigos && ((Amigos)c).grau == 1) {
                System.out.println("MELHOR AMIGO:\n" + c.imprimirContato() + "\n");
            }
            else if(c instanceof Familia && ((Familia)c).parentesco.equalsIgnoreCase("irmão")) {
                System.out.println("IRMÃO:\n" + c.imprimirContato() + "\n");
            }
            else if(c instanceof Trabalho && ((Trabalho)c).tipo.equalsIgnoreCase("colega")) {
                System.out.println("COLEGA DE TRABALHO:\n" + c.imprimirContato() + "\n");
            }
        }
    }

    private static void imprimirPorIndice() {
        if(contatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado!");
            return;
        }

        System.out.println("\nLista de contatos:");
        for(int i = 0; i < contatos.size(); i++) {
            String tipo = "";
            if(contatos.get(i) instanceof Familia) tipo = "Família";
            else if(contatos.get(i) instanceof Amigos) tipo = "Amigo";
            else if(contatos.get(i) instanceof Trabalho) tipo = "Colega de Trabalho";

            System.out.println(i + " - " + contatos.get(i).apelido + " (" + tipo + ")");
        }

        System.out.print("\nDigite o índice do contato: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if(indice >= 0 && indice < contatos.size()) {
            System.out.println("\n" + contatos.get(indice).imprimirContato());
        } else {
            System.out.println("Índice inválido!");
        }
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD
