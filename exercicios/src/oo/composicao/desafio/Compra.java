package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> itens = new ArrayList<Item>();

	// O método adicionarItem recebe dois parâmetros, p e qtde.
//depois ele instancia a classe Item com os dosi parâmetros p e qtde
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}

//Método adicionarItem, com assinatura diferente, pois leva três parâmetros, nome,
//preco e qtde.
	void adicionarItem(String nome, double preco, int qtde) {
//Criação de uma variável por inferência, produto, que recebe a classe Produto com seus 
//dois parâmetros, nome e preco
		var produto = new Produto(nome, preco);
//Adiciona ao itens, que é do tipo ArrayList, os itens contidos na classe Item, com seus dois
//parâmetros, produto e qtde
		this.itens.add(new Item(produto, qtde));
	}

	double obterValorTotal() {
		double total = 0;
//Para a variávem item, que é um ArrayList de itens, 
		for (Item item : itens) {
//Adiciona a multiplicação da quantidade vezes o valor do produto
			total += item.quantidade * item.produto.preco;
		} // Retorna o total
		return total;
	}
}
