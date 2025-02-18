package personagem;

public class TestaPersonagem {

    public static void main(String[] args) {
        Personagem[] p = {new Guerreiro(), new Arqueiro(), new Mago()};

        for (Personagem personagens : p) {
            personagens.atacar();
            personagens.defender();
        }
    }

}
