package Gestão_de_uma_lista_de_estudantes;
public class Aluno {
    private String nome;
    private double nota;
    private int matricula;

    public Aluno(String nome, double nota, int matricula){
        this.matricula = matricula;
        this.nome = nome;
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
}