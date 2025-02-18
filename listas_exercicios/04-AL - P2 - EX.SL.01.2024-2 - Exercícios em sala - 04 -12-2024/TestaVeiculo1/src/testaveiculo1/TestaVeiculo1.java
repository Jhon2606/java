package testaveiculo1;

import java.util.ArrayList;

public class TestaVeiculo1 {

    public static void main(String[] args) {
        ArrayList<Veiculo> lista;
        lista = new ArrayList<>();
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        lista.add(carro);
        lista.add(moto);
        for (Veiculo v : lista) {
            v.ligar();
        }
    }

}
