public class Vendedor extends Funcionario{
    private double comissao;

    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    public double getComissao(){
        return this.comissao;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Comissao: " + this.comissao);
    }
}
