import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CollectionsTeste {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        System.out.println("a) adicionar 10 números gerados aleatoriamente no arraylist");
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(201) - 100);
        }

        System.out.println("b) imprimir todos números no arraylist");
        System.out.println(numeros);

        System.out.println("c) imprimir todos os números positivos no arraylist (caso haja algum)");
        for (int n : numeros) {
            if (n > 0) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\nd) imprimir a soma dos números no arraylist");
        int som = 0;
        for (int n : numeros) {
            som += n;
        }
        System.out.println(som);

        System.out.println("e) remover todos os números pares no arraylist");
        numeros.removeIf(num -> num % 2 == 0);
        System.out.println(
                "f) imprimir todos os números restantes no arraylist após a execução do que é solicitado em e");
        System.out.println(numeros);

        System.out.println(
                "g) ordenar (crescente) o arraylist usando um método utilitário (classe Collections) e imprimir o arraylist após a ordenação dos valores.");
        Collections.sort(numeros);
        System.out.println(numeros);

        System.out.println(
                "h) ordenar (decrescente) o arraylist usando um método utilitário (classe Collections) e imprimir o arraylist após a ordenação dos valores.(você precisará fornecer um segundo parâmetro ao método sort).");
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);
    }
}
