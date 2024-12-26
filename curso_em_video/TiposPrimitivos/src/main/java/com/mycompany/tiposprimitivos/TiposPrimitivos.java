/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author jhon
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextInt();
        System.out.printf("O aluno %s teve a nota %.2f\n", nome, nota);
    }
}
