package testatransporte;

public class Aviao extends Transporte {

    public Aviao(int capacidade, double velocidadeMedia) {
        super(capacidade, velocidadeMedia);
    }

    @Override
    public double calcularTempo(double distancia) {
        if (distancia <= 950) {
            return distancia / getVelocidadeMedia();
        } else {
            System.out.println("Isso não é um avião");
        }
        return 0;

    }
}
