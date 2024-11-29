public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public static void main(String[] args) {
        Produto p1 = new Produto("Abacate", 2.00);
        System.out.println("Produto: " + p1.nome + "\n" + "Pecço: " + p1.preco);
        Produto p2 = new Produto("Abobóra", 3.00);
        System.out.println("Produto: " + p2.nome + "\n" + "Pecço: " + p2.preco);
    }
}
