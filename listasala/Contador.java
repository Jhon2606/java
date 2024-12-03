public class Contador{
    private static int contador = 0;

    public Contador(){
        contador++;

    }

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        System.out.println("Foram criadas " + Contador.contador + " instancias");

    }
}