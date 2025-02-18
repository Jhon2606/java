package com.mycompany.testaforma;

public class TestaForma {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5, 5);
        Circulo c1 = new Circulo(2);
        System.out.println(r1.calcularArea());
        System.out.println(c1.calcularArea());
    }
}
