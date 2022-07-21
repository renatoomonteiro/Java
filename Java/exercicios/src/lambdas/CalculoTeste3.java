//Aula 172 - Primeira Função Lambda

package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// Criação de uma função anônima
		BinaryOperator<Double> calc = (x, y) -> {// BinaryOperator é uma operação que recebe dois parâmetro de um tipo e
													// os retorna no mesmo tipo
			return x + y;
		}; // Definição da função soma com o retorno da soma dos parâmetros x e y
			// Chamada da soma
		System.out.println(calc.apply(2.0, 3.0)); // A variável cal é do tipo Calculo

		calc = (x, y) -> x * y; // Quando a função lambda não recebe as chaves, implicitamente há o return
		// Chamada da multiplicação
		// A função lambda recebe os parâmetros e os utiliza com os símbolos "->"
		System.out.println(calc.apply(2.0, 3.0));
//		System.out.println(calc.legal());//Método default, oriundo da interface Calculo (método abstrato)

		BinaryOperator<Integer> calc2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calc2.apply(2, 3));
	}
}
