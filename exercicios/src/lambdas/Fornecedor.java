//Aula 183 - Supplier

package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		// Quando não há parâmetros ou quando há mais
		// de um parâmetro, deve-se utilizar parênteses na função lambda.
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Lia", "Bia", "Gui");

		System.out.println(umaLista.get());// Chamada do Supplier
	}

}
