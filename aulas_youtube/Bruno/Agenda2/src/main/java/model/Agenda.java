/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SalvadorDonesta
 */
public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }
    
    
    public void addContato(Contato c){
        contatos.add(c);
    }
    
    public Contato buscaContato(String nome){
        Contato resultado = null;
        for (Contato c : contatos){
            if ( c.getNome().equalsIgnoreCase(nome)){
                resultado = c;
                break;
            }

        }
        return resultado;
        
    }
    
    public int getNumeroContatos(){
        return contatos.size();
    }
    
}
