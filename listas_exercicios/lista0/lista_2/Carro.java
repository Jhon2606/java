public class Carro {
    private String marca;
    private int modelo;

    public Carro(String marca, int modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public static void main(String[] args) {
        Carro Sentra = new Carro("Nissan", 0);
        Carro Fiesta = new Carro("Ford", 1);
        Carro Uno = new Carro("Fiat", 2);
        System.out.println("Sentra" + "\n" + "Marca: " + Sentra.marca + "\n" + "Modelo: " + Sentra.modelo);
        System.out.println("Fiesta" + "\n" + "Marca: " + Fiesta.marca + "\n" + "Modelo: " + Fiesta.modelo);
        System.out.println("Uno" + "\n" + "Marca: " + Uno.marca + "\n" + "Modelo: " + Uno.modelo);
    }

}
