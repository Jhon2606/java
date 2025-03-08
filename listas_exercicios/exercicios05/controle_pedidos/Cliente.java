package controle_pedidos;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private ArrayList<Pedidos> lista;

    public Cliente(String nome, String email, String telefone){
        this.email = email;
        this.telefone = telefone;
        this.nome = nome;
        this.lista = new ArrayList<>();
    }
    public String getEmail() {
        return email;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void adicionarPedido(Pedidos c){
        lista.add(c);
    }
        public void exibirPedidos(){
        for(Pedidos a: lista){
            System.out.println("Data: " + a.getData() + " Valor: " + a.getValor() + " Numedo do Pedido: " + a.getNumeroPedido());
            System.out.println("Nome do cliente: " + nome + " Email: "+ email + " Telefone: " + telefone);
        }
    }
    public double calcularTotalPedidos() {
        double total = 0;
        for (Pedidos p : lista) {
            total += p.getValor();
        }
        return total;
    }
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Beto", "beto@gmail.com", "2799945670");
        Pedidos p1 = new Pedidos(123, "01/01/2025", 30.00);
        Pedidos p2 = new Pedidos(124, "01/01/2025", 20.00);
        c1.adicionarPedido(p1);
        c1.adicionarPedido(p2);
        c1.exibirPedidos();
        System.out.println("Total de pedidos do cliente " + c1.nome + " " + c1.calcularTotalPedidos());
    }
}
