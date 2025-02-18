package testapagamento;

public class CartaoCredito extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento processado no cartão de crédito no valor de R$ " + valor);
    }

}
