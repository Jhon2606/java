import java.util.Scanner;

public class Lista_sala2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int val = ler.nextInt();
        if(2 % val == 0){
            System.err.println("É par");
        }else{
            System.err.println("Não é par");
        }
    }
}
