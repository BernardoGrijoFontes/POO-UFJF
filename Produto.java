/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.loja;

public class Produto {
    private String nome;     
    double preco;         
    public int estoque;      

    // Construtor
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Método privado, só pode ser chamado dentro da classe
    private void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    // Método público que usa o privado internamente
    public void setNome(String novoNome) {
        alterarNome(novoNome);
    }

    public String getNome() {
        return nome;
    }

    void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarEstoque(int novoValor) {
        this.estoque = novoValor;
    }
}
