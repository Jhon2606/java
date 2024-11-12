/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Agenda;
import model.Contato;
import view.TelaPrograma;

/**
 *
 * @author SalvadorDonesta
 */
public class ManterAgendaController {
    private Agenda minhaAgenda;
    private TelaPrograma tela;

    public ManterAgendaController() {
        minhaAgenda = new Agenda();
        tela = new TelaPrograma();
        
        tela.getBtnSalvar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarContato();
            }
        }
        );
        
        tela.getBtnBuscarContato().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarContato();
            }
        });
        
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        
        
    }
    
    public void salvarContato(){
        String nome = tela.getTxtNomeCadastro().getText();
        String telefone = tela.getTxtTelefoneCadastro().getText();
        Contato c = new Contato(nome, telefone);
        minhaAgenda.addContato(c);
        
    }
    
    public void buscarContato(){
        String nomeBusca = tela.getTxtNomeBusca().getText();
        Contato c = minhaAgenda.buscaContato(nomeBusca);
        if ( c!= null ){
            tela.getTxtNomeResultadoBusca().setText(c.getNome());
            tela.getTxtTelefoneResultadoBusca().setText(c.getTelefone());
        } else {
            JOptionPane.showMessageDialog(tela, "Contato de nome " + nomeBusca + " não localizado.");
        }
    }
    
    
}
