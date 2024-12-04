public class Produto2 {

    private String nome;
    private double preco;

    private Produto2[] produtos = new Produto2[3];

    public Produto2(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return "Nome: " + nome + ", Preço: R$" + preco;
    }

    public void preencherProdutos() {
        produtos[0] = new Produto2("Abacate", 5);
        produtos[1] = new Produto2("Mamão", 6);
        produtos[2] = new Produto2("Abacaxi", 4);
    }

    public static void main(String[] args) {
        Produto2 produtoObj = new Produto2("Vazio", 0);

        produtoObj.preencherProdutos();

        for (int i = 0; i < produtoObj.produtos.length; i++) {
            System.out.println(produtoObj.produtos[i]);
        }
    }
}
