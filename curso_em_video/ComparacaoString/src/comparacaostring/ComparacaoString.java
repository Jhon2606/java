/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author jhon
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Jhonatas";
        String nome2 = "Jhonatas";
        String nome3 = new String("Jhonatas");
        String r = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(r);
    }
    
}
