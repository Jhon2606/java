import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Supermercado2 implements Comparator<Produto2>{

    @Override
    public int compare(Produto2 prod1, Produto2 prod2) {
        return Double.compare(prod2.getPreco(), prod1.getPreco());
    }
    

    public static void main(String[] args) {
        ArrayList<Produto2> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto2("Sabão", 2.50, "Bom"));
        listaDeProdutos.add(new Produto2("Camiseta", 50.00, "Roupas"));
        listaDeProdutos.add(new Produto2("Smartphone", 2500.00, "Eletrônicos"));
        listaDeProdutos.add(new Produto2("Cadeira Gamer", 800.00, "Móveis"));
        listaDeProdutos.add(new Produto2("Livro de Java", 120.00, "Livros"));
        Collections.sort(listaDeProdutos, new Supermercado2());
        System.out.println("\nLista ordenada pelo preço:");
        for (Produto2 p : listaDeProdutos) {
            System.out.println(p);
        }
    }
}
