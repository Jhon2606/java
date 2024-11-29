import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero para ver a sua tabuada: ");
        int n = ler.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", i, n, (i * n));
        }
    }
}
