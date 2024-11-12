/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaClasses {

    public static void main(String[] args) {
        Gerente g1 = new Gerente("Fulana", "123.456.789-00", 1000.00, "Setor x", 3);
        Gerente g2 = new Gerente("Ciclana", "223.456.789-02", 1000.00, "Setor y", 6);

        Programador p1 = new Programador("Beltrano", "987.654.321-11", 800, "Cobol", 1);
        Programador p2 = new Programador("Ciclano", "887.654.321-12", 800, "C#", 2);

        System.out.println("\nGerentes: ");
        g1.imprimirDados();
        g2.imprimirDados();

        System.out.println();
        System.out.println("\nProgramadores: ");

        p1.imprimirDados();
        p2.imprimirDados();
    }
}
