//Aula 172 - Primeira Fun��o Lambda
//Aula 173 - Interface Funcional
package lambdas;

@FunctionalInterface
//For�a a interface a ter apenas um m�todo
public interface Calculo {
	public abstract double executar(double a, double b); // A classe Calculo possui um m�todo executar, que recebe dois
	// par�metros.
	// N�o permite a cria��o de outro m�todo no modo FuncionalInterface
	// double teste();

	default String legal() {// M�todos default n�o d�o problemas em Interfaces
		return "legal";
	}

	static String muitoLegal() {
		return "Muito legal";
	}
}
