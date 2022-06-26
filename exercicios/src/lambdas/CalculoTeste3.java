//Aula 172 - Primeira Fun��o Lambda

package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// Cria��o de uma fun��o an�nima
		BinaryOperator<Double> calc = (x, y) -> {// BinaryOperator � uma opera��o que recebe dois par�metro de um tipo e
													// os retorna no mesmo tipo
			return x + y;
		}; // Defini��o da fun��o soma com o retorno da soma dos par�metros x e y
			// Chamada da soma
		System.out.println(calc.apply(2.0, 3.0)); // A vari�vel cal � do tipo Calculo

		calc = (x, y) -> x * y; // Quando a fun��o lambda n�o recebe as chaves, implicitamente h� o return
		// Chamada da multiplica��o
		// A fun��o lambda recebe os par�metros e os utiliza com os s�mbolos "->"
		System.out.println(calc.apply(2.0, 3.0));
//		System.out.println(calc.legal());//M�todo default, oriundo da interface Calculo (m�todo abstrato)

		BinaryOperator<Integer> calc2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calc2.apply(2, 3));
	}
}
