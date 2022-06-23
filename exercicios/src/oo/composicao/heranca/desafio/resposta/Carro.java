package oo.composicao.heranca.desafio.resposta;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	protected int delta = 5;

//Construtor padr�o, com o par�metro CONSTANTE VELOCIDADE_MAXIMA
//que recebe um dado do tipo int
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	void frear() {
		if (velocidadeAtual >= 5)
			velocidadeAtual -= 5;
		else {
			velocidadeAtual = 0;
		}
	}

//M�todo que tr�s um texto padr�o para
//exibi��o quando for chamado em outra classe
	public String toString() {
		return "Velocidade atual � " + velocidadeAtual + " Km/h.";
	}
}
