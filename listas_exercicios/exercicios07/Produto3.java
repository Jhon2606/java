import java.util.ArrayList;
import java.util.Collections;

public class Produto3 implements Comparable<Produto3>{
    private String nome;
    private double preco;
    private String categoria;

    public Produto3(String nome, double preco, String categoria){
        this.nome = nome;
        this. preco = preco;
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + nome + " Preco: " + preco + " Categoria: " + categoria;
    }
    @Override
    public int compareTo(Produto3 outrProduto3){
        return nome.compareTo(outrProduto3.nome);
    }
    public static void removerProduto(ArrayList<Produto2> lista, String nomeProduto) {
        boolean removido = lista.removeIf(produto -> produto.getNome().equalsIgnoreCase(nomeProduto));
        if (removido) {
            System.out.println("Produto '" + nomeProduto + "' removido com sucesso!");
        } else {
            System.out.println("Produto '" + nomeProduto + "' não encontrado na lista.");
        }
    }
    public static void main(String[] args) {
        ArrayList<Produto2> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto2("Sabão", 2.50, "Bom"));
        listaDeProdutos.add(new Produto2("Camiseta", 50.00, "Roupas"));
        listaDeProdutos.add(new Produto2("Smartphone", 2500.00, "Eletrônicos"));
        listaDeProdutos.add(new Produto2("Cadeira Gamer", 800.00, "Móveis"));
        listaDeProdutos.add(new Produto2("Livro de Java", 120.00, "Livros"));

        for(Produto2 p: listaDeProdutos){
            System.out.println(p);
        }
        System.out.println();
        Collections.sort(listaDeProdutos);
        
        for(Produto2 p: listaDeProdutos){
            System.out.println(p);
        }
        System.out.println();
        Produto3.removerProduto(listaDeProdutos, "Sabão");
        for(Produto2 p: listaDeProdutos){
            System.out.println(p);
        }
    }
}
