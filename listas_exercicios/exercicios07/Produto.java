import java.util.ArrayList;

public class Produto{
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this. preco = preco;
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + nome + " Preco: " + preco + " Categoria: " + categoria;
    }
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Sabão", 2.50, "Bom"));
        listaDeProdutos.add(new Produto("Camiseta", 50.00, "Roupas"));
        listaDeProdutos.add(new Produto("Smartphone", 2500.00, "Eletrônicos"));
        listaDeProdutos.add(new Produto("Cadeira Gamer", 800.00, "Móveis"));
        listaDeProdutos.add(new Produto("Livro de Java", 120.00, "Livros"));

        for(Produto p: listaDeProdutos){
            System.out.println(p);
        }
    }
}