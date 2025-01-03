/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita2;

import javax.swing.JOptionPane;

/**
 *
 * @author jhon
 */
public class ExercicioRepita2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, par = 0, impar = 0, cem = 0, cont = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html>"));
            if(n%2==0){
                par++;
            }else{
                impar++;
            }
            if(n > 100){
                cem++;
            }
            s += n;
            cont++;
        }while(n!=0);
        int media = s/cont;
        JOptionPane.showMessageDialog(null, "<html>Resultado<br><hr>" + "Total de valores: " + cont + "<br>Total de pares: " + par + "<br>Total de impares: " + impar + "<br>Acima de 100: " + cem + "<br>Media dos valores: " + media);
        //JOptionPane.showMessageDialog(null, "<html>Resultado final<br>------------------------" + "<br>Somatorio vale " + s);
        //JOptionPane.showMessageDialog(null, "Voce digitou o valor " + n);
        //JOptionPane.showMessageDialog(null, "Ola Mundo!", "Boas vindas", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
