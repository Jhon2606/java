package com.mycompany.testaforma;

public class Circulo extends Forma {

    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }

}
