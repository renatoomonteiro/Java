package streams;

public class Produto {
	final String nome;
	final double preco, desoconto, valorFrete;

	public Produto(String nome, double preco, double desoconto, double valorFrete) {
		this.nome = nome;
		this.preco = preco;
		this.desoconto = desoconto;
		this.valorFrete = valorFrete;
	}

}
