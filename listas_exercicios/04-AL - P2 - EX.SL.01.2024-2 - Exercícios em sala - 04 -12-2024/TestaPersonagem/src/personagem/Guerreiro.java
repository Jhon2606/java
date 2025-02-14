package personagem;

public class Guerreiro extends Personagem {

    @Override
    public void atacar() {
        System.out.println("Guerreiro ataca com espada.");
    }

    @Override
    public void defender() {
        System.out.println("Guerreiro usa escudo para defender.");
    }

}
