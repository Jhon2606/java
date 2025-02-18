package testafuncionario2;

public class Vendedor extends Funcionario {

    private double percentual;

    public Vendedor(String nome, double salarioBase, double percentual) {
        super(nome, salarioBase);
        this.percentual = percentual;
    }

    @Override
    public double calcularSalario() {
        double comissao = getSalarioBase() * (percentual / 100);
        return getSalarioBase() + comissao;
    }

}
