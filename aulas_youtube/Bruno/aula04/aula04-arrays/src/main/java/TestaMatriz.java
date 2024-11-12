/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaMatriz {
    public static void main(String[] args){
        final int linhas = 7;
        
        //uma matris 3x3 basica
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j ++){
                matriz[i][j] = i * 2;
            }
        }
      
        // um vetor de vetores... diferenciado
        int[][] trianguloPascal = new int[linhas][];
        
        for (int i = 0; i < trianguloPascal.length ; i++){
            trianguloPascal[i] = new int[i+1];
            trianguloPascal[i][0] = 1;
            for (int j = 1; j < trianguloPascal[i].length; j++){
                if (i == j){ 
                    trianguloPascal[i][j] = 1;
                } else {
                    trianguloPascal[i][j] = trianguloPascal[i-1][j-1] + trianguloPascal[i-1][j];
                }
            }
        }
        for (int i = 0; i < trianguloPascal.length; i++){
            for( int j = 0; j < trianguloPascal[i].length; j++){
                System.out.print("   " + trianguloPascal[i][j]);
            }
            System.out.println();
        }

    }
}
