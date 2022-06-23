package oo.composicao.desafio;

public class Produto {
	String nome;
	double preco;

//Método construtor da classe Produto com os parâmetros.
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

//	Curso(String nome) {
//		this.nome = nome;
//	}
	
	Produto(String nome){
		this.nome = nome;
	}
}
