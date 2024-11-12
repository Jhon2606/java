/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class Musica {
    private String nome;
    private String faixa;

    public Musica(String nome, String faixa) {
        this.nome = nome;
        this.faixa = faixa;
    }
    
   
    public String getFaixa() {
        return faixa;
    }

    public String getNome() {
        return nome;
    }

    
}
