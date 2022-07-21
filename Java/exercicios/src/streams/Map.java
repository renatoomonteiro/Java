//Aula 196 - Map #02
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("bmw ", "Audi ", "Honda ");

		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		// charAt(0) pega a primeira letra, pois o parâmetro é o
		// caractere na posição 0 do array de string
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n + "!!! ";

		// Pega a string, utiliza a primeira letra, converte em maiúscula e concatena
		// com !!!
		// System.out.println("\n" +
		// maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));

		System.out.println("\n\nUsando composição");
		marcas.stream()
		.map(Utilitarios.maiuscula)
		.map(primeiraLetra)
		.map(Utilitarios::grito)
		.forEach(print);

	}

}
