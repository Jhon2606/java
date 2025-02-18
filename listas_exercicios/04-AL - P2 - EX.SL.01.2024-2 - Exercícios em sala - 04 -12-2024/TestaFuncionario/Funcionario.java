public abstract class Funcionario{
    private String nome;
    private double salarioBase;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase()  {
        return this.salarioBase;
    }

    public void exibirDados(){
        System.out.println("Funcionario: " + this.nome + "\nSalario: " + this.salarioBase);
    }


}