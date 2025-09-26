/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.aula1poo;

/**
 *
 * @author ice
 */
public class Carro {
        boolean ligado;
        String nome;
        String marca;
        boolean alcool;
        boolean gasolina;
        int marcha;
        float nota;
        String cor;
        int velocidade;
        
      public Carro(String n, String m, boolean a,boolean g, String cor, int nota){
          marca = m;
          nome = n;
          alcool = a;
          gasolina = g;
          this.cor = cor;
          this.nota = nota; 
      }
       public void flex()
       {
           if(gasolina && alcool){
               System.out.println("è");
                       }else{
               System.out.println("não é");
           } 
       }
       public void acelera(){
           if (velocidade <= 150){
               velocidade = velocidade + 10;
           }
           else {
               System.out.println("Velocidade máxima atingida");
           }
       }
       
       public void desacelera(){
           if (velocidade >= 10){
               velocidade = velocidade - 10;
           }
           else {
               System.out.println("Velocidade mínima atingida");
           }
       }
       
       public void imprimeVelocidade(){
           System.out.println(velocidade);
       }
       
       public void acelerarQuanto(int args){
           velocidade = velocidade + args;
       }
       
       public void liga(){
           ligado = true;   
       }
}
