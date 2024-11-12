/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaAgenda {
    public static void main(String[] args){
        Agenda a = new Agenda();
        
        Contato c1 = new Contato("Bruno", "12341324");
        Contato c2 = new Contato ("Fulano", "21341243");
        
        a.inserirContato(c1);
        a.inserirContato(c2);
        a.inserirContato(new Contato("Beltrano","12341234"));
        a.inserirContato(new Contato("Teste","010101"));
        
       // System.out.println(a);
        
        a.removerContato("Teste");
        
        //System.out.println(a);
        
        Contato busca = a.pesquisarContato("Dodó");
        if (busca != null){
            System.out.println(busca.getNome() + '\n' + busca.getTelefone());
        } else {
            System.out.println("Contato não localizado na agenda.");
        }
        
        
        System.out.println(a);
        
        
        if ( a.alterarTelefoneContato("2sadf", "02020202") ){
            System.out.print("Telefone alterado com sucesso");
        } else {
            System.out.print("Contato não localizado na agenda.");
        }
        
        System.out.println(a);
        
        
    }
    
}
