//Aula 180 - Consumer
package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer: Representa uma opera��o que aceita um �nico argumento de entrada e n�o retorna nenhum resultado.
public class Consumidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + " !!!");// Exibir apenas o nome do produto

		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("Notebook", 2987.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 07.80, 0.18);
		Produto p5 = new Produto("L�pis", 4.39, 0.19);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.printf("%.2f\n", p.preco));
		produtos.forEach(System.out::println);

	}

}
