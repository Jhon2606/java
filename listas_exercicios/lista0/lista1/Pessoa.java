package lista1;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String retornarInformacoes(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Brunão", 35, 1.70);
        System.out.println(p1.retornarInformacoes());
    }

}