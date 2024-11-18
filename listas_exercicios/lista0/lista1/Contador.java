package lista1;

public class Contador{
    private static int total = 0;

    public Contador(){
        total++;
    }
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        System.out.println("Número de classes: " + total);
    }
}