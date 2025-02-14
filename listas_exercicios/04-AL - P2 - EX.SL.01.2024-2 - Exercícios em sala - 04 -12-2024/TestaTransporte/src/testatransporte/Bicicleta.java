package testatransporte;

public class Bicicleta extends Transporte {

    public Bicicleta(int capacidade, double velocidadeMedia) {
        super(capacidade, velocidadeMedia);
    }

    @Override
    public double calcularTempo(double distancia) {
        if (distancia <= 30) {
            return distancia / getVelocidadeMedia();
        } else {
            System.out.println("Isso não é uma bicicleta");
        }

        return 0;

    }

}
