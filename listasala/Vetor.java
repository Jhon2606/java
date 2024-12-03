public class Vetor {
    private static int soma = 0;
    private static int[] vet = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args) {
        for(int i = 0; i < vet.length; i++){
            soma += vet[i];
        }
        System.out.println("Soma: " + soma);
    }
}
