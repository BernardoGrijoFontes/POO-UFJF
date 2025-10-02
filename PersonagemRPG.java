/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.oo.java.aula1;

/**
 *
 * @author ice
 */
public class PersonagemRPG {
    private String nome, classe;
    private int nivel, vidaAtual, vidaMaxima, manaAtual, manaMaxima, forca, inteligencia, agilidade, destreza, experiencia;
    
    public PersonagemRPG(String nome, String classe, int forca, int inteligencia, int destreza, int agilidade){
        if (forca > 10 || inteligencia > 10 || destreza > 10 || agilidade > 10){
            System.out.println("Todos os atributos devem ser menores que 10!");
        }
        else{
            if (classe.equals("mago") || classe.equals("guerreiro") || classe.equals("arqueiro")){
                this.nome = nome;
                this.classe = classe;
                this.forca = forca;
                this.inteligencia = inteligencia;
                this.destreza = destreza;
                this.agilidade = agilidade;
                vidaMaxima = 100;
                manaMaxima = 50;
                vidaAtual = vidaMaxima;
                manaAtual = manaMaxima;
                nivel = 1;
                experiencia = 0;
            }
            else {
                System.out.println("As classes só podem ser: mago, guerreiro ou arqueiro");
            }
        }
    }
    public int atacar(){
        int atributo_dominante = 0;
        if (this.classe.equals("mago")){
            atributo_dominante = inteligencia;
        }
        if (this.classe.equals("guerreiro")){
            atributo_dominante = forca;
        }
        if (this.classe.equals("arqueiro")){
            atributo_dominante = (destreza+agilidade)/2;
        }
        int dano = atributo_dominante * (nivel / 2 + 1);
        return dano;
    }
    public void sofrerDano(int d){
        vidaAtual = vidaAtual - d;
    }
    public void restaurarVida(){
        while(vidaAtual < vidaMaxima){
            vidaAtual++;
        }
    }
    public void restaurarMana(){
        while(manaAtual < manaMaxima){
            manaAtual++;
        }
    }
    public void ganharExperiencia(int e){
        if (e >= 100){
            System.out.println("O valor da expêriencia tem que ser menor que 100");
        }
        else{
            experiencia = experiencia + e;
            if (experiencia >= 100){
                this.nivel = this.nivel + 1;
                experiencia = experiencia - 100;
                vidaMaxima += 10;
                manaMaxima += 5;
                this.forca += 2;
                this.inteligencia += 2;
                this.agilidade += 1;
                this.destreza += 1;
                vidaAtual = vidaMaxima;
                manaAtual = manaMaxima;
            }
        }
        
    }
    public boolean vivo(){
        if (vidaAtual>0){
            return true;
        }
        else { 
            return false;
        }
    }
    public void exibirInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Classe: "+this.classe);
        System.out.println("Nível: "+ nivel);
        System.out.println("Experiência" + experiencia);
        System.out.println("Vida atual: " + vidaAtual);
        System.out.println("Mana atual: " + manaAtual);
        System.out.println("Força: " + this.forca);
        System.out.println("Destreza: " + this.destreza);
        System.out.println("Agilidade: " + this.agilidade);
        System.out.println("Inteligencia: " + this.inteligencia);
        if (vivo() == true){
            System.out.println("Está vivo");
        }
        else {
            System.out.println("Está morto");
        }
    }
    
}
