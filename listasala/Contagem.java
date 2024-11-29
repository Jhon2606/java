import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = ler.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
}
