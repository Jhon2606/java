package Cadastro;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Produto> lista;

    public Loja(){
        this.lista = new ArrayList<>();
    }
    public void adicionarProduto(Produto a){
        lista.add(a);
    }
    public void removerProduto(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == codigo) {
                lista.remove(i);
            }
        }
    }
    public void exibirProdutos(){
        for(Produto a: lista){
            System.out.println("Codigo: " + a.getCodigo() + " - Nome: " + a.getNome());
        }
    }
    public Produto buscarProduto(String nome){
        for(Produto a: lista){
            if(nome.equals(a.getNome())){
                return a;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Loja l1 = new Loja();
        Produto p1 = new Produto(123, "Sabao", 2.00);
        Produto p2 = new Produto(564, "Shampoo", 10.00);

        l1.adicionarProduto(p1);
        l1.adicionarProduto(p2);
        l1.exibirProdutos();

        l1.removerProduto(123);
        l1.exibirProdutos();
        Produto encontrado = l1.buscarProduto("Shampoo");
        if (encontrado != null) {
            System.out.println("Produto encontrado: " + encontrado.getNome() + " - Preco: " + encontrado.getPreco());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

}
