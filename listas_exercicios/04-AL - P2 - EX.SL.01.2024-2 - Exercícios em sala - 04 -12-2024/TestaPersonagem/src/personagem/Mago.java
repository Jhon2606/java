package personagem;

public class Mago extends Personagem {

    @Override
    public void atacar() {
        System.out.println("Mago lança uma bola de fogo.");
    }

    @Override
    public void defender() {
        System.out.println("Mago cria uma barreira mágica.");
    }

}
