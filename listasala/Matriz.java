public class Matriz{
    private int[][] matriz1 = new int[3][3];

    public Matriz(){
        preencherMatriz();
    }
    private void preencherMatriz(){
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[i].length; j++){
                matriz1[i][j] = i + j + 1;
            }
        }
    }
    public static void main(String[] args) {
        Matriz m1 = new Matriz();
        System.out.println("Matriz preenchida:");
        for (int i = 0; i < m1.matriz1.length; i++) {
            for (int j = 0; j < m1.matriz1[i].length; j++){
                System.out.print(m1.matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }
}