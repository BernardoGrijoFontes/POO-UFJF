/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.ufjf.dcc.loja;

public class PrincipalLoja {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.50, 100);

        // Tentativas de acesso:

        // System.out.println(produto1.nome); 
        // Erro: 'nome' é private, não é acessível fora da classe Produto.

        System.out.println("Nome do produto (via getter): " + produto1.getNome()); 
        // Funciona: getNome() é público.

        System.out.println("Preço do produto: " + produto1.preco); 
        // Funciona: preco tem acesso default (mesmo pacote).

        System.out.println("Estoque do produto: " + produto1.estoque); 
        // Funciona: estoque é público.

        // produto1.alterarNome("Feijão");
        // Erro: método alterarNome() é privado.

        produto1.setNome("Feijão");
        // Funciona: setNome() é público.

        produto1.alterarPreco(12.0);

        produto1.alterarEstoque(80);
        // Funciona: método público.

        System.out.println("Novo nome: " + produto1.getNome());
        System.out.println("Novo preço: " + produto1.preco);
        System.out.println("Novo estoque: " + produto1.estoque);
    }
}

