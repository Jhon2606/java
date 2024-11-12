/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Agenda;
import model.Contato;
import view.TelaManter;

/**
 *
 * @author SalvadorDonesta
 */
public class ManterController {

    TelaManter tela;
    Agenda agenda;

    public ManterController() {
        tela = new TelaManter();
        agenda = new Agenda();

        //Definindo os listeners        
        //1 - Aba de consulta da agenda
        //Botão de busca
        tela.getBtnBuscarConsulta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarNome();
            }
        });
        //Botão exibir todos contatos
        tela.getBtnExibirTodos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirTodos();
            }
        });
        //Botão limpar tabela
        tela.getBtnLimpar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparTabela();
            }
        });

        //2 - Aba de cadastramento
        //Botão de busca
        tela.getBtnSalvarCadastrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarContato();
            }
        });

        tela.config();
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

    }

    public void buscarNome() {
        DefaultTableModel md = (DefaultTableModel) tela.getTblConsultar().getModel();
        md.setRowCount(0);
        md.setRowCount(10);
        String mensagem = "";
        tela.getLblResultadoConsulta().setText(mensagem);
        String nome = tela.getTxtNomeConsulta().getText();
        Contato c = agenda.getContatoPorNome(nome);
        if (c != null) {

            md.setValueAt("1", 0, 0);
            md.setValueAt(c.getNome(), 0, 1);
            md.setValueAt(c.getTelefone(), 0, 2);
        } else {
            mensagem = nome + " não localizado na agenda!";
            System.out.println(agenda.getSize());
            if (agenda.getSize() == 0) {
                mensagem += " A agenda não possui contatos cadastrados.";
            }
            tela.getLblResultadoConsulta().setText(mensagem);
        }

    }

    public void exibirTodos() {

        DefaultTableModel md = (DefaultTableModel) tela.getTblConsultar().getModel();
        md.setRowCount(0);
        md.setRowCount(10);
        List<Contato> contatos = agenda.getAllContatos();
        if (contatos.size() > 0) {
            tela.getLblResultadoConsulta().setText("");
            int i = 0;
            for (Contato c : contatos) {
                md.setValueAt(i + 1, i, 0);
                md.setValueAt(c.getNome(), i, 1);
                md.setValueAt(c.getTelefone(), i, 2);
                i++;
            }
        } else {
            tela.getLblResultadoConsulta().setText("Nenhum contato na agenda!");

        }

    }

    public void limparTabela() {

        DefaultTableModel md = (DefaultTableModel) tela.getTblConsultar().getModel();
        md.setRowCount(0);
        md.setRowCount(10);
    }

    //métodos do listener para a aba cadastramento
    public void cadastrarContato() {
        String nome = tela.getTxtNomeCadastrar().getText();
        String telefone = tela.getTxtTelefoneCadastar().getText();
        Contato novo = new Contato(nome, telefone);
        agenda.addContato(novo);
        JOptionPane.showMessageDialog(tela, "Contato registrado com sucesso");
    }

  

}
