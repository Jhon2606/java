/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaArraysReferencias {

    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = new Pessoa("Bruno");
        pessoas[1] = new Pessoa("Clovenildo");
        int i = 0;
        while (pessoas[i] != null && i < pessoas.length){
            System.out.println(pessoas[i].getNome());
            i++;
        }
    }
}
