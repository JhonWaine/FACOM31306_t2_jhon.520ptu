import java.util.*;

public class MainColecoes3 {

    public static void main(String[] args) {
        // Lista de estudantes
        List<Estudante> listaEstudantes = new ArrayList<>();
        listaEstudantes.add(new EstudanteGraduacao("João", 1));
        listaEstudantes.add(new EstudanteMestrado("Maria", 2));
        listaEstudantes.add(new EstudanteDoutorado("Pedro", 3));
        listaEstudantes.add(new EstudanteGraduacao("Ana", 4));

        System.out.println("=== Lista de Estudantes (antes da ordenação) ===");
        for (Estudante e : listaEstudantes) {
            System.out.println(e);
        }

        // Ordena com base no nome
        Collections.sort(listaEstudantes);

        System.out.println("\n=== Lista de Estudantes (ordenada por nome) ===");
        for (Estudante e : listaEstudantes) {
            System.out.println(e);
        }
    }
}
