import java.util.Scanner;

public class Lista_sala1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int val1 = scanner.nextInt();
        System.out.println("Insira outro numero: ");
        int val2 = scanner.nextInt();
        System.out.println("Soma: " + (val1 + val2));
    }
}
