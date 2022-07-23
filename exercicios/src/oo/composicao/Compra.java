//Aula 141. Relacionamento Um Pra Muitos
package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();

	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}

	void adicionarItem(Item item) {
		this.itens.add(item); // Referência bidirecional de Compra.Itens
		item.compra = this; // Referência bidirecional de Item.Compra
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
}
