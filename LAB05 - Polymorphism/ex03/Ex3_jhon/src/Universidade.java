import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private LocalDate dataFundacao;
    private List<Estudante> estudantes;
    private static final int MAX_ALUNOS = 100;

    public Universidade(String nome, LocalDate dataFundacao) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(Estudante estudante) {
        if (estudantes.size() < MAX_ALUNOS) {
            estudantes.add(estudante);
        } else {
            System.out.println("A universidade atingiu o limite máximo de alunos.");
        }
    }

    // (a) Método para contar estudantes por tipo
    public void mostrarQuantidadeEstudantes() {
        int graduacao = 0;
        int mestrado = 0;
        int doutorado = 0;

        for (Estudante e : estudantes) {
            if (e instanceof EstudanteDoutorado) {
                doutorado++;
            } else if (e instanceof EstudanteMestrado) {
                mestrado++;
            } else if (e instanceof EstudanteGraduacao) {
                graduacao++;
            }
        }

        System.out.println("Quantidade de estudantes:");
        System.out.println("Graduação: " + graduacao);
        System.out.println("Mestrado: " + mestrado);
        System.out.println("Doutorado: " + doutorado);
    }

    // (b) Mostrar informações dos alunos
    public void mostrarInformacoesAlunos() {
        System.out.println("\nInformações dos Alunos:");
        for (Estudante e : estudantes) {
            System.out.println("Nome: " + e.getNome());
            if (e instanceof EstudanteDoutorado) {
                EstudanteDoutorado ed = (EstudanteDoutorado) e;
                System.out.println("Título da Tese: " + ed.getTituloTese());
                System.out.println("Linha de Pesquisa: " + ed.getLinhaDePesquisa());
            }
            System.out.println("----------------------");
        }
    }

    // (c) Copiar alunos de pós-graduação para novo vetor
    public List<EstudantePosGrad> getPosGraduacao() {
        List<EstudantePosGrad> posGrad = new ArrayList<>();
        for (Estudante e : estudantes) {
            if (e instanceof EstudantePosGrad) {
                posGrad.add((EstudantePosGrad) e);
            }
        }
        return posGrad;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }
}