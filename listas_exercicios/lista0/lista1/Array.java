package lista1;

public class Array {
    public static void main(String[] args) {
        int[] vet = new int[5];

        for(int i = 0; i < vet.length; i++){
            vet[i] = i + 1;
        }
        for(int i = 0; i < vet.length; i++){
            System.out.println("Valor no índice " + i + ": " + vet[i]);
        }
    }
}
