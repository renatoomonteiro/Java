//Aula 197 - Desafio Map
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		/*
		 * 1) N�mero para string bin�ria: 6 = 110; 2) Inverter a String: "110" = "011";
		 * 3) Converter de volta para inteiro: "011" = 3
		 */

		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2); // Converte uma string bin�ria para um
																				// valor inteiro
		nums.stream() // Cole��o de dados
		.map(Integer::toBinaryString) // Converte de inteiro para bin�rio
		.map(inverter).map(binarioParaInt).forEach(System.out::println); // ForEach para exibir os valores
	}
}
