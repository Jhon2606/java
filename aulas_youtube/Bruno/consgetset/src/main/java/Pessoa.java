/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SalvadorDonesta
 */
public class Pessoa {
   private String nome;
   private double altura;
   
   public String getNome(){
       return this.nome;
   } 
   public double getAltura(){
       return this.altura;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   public void setAltura(double altura){
       this.altura = altura;
   }
   public Pessoa(){
   }
   
   public Pessoa(String nome, double altura){
       this.nome = nome;
       this.altura = altura;
   }
   
   
}
