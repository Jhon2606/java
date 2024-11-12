package listas_gpt.lista1;
//Enunciado: Crie uma classe chamada Produto com os atributos nome (String), preco (double) e qtd_em_estoque (int).
//Implemente um construtor que inicializa esses atributos. Adicione métodos para atualizar o estoque (adicionar e remover quantidade)
//e implemente getters e setters apropriados.

public class Produto {
    private String nome;
    private double preco;
    private int qtd_em_estoque;

    public Produto(String nome, double preco, int qtd_em_estoque){
        this.nome = nome;
        this.preco = preco;
        this.qtd_em_estoque = qtd_em_estoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.qtd_em_estoque += quantidade;
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.qtd_em_estoque) {
            this.qtd_em_estoque -= quantidade;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getQtd_em_estoque(){
        return this.qtd_em_estoque;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQtd_em_estoque(int qtd_em_estoque){
        this.qtd_em_estoque = qtd_em_estoque;
    }
}
