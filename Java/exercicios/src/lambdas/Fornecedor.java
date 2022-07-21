//Aula 183 - Supplier

package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		// Quando n�o h� par�metros ou quando h� mais
		// de um par�metro, deve-se utilizar par�nteses na fun��o lambda.
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Lia", "Bia", "Gui");

		System.out.println(umaLista.get());// Chamada do Supplier
	}

}
