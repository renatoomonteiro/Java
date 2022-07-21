//Aula 172 - Primeira Função Lambda

package lambdas;

public class Somar implements Calculo {

	public double executar(double a, double b) { // A classe Somar, implementa a interface Calculo
		return a + b; // que por sua vez, retorna a soma dos dois parâmetros
	}

}
