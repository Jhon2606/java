/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class Gerente extends Funcionario {

    private String setor;
    private int numeroProjetos;

    public Gerente(String nome, String cpf, double salarioBase, String setor, int numeroProjetos) {
        super(nome, cpf, salarioBase);
        this.setor = setor;
        this.numeroProjetos = numeroProjetos;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Setor: " + this.setor + "\nNumero de projetos: " + this.numeroProjetos + "\nBonificação: " + this.getBonificacao());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getNumeroProjetos() {
        return numeroProjetos;
    }

    public void setNumeroProjetos(int numeroProjetos) {
        this.numeroProjetos = numeroProjetos;
    }

    @Override
    public double getBonificacao() {
        double bonus = 0;
        if (this.numeroProjetos > 5) {
            bonus = this.getSalarioBase() * 0.1;
        }
        return bonus;
    }

}
