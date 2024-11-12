/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void addContato(Contato c) {
        contatos.add(c);
    }

    public Contato getContatoPorNome(String nome) {
        Contato retorno = null;
        for (Contato c : contatos) { 
            if (c.getNome().equalsIgnoreCase(nome)) {
                retorno = c;
                break;
            }
        }
        return retorno;
    }

    public boolean removeContatoPorNome(String nome) {
        boolean achou = false;
        Iterator<Contato> it = contatos.iterator();
        while (it.hasNext()) {
            if (it.next().getNome().equals(nome)) {
                it.remove();
                achou = true;
                break;
            }
        }
        return achou;
    }

    public int getSize() {
        return contatos.size();
    }

    public List<Contato> getAllContatos() {
        return new ArrayList<>(contatos);
    }

}
