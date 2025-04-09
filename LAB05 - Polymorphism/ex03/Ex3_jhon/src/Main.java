import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando a universidade
        Universidade universidade = new Universidade("Universidade Federal", LocalDate.of(1950, 1, 1));

        // Adicionando estudantes
        universidade.adicionarEstudante(new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny"));
        universidade.adicionarEstudante(new EstudantePosGrad("Ailton", "Rua 31 de fevereiro", "Engenharia", "Banco de Dados"));
        universidade.adicionarEstudante(new EstudanteMestrado("Carla", "Rua Primavera", "Medicina", "Vacinas de RNA", "academico", "Anticorpos"));
        universidade.adicionarEstudante(new EstudanteDoutorado("Bruno", "Rua Inverno", "Tecnologia", "Processamento de Imagens", "Carros Inteligentes"));

        // (a) Mostrar quantidade de estudantes por tipo
        universidade.mostrarQuantidadeEstudantes();

        // (b) Mostrar informações dos alunos
        universidade.mostrarInformacoesAlunos();

        // (c) Copiar alunos de pós-graduação e mostrar informações
        List<EstudantePosGrad> posGrad = universidade.getPosGraduacao();
        System.out.println("\nAlunos de Pós-Graduação:");
        for (EstudantePosGrad epg : posGrad) {
            epg.print();
            System.out.println("----------------------");
        }

        // (d) Testando o método print sobrecarregado
        System.out.println("\nTestando print em uma linha:");
        EstudanteGraduacao eg = new EstudanteGraduacao("João", "Rua das Flores", "IA na Educação");
        eg.print(true);

        System.out.println("\n\nTestando print em múltiplas linhas:");
        EstudanteDoutorado ed = new EstudanteDoutorado("Ana", "Rua dos Passarinhos", "Computação", "Redes Neurais", "Deep Learning Avançado");
        ed.print(false);

        // (e) Testando polimorfismo com o método print(boolean)
        System.out.println("\n\nTestando polimorfismo com print(boolean):");
        Estudante[] estudantes = new Estudante[3];
        estudantes[0] = eg;
        estudantes[1] = ed;
        estudantes[2] = new EstudanteMestrado("Pedro", "Rua Central", "Física", "Física Quântica", "profissional", "Aplicações Práticas");

        for (Estudante e : estudantes) {
            e.print(true);
            System.out.println("\n----------------------");
        }
        System.out.println("Auno: Jhon Waine Mendes Gonçalves 12021BCC028:");
    }
}// Todos os direitos resevados a Jhon Waine Mendes Gonçalves LTD
