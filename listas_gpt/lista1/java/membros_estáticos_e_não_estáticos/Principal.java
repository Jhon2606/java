package membros_estáticos_e_não_estáticos;

import java.util.Scanner;

class ConversorTemperatura {
    public static double celsiusParaFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }
    public void mostrarConversao(double celsius){
        double temp_convert = celsiusParaFahrenheit(celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F", temp_convert);
    }
}
public class Principal {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em °C: ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        ConversorTemperatura conversor = new ConversorTemperatura();
        conversor.mostrarConversao(celsius);
        
        scanner.close();
    }
}
