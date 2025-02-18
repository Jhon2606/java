package testatransporte;

public class Carro extends Transporte {

    public Carro(int capacidade, double velocidadeMedia) {
        super(capacidade, velocidadeMedia);
    }

    @Override
    public double calcularTempo(double distancia) {
        if (distancia <= 180) {
            return distancia / getVelocidadeMedia();
        } else {
            System.out.println("Isso não é um Carro");
        }
        return 0;

    }
}
