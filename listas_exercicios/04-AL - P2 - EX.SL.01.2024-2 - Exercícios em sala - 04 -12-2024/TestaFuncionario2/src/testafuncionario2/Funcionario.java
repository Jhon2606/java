package testafuncionario2;

public abstract class Funcionario {

    private String nome;
    private double salarioBase;

    public abstract double calcularSalario();

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

}
