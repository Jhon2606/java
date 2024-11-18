package lista1;

public class Pessoa2 {
    private String nome;
    private int idade;
    private double altura;

    public String retornarInformacoes(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }
    public static void main(String[] args) {
        Pessoa2 p1 = new Pessoa2();
        p1.setNome("Jhon");
        p1.setIdade(22);
        p1.setAltura(1.65);
        System.out.println("Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade() + "\nAltura: " + p1.getAltura());
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

}
