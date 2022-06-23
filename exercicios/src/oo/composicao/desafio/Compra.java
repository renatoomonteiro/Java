package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> itens = new ArrayList<Item>();

	// O m�todo adicionarItem recebe dois par�metros, p e qtde.
//depois ele instancia a classe Item com os dosi par�metros p e qtde
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}

//M�todo adicionarItem, com assinatura diferente, pois leva tr�s par�metros, nome,
//preco e qtde.
	void adicionarItem(String nome, double preco, int qtde) {
//Cria��o de uma vari�vel por infer�ncia, produto, que recebe a classe Produto com seus 
//dois par�metros, nome e preco
		var produto = new Produto(nome, preco);
//Adiciona ao itens, que � do tipo ArrayList, os itens contidos na classe Item, com seus dois
//par�metros, produto e qtde
		this.itens.add(new Item(produto, qtde));
	}

	double obterValorTotal() {
		double total = 0;
//Para a vari�vem item, que � um ArrayList de itens, 
		for (Item item : itens) {
//Adiciona a multiplica��o da quantidade vezes o valor do produto
			total += item.quantidade * item.produto.preco;
		} // Retorna o total
		return total;
	}
}
