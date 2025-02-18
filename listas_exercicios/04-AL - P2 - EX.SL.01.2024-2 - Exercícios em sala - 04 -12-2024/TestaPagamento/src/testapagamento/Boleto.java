package testapagamento;

public class Boleto extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento processado via boleto bancario no valor de R$ " + valor);
    }

}
