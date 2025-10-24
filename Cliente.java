/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.cliente;

import br.ufjf.dcc.loja.Produto;

public class Cliente {
    public static void main(String[] args) {
        Produto produto2 = new Produto("Notebook", 3500.0, 10);

        // System.out.println(produto2.nome);
        // Erro: nome é private, inacessível fora da classe Produto.

        System.out.println("Estoque do produto: " + produto2.estoque);
        // Funciona: estoque é público.

        System.out.println("Nome do produto: " + produto2.getNome());
        // Funciona: getNome() é público.

        // produto2.alterarNome("Tablet");
        // Erro: método privado, inacessível fora da classe.

        produto2.setNome("Tablet");
        // Funciona: método público.

        produto2.alterarEstoque(5);
        // Funciona: método público.

        System.out.println("Novo nome: " + produto2.getNome());
        System.out.println("Novo estoque: " + produto2.estoque);
    }
}