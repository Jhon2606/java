package controle_pedidos;

import java.util.ArrayList;

public class Pedidos {
    private int numeroPedido;
    private String data;
    private double valor;

    public Pedidos(int numeroPedido, String data, double valor){
        this.data = data;
        this.valor = valor;
        this.numeroPedido =numeroPedido;
    }
    public String getData() {
        return data;
    }
    public int getNumeroPedido() {
        return numeroPedido;
    }
    public double getValor() {
        return valor;
    }

}
