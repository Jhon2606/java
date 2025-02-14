package testaanimal;

public class TestaAnimal {

    public static void main(String[] args) {
        Animal c1 = new Cachorro();
        Animal g1 = new Gato();

        c1.emitirSom();
        c1.mover();
        g1.emitirSom();
        g1.mover();
    }

}
