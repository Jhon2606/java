/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class PlayerDeMusica {
    private CaixaDeSom caixas;
    private Display display;
    
    public PlayerDeMusica(){
        caixas = new CaixaDeSom();
        display = new Display();
    }
    
    public void play(Musica m){
        display.exibirDados(m.getNome());
        caixas.emitirSom(m.getFaixa());
    }
    
}
