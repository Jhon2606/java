package listas_gpt.lista1;
//1.Enunciado: Crie uma classe chamada Pessoa com os atributos nome (String) e idade (int). Implemente getters e setters para ambos os atributos.
//2.Enunciado: Modifique a classe Pessoa para incluir um construtor que recebe nome e idade como parâmetros e inicializa os atributos da classe.
//3.Enunciado: Modifique o setter de idade da classe Pessoa para permitir apenas valores positivos. Se um valor negativo for fornecido, o setter deve ignorá-lo.

public class Pessoa{
    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

