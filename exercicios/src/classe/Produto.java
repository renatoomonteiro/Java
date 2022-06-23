package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	// M�todo construtor sem par�metro
	Produto() {

	}

	// M�todo construtor com par�metro
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

//o m�todo precoComDesconto n�o precisa receber par�metros pois
// as vari�veis preco e desconto fazem parte da mesma classe

	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
