package testapagamento1;

public class Dinheiro implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Pagamento de %.2f em dinheiro\n", valor);
    }

}
