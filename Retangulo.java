/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.oo.java.aula1;

/**
 *
 * @author ice
 */
public class Retangulo {
    private double largura, altura;
    
    public Retangulo(double a, double b){
        if (a <= 0){
            a = 1;
        }
        if (b <= 0){
            b = 1;
        }
        largura = a;
        altura = b;
    }
    public double getArea(){
        double area = largura*altura;
        return area;
    }
    public double getPerimetro(){
        double perimetro = (altura*2.0) + (largura*2.0);
        return perimetro;
    }
    public void redimensionar(double fator){
        altura = altura * fator;
        largura = largura *fator;
    }
    public void exibeInfo() {
         System.out.println("A altura é: "+altura+", a largura é: "+largura+", a área é: "+ getArea() +", e o perímetro é: " + getPerimetro());
    }
}
