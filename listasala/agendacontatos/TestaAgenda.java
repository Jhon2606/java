/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendacontatos;

/**
 *
 * @author Bruno
 */
public class TestaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contato c1 = new Contato("Edgar", "1234123");
        Contato c2 = new Contato("Ze", "34123");
        Contato c3 = new Contato("Ciclano", "4123");
        Contato c4 = new Contato("Mardinaldo", "564123");
        Contato c5 = new Contato("Edgar", "9234123");
        
        
        Agenda agenda = new Agenda(6);
        agenda.addContato(c1);
        agenda.addContato(c2);
        agenda.addContato(c3);
        agenda.addContato(c4);
        agenda.addContato(c5);
        
        System.out.println(agenda.listarContatos());
        
        agenda.addContato(new Contato("Edgar", "891234555"));
        agenda.addContato(new Contato("Cabide", "71234555"));
        
        System.out.println(agenda.listarContatos());
        
        agenda.removerContatoPrimeiraOcorrenciaApenas("Edgar");
        //caso queira testar a remoção de todos os contatos com um nome informado, remova o comentário da linha abaixo.
        agenda.removerContatoTodasOcorrencias("Edgar");
        
        System.out.println(agenda.listarContatos());
        System.out.println(agenda.tamanho());
        agenda.limpar();
        System.out.println("imprimindo a agenda após \"limpar\" todos os contatos");
        System.out.println(agenda.listarContatos());
    }
    
}
