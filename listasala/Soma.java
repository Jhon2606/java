import java.util.Scanner;

public class Soma{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num1 = ler.nextInt();

        Scanner ler2 = new Scanner(System.in);
        System.out.println("Digite outro numero: ");
        int num2 = ler.nextInt();

        System.out.printf("Soma: %d", (num1 + num2));
    }
}