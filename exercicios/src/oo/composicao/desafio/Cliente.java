package oo.composicao.desafio;

import java.util.ArrayList;
//import java.util.List;

public class Cliente {

	final String nome;
	final ArrayList<Compra> compras = new ArrayList<Compra>();

	Cliente(String nome) {
		this.nome = nome;
	}

//M�todo que adiciona compra atrav�s da classe Compra
	void adcionarCompra(Compra compra) {
		this.compras.add(compra);
	}

	double obterValorTotal() {
		double total = 0;

		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}

}
