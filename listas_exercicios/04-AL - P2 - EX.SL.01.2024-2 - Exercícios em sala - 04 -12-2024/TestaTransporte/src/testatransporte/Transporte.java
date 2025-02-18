package testatransporte;

public abstract class Transporte {

    private int capacidade;
    private double velocidadeMedia;

    public abstract double calcularTempo(double distancia);

    public Transporte(int capacidade, double velocidadeMedia) {
        this.capacidade = capacidade;
        this.velocidadeMedia = velocidadeMedia;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

}
