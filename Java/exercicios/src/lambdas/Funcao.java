//Aula 181 - Function
package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";

		Function<String, String> oResultadoE = valor -> "O resultado é " + valor;

		Function<String, String> empolgado = valor -> valor + " !!!";

		Function<String, String> duvida = valor -> valor + " ???";

		String resultadoFinal1 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		// Verifica se é par ou ímpar, então concatena as String oResultadoE e empolgado
		// com o parâmetro 32

		System.out.println(resultadoFinal1);

		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);

		System.out.println(resultadoFinal2);
		System.out.println(parOuImpar.apply(3)); // "Ímpar"
		System.out.println(parOuImpar.apply(30)); // "Par"

	}

}
