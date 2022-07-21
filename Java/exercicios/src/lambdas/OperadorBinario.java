//Aula 185 - Binary Operator e BiFunction

package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Double> media = (Double n1, Double n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(9.8, 5.7)); // ? = true ; : = false
		// se resultado >= 7 "Aprovado" senão "Reprovado"
		 //BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >=
		 //7 ? "Aprovado" : "Reprovado";

		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado";
		};

		System.out.println(resultado.apply(9.7, 5.1));
		System.out.println(resultado.apply(3.7, 5.1));

		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";

		// Dividindo em partes menores
		// Chama a função média e compara o resultado com o conceito
		// Para dar o retorno de aprovado ou não
		System.out.println(media.andThen(conceito).apply(8.7, 9.75));

	}

}
