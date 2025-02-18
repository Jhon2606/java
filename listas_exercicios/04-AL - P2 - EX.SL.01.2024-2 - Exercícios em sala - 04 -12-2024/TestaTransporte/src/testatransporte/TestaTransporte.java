package testatransporte;

public class TestaTransporte {

    public static void main(String[] args) {
        Transporte[] t = new Transporte[3];

        t[0] = new Bicicleta(5,100);
        t[1] = new Carro(1, 20);
        t[2] = new Aviao(200, 300);
        
        System.out.println(t[0].calcularTempo(55));

    }

}
