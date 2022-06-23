package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	// Método construtor sem parâmetro
	Produto() {

	}

	// Método construtor com parâmetro
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

//o método precoComDesconto não precisa receber parâmetros pois
// as variáveis preco e desconto fazem parte da mesma classe

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
