package testapagamento1;

public class Loja {

    public void efetuarPagamento(Pagamento pagamento, double valor) {
        pagamento.realizarPagamento(valor);
    }
}
