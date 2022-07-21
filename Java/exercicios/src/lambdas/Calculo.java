//Aula 172 - Primeira Função Lambda
//Aula 173 - Interface Funcional
package lambdas;

@FunctionalInterface
//Força a interface a ter apenas um método
public interface Calculo {
	public abstract double executar(double a, double b); // A classe Calculo possui um método executar, que recebe dois
	// parâmetros.
	// Não permite a criação de outro método no modo FuncionalInterface
	// double teste();

	default String legal() {// Métodos default não dão problemas em Interfaces
		return "legal";
	}

	static String muitoLegal() {
		return "Muito legal";
	}
}
