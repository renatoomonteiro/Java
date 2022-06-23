//Aula 140. Relacionamento Um Pra Um
package oo.composicao;

public class Motor {

	Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;

	Motor(Carro carro) {
		this.carro = carro;
	}

	int giros() {
		if (!ligado) {// Se for diferente de ligado
			return 0; // Retornará 0, sem giro no motor
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
