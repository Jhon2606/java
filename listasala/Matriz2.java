public class Matriz2 {
    private static int[][] matriz2 = new int[3][3];

    private static void preencheMatriz(){
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                Matriz2.matriz2[i][j] = i + j + 1;
            }
        }
    }
    public static void main(String[] args) {
        Matriz2.preencheMatriz();
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print(Matriz2.matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
