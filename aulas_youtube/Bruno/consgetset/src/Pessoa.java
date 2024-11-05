public class Pessoa {
    private String nome;
    private double altura;
    
    public String getNome(){
        return this.nome;
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
    public Pessoa(String nome, double altura){//construtores ajudam a mexer nos atributos os objetos privados sem usar setters e getters mais rapidamente
        this.nome = nome;
        this.altura = altura;
        //agora toda pessoa criada tera que ter dois parametros passados e naturalmente ja terão dois parametros apdrao
    }
}
