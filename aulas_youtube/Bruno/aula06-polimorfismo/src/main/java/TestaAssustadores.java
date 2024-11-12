/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaAssustadores {
    public static void main(String[] args){
        Monstro[] monstros = new Monstro[3];
        monstros[0] = new Dracula();
        monstros[1] = new Mumia();
        monstros[2] = new Zumbi();
        
        for(int i = 0; i < monstros.length; i++){
            monstros[i].assustar();
        }
    }
}
