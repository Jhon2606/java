/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaPlayer {
    public static void main(String[] args){
        Musica minhaMusica = new Musica ("The Divide","...I felt the weight of a thousand years...");
        PlayerDeMusica meuPlayer = new PlayerDeMusica();
        meuPlayer.play(minhaMusica);
    }
    
}
