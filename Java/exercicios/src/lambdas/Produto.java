//Aula 179 - Predicate #01
package lambdas;

public class Produto extends Object {
	final String nome;
	final double preco, desconto;

//Construtor automático utilizando campos:
	// Clique direito > source > Gerenate constructor using fields
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return nome + " tem preco de " + precoFinal;
	}

}
