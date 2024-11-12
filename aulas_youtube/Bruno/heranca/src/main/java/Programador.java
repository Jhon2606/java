/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class Programador extends Funcionario {

    private String linguagemDeProgramacao;
    private int nivel;
    
    public Programador(String nome, String cpf, double salarioBase, String linguagemDeProgramacao, int nivel){
        super(nome, cpf, salarioBase);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
        this.nivel = nivel;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Linguagem de programação: " + this.linguagemDeProgramacao + "\nNivel: " + this.nivel + "\nBonificação: " + this.getBonificacao());
    }

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public double getBonificacao() {
        double bonus = 0.0;

        if (this.nivel == 1) {
            bonus = 0.0;
        } else {
            if (this.nivel == 2) {
                bonus = this.getSalarioBase() * 0.05;
            }
        }
        return bonus;
    }

}
