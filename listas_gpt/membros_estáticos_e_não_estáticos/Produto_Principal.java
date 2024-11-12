public class Produto_Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        System.out.println("id: "+ p1.getId());

        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto();
        System.out.println("Total de produtos: "+ Produto.getContador());
    }
}
class Produto{
    private static int contador = 0;
    private int id;

    public Produto(){
        contador++;
        this.id = contador;
    }
    public int getId(){
        return id;
    }
    public static int getContador(){
        return contador;
    }
}
