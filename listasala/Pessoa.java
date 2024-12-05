
public class Pessoa {
    private Aluno aluno;


    public void inserirNotas(String nome, int[][] notas) {
        aluno = new Aluno(nome, notas);
        System.out.printf("Notas do aluno %s foram inseridas com sucesso!%n", nome);
    }

    public void exibirNotas() {
        if (aluno == null) {
            System.out.println("Nenhum aluno cadastrado!");
            return;
        }

        System.out.printf("Notas do aluno %s:%n", aluno.getNome());
        int[][] notas = aluno.getNotas();
        double soma = 0;
        int totalNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%d ", notas[i][j]);
                soma += notas[i][j];
                totalNotas++;
            }
            System.out.println();
        }

        double media = soma / totalNotas;
        System.out.printf("Média geral: %.2f%n", media);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        int[][] notasGlauber = {
            {8, 7, 9},
            {6, 5, 7},
            {10, 9, 8}
        };

        pessoa1.inserirNotas("Glauber", notasGlauber);
        pessoa1.exibirNotas();
    }
}


class Aluno {
    private String nome;
    private int[][] notas;

    public Aluno(String nome, int[][] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int[][] getNotas() {
        return notas;
    }
}
