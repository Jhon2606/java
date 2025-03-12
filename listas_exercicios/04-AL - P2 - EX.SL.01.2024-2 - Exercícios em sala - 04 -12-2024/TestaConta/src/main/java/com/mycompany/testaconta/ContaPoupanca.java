package com.mycompany.testaconta;

public class ContaPoupanca extends ContaBancaria {

    private int taxaDeJuros;

    public ContaPoupanca(int numeroConta, double saldo, int taxaDeJuros) {
        super(numeroConta, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public void aplicarJuros() {
        double juros = (taxaDeJuros / 100.0) * getSaldo();
        setSaldo(getSaldo() + juros);
    }

    @Override
    public String toString() {
        return super.toString() + ", taxaDeJuros=" + taxaDeJuros;
    }
}
