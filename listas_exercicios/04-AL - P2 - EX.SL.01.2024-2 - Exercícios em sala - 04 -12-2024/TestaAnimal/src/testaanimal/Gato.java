package testaanimal;

public class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }

    @Override
    public void mover() {
        System.out.println("Andando devagar.");
    }

}
