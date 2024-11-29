import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = ler.nextInt();
        boolean Éprimo = true;
        if(n<=1){
            Éprimo = false;
        }else{
            for(int i = 2; i < n; i++){
                if((n % i) == 0){
                    Éprimo = false;
                    break;
                }
            }
        }
        if (Éprimo) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
    }
    }
}
