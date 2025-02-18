public class Gerente extends Funcionario{
    private double bonus;

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return this.bonus;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Bonus: " + this.bonus);
    }
}
