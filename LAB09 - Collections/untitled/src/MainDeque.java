import java.util.*;

public class MainDeque {

    public static void main(String[] args) {
        Deque<Estudante> dequeEstudantes = new LinkedList<>();

        // Adicionando estudantes nas extremidades
        dequeEstudantes.addFirst(new EstudanteGraduacao("Alice", 101));
        dequeEstudantes.addLast(new EstudanteMestrado("Bruno", 202));
        dequeEstudantes.addFirst(new EstudanteDoutorado("Carla", 303));

        System.out.println("=== Deque de Estudantes ===");
        for (Estudante e : dequeEstudantes) {
            System.out.println(e);
        }

        // Chamadas com diferentes retornos
        System.out.println("\nPrimeiro estudante: " + dequeEstudantes.peekFirst()); // retorna ou null
        System.out.println("Último estudante: " + dequeEstudantes.getLast());       // retorna ou lança exceção
        System.out.println("Removido do final: " + dequeEstudantes.removeLast());   // remove e retorna

        // Esvaziando o deque
        dequeEstudantes.clear();

        // Disparo de exceção e tratamento
        try {
            System.out.println("\nTentando remover do início do deque vazio...");
            Estudante removido = dequeEstudantes.removeFirst(); // Lança NoSuchElementException
            System.out.println("Removido: " + removido);
        } catch (NoSuchElementException ex) {
            System.out.println("Exceção capturada: " + ex.getMessage());
            System.out.println("Deque está vazio. Não é possível remover.");
        }
    }
}
