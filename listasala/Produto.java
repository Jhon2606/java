public class Produto {
	private String nome;
	private double preco;


	private static Produto[] produtos = new Produto[3];

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	public String toString() {
		return "Nome: " + nome + ", Preco: R$" + preco;
	}
	public static void main(String[] args) {

		produtos[0] = new Produto("Abacate", 5);
		produtos[1] = new Produto("Mamao", 6);
		produtos[2] = new Produto("Abacaxi", 4);

		for(int i = 0; i <= produtos.length; i++) {
			System.out.println(produtos[i]);
		}

	}
}