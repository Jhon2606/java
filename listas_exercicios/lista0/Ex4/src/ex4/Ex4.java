package ex4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num1 = ler.nextInt();
        System.out.print("Digite outro valor: ");
        int num2 = ler.nextInt();
        if(num1 < num2){
            System.out.printf("%d e menor que %d\n", num1, num2);
            System.out.printf("%d e diferente de %d\n", num1, num2);
        }else if(num1 == num2){
            System.out.printf("%d e igual a %d\n", num1, num2);
        }else{
            System.out.printf("%d e maior que %d\n", num1, num2);
            System.out.printf("%d e diferente de %d\n", num1, num2);
        }
        ler.close();
    }
}
