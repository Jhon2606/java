/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p0 = new Pessoa();
        System.out.println(p0.getNome());//null
        System.out.println(p0.getAltura());//0.0
        
        Pessoa p1 = new Pessoa("Bruno", 1.75);//instanciação da classe Pessoa
        System.out.println(p1.getNome());//Bruno
        System.out.println(p1.getAltura());//1.75
        
        p1.setNome("Ferdinandison");
        p1.setAltura(1.70);
        
        System.out.println(p1.getNome());//Ferdinandison
        System.out.println(p1.getAltura());//1.70
    }
}
