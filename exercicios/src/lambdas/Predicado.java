//Aula 179 - Predicate #01
package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {

		Predicate<Produto> isCaro =
				// Se o produto com o desconto tiver valor maior que R$750
				// Ser� considerado caro.
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;

		Produto produto = new Produto("Notebook", 3893.89, 0.15);

		System.out.println(isCaro.test(produto));
	}
}
