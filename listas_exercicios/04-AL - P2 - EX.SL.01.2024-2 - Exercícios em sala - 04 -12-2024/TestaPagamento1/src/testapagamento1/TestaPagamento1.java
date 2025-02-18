package testapagamento1;

public class TestaPagamento1 {

    public static void main(String[] args) {
        Loja l = new Loja();
        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoDinheiro = new Dinheiro();
        
        l.efetuarPagamento(pagamentoCartao, 100);
        l.efetuarPagamento(pagamentoDinheiro, 10);
    }

}
