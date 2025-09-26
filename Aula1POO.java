/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.ufjf.dcc.aula1poo;

/**
 *
 * @author ice
 */
public class Aula1POO {

 
    public static void main(String[] args) {
        Carro um = new Carro("fiesta","ford",true,false,"#ff023990",7); 
        um.flex();
        um.acelerarQuanto(15);
        um.imprimeVelocidade();
        
    }
}
