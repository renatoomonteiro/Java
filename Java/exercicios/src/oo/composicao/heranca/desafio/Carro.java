package oo.composicao.heranca.desafio;

public class Carro {
	double velocidadeAtual = 100.0;

	public double acelerar() {
		if (velocidadeAtual > 0.0) {
			velocidadeAtual += 5.0;
		}
		return velocidadeAtual;
	}

	public double frear() {
		if (velocidadeAtual > 0.0) {
			velocidadeAtual -= 5.0;
		}
		return velocidadeAtual;
	}

}
