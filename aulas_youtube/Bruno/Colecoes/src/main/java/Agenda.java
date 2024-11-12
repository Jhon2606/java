
import java.util.ArrayList;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class Agenda {
    
    private ArrayList<Contato> contatos;
    
    public Agenda(){
        contatos = new ArrayList<>();
    }
    
    
    public void inserirContato(Contato c){
        contatos.add(c);
    }   
    
    public boolean removerContato(String nome){
        Contato localizado = pesquisarContato(nome);
        if (localizado != null){
            contatos.remove(localizado);
            return true;
        } else {
            return false;
        }
    }

    public Contato pesquisarContato(String nome){
        Contato localizado = null;
        for (Contato c : contatos){
            if (c.getNome().equals(nome)){
                localizado = c;
                break;
            }
            
        }
        return localizado;
    }
    
    public boolean alterarTelefoneContato(String nome, String novoTelefone){
        boolean retorno = false;
        Contato alterar = pesquisarContato(nome);
        if (alterar != null){
            alterar.setTelefone(novoTelefone);
            retorno = true;
        }
        return retorno;
    }
    
    @Override
    public String toString(){
        String temp = "\nContatos";
        int i = 0;
        for (Contato c : contatos){
            i++;
            temp += "\n" + i + "\n" + c.getNome() + '\n' + c.getTelefone();
        }
        return temp;
    }
    
    
}
