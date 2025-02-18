package listas_gpt.lista1;

import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Adicione o nome do produto em estoque: ");
        String nome = ler.nextLine();
        System.out.printf("Adicione o preço do produto em estoque: ");
        double preco = ler.nextInt();
        System.out.printf("Adicione a quantidade do produto em estoque: ");
        int quantidade = ler.nextInt();

        Produto pr1 = new Produto(nome, preco, quantidade);

        System.out.println("Quantos produtos voce quer adicionar ao estoque: ");
        int adicionarQuantidade = ler.nextInt();
        pr1.adicionarEstoque(adicionarQuantidade);

        System.out.printf("O produto %s de preço %.2f possui %d unidades em estoque: ", pr1.getNome(), pr1.getPreco(), pr1.getQtd_em_estoque());

        System.out.println("Quantos produtos voce quer remover do estoque: ");
        int removerQuantidade = ler.nextInt();
        pr1.removerEstoque(removerQuantidade);

        System.out.printf("O produto %s de preço %.2f possui %d unidades em estoque: ", pr1.getNome(), pr1.getPreco(), pr1.getQtd_em_estoque());
    }
}
