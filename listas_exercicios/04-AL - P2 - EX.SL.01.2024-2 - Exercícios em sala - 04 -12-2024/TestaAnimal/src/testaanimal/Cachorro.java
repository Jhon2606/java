package testaanimal;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuuu!!!");
    }

    @Override
    public void mover() {
        System.out.println("Correndo.");
    }

}
