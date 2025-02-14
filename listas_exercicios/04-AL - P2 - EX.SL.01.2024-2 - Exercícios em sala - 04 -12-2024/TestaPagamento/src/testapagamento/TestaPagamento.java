package testapagamento;

public class TestaPagamento {

    public static void main(String[] args) {
        Pagamento[] p = {new CartaoCredito(), new Boleto(), new Pix()};
        
        for(Pagamento pag: p){
            pag.processarPagamento(500);
        }
    }

}
