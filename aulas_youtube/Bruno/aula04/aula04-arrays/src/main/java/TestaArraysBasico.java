/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaArraysBasico {
    
    
    public static void main(String[] args){
        //declaração: tipo[] nomeVariavel;
        //instanciação: nomeVariavel = new tipo[tamanho]; o tamanho é fixo depois de definido
        //obter comprimento: nomeVariavel.length
        
        
        //um simples array de inteiros
        int[] v1 = {2, -10 };
    
        System.out.println("Vetor inteiros: {" + v1[0] + ", " + v1[1] + '}');
        
        //um array de caracteres em que cada caractere foi definido por um int
        char[] v2 = { 66, 114, 117, 110, 111};
        
        for ( int i = 0; i < v2.length; i++){
            System.out.print(v2[i]);
        }
        System.out.println();
        
        //um array mais elaborado - as letras do alfabeto (em minúsculas) - para maíuscula iniciar em 65
        char[] letras = new char[26];
        for (int i = 0; i < letras.length; i++ ){
             letras[i] = (char)(i+97);
             System.out.println(letras[i]);
        }
     
    }
    
}
