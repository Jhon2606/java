package testapagamento1;

public class CartaoCredito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Pagamento de %.2f no cartão\n", valor);
    }

}
