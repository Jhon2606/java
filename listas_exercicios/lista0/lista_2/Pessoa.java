public class Pessoa{
    private String nome;
    private double altura;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jhon");
        p1.setIdade(22);
        p1.setAltura(1.65);
        System.out.println("Nome: " + p1.getNome() + "\n" + "Idade: " + p1.getIdade() + "\n" + "Altura: " + p1.getAltura());
    }
}