import java.util.*;

public class MainColecoes {

    public static void main(String[] args) {
        // Lista de estudantes (permite duplicatas, mantém ordem de inserção)
        List<Estudante> listaEstudantes = new ArrayList<>();
        listaEstudantes.add(new EstudanteGraduacao("João", 1));
        listaEstudantes.add(new EstudanteMestrado("Maria", 2));
        listaEstudantes.add(new EstudanteDoutorado("Pedro", 3));

        System.out.println("=== Lista de Estudantes ===");
        for (Estudante e : listaEstudantes) {
            System.out.println(e);
        }

        System.out.println("Segundo estudante na lista: " + listaEstudantes.get(1)); // método get()

        // Conjunto de estudantes (não permite duplicatas)
        Set<Estudante> conjuntoEstudantes = new HashSet<>();
        conjuntoEstudantes.add(new EstudanteGraduacao("João", 1));
        conjuntoEstudantes.add(new EstudanteMestrado("Maria", 2));
        conjuntoEstudantes.add(new EstudanteMestrado("Maria", 2)); // Duplicado, não será adicionado

        System.out.println("\n=== Conjunto de Estudantes (sem duplicatas) ===");
        for (Estudante e : conjuntoEstudantes) {
            System.out.println(e);
        }

        System.out.println("Conjunto contém Maria? " +
                conjuntoEstudantes.contains(new EstudanteMestrado("Maria", 2))); // método contains()
    }
}