package com.mycompany.testaconta;

public abstract class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + '}';
    }

}
