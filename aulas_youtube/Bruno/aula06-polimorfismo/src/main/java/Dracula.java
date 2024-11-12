/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class Dracula extends Monstro {

    @Override
    public void assustar() {
        System.out.println("\nHa-ha-ha-ha!! Vou te morder!");
    }

    public void assustar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Smack!!");
        }
    }

}
