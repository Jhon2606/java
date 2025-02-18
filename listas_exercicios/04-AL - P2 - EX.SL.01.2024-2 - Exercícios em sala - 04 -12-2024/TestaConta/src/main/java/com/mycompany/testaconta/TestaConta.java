package com.mycompany.testaconta;

public class TestaConta {

    public static void main(String[] args) {
        ContaPoupanca c1 = new ContaPoupanca(111, 2000.00, 10);
        System.out.println(c1.toString());
        c1.aplicarJuros();
        System.out.println(c1.toString());
        c1.sacar(10);
        System.out.println(c1.toString());
        c1.depositar(200);
        System.out.println(c1.toString());
        
    }
}
