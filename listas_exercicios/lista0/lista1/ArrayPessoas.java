package lista1;

public class ArrayPessoas{
    private String nome;
    private int idade;
    private double altura;
    
    public ArrayPessoas(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String retornarInformacoes(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa("Bruno", 35, 1.70);
        pessoas[1] = new Pessoa("Ana", 28, 1.65);
        pessoas[2] = new Pessoa("Carlos", 40, 1.80);
        pessoas[3] = new Pessoa("Diana", 30, 1.75);
        pessoas[4] = new Pessoa("Eduardo", 25, 1.68);

        for(int i = 0; i < pessoas.length; i++){
            System.out.println("Pessoa " + (i + 1) + ":\n" + pessoas[i].retornarInformacoes() + "\n");
        }
    }
}
