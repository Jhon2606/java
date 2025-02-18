package testapagamento;

public class Pix extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento processado via pix no valor de R$ " + valor);
    }

}
