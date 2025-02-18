package personagem;

public class Arqueiro extends Personagem {

    @Override
    public void atacar() {
        System.out.println("Arqueiro dispara uma flecha.");
    }

    @Override
    public void defender() {
        System.out.println("Arqueiro se esquiva do ataque.");
    }

}
