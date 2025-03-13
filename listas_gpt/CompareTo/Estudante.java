import java.util.*;

public class Estudante implements Comparable<Estudante>{
    private int idade;
    private String nome;
    private double nota;

    public Estudante(String nome, int idade, double nota){
        this.idade = idade;
        this.nome = nome;
        this.nota = nota;
    }

    public int compareTo(Estudante outro){
        return Double.compare(outro.nota, this.nota);
    }
    
    @Override
    public String toString() {
        return nome + " - Idade: " + idade + ", Nota: " + nota;
    }

    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Fabio", 23, 10));
        estudantes.add(new Estudante("Carlos", 25, 6));
        estudantes.add(new Estudante("Jhon", 20, 5));
        estudantes.add(new Estudante("Amanda", 23, 7));
        estudantes.add(new Estudante("Caio", 19, 9));
        Collections.sort(estudantes);
        estudantes.forEach(System.out::println);
    }
}