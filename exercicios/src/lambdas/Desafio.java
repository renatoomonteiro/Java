//Aula 186 - Desafio Binary Operator

package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
				
		Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final é " + preco);

		/*
		 * 1) A partir do produto, calcular o preco real (com desconto); 
		 * 2) Imposto Municipal, se o valor for >= 2500, terá (8,5%), do contrário, ficará isento;
		 * 3) Frete: Se o produto tiver valor >= 3000, o frete será de 100, mais que isso, será de 50; 
		 * 4) Arredondar o valor para ter apenas duas casas decimais;
		 * 5) Formatar: Deverá ficar da seguinte forma R$ 1234,56.
		 */
			}
}
