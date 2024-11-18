public class Produto {
    private String nome;
    private double preco;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public double calcularDesconto(double desconto){
        return preco * (desconto/100);
    }

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Shampoo Cristiano Ronaldo anti caspa");
        p1.setPreco(17.00);
        System.out.println("Produto: " + p1.getNome() + "\nPreco: " + p1.calcularDesconto(50.00) + "R$");
    }
}
//No código, a única variável armazenada diretamente na pilha é o parâmetro desconto do método calcularDesconto. A variável p1 também está na pilha, mas é apenas uma referência para um objeto no heap. Os atributos do objeto (nome e preco) estão armazenados no heap como parte do objeto Produto.