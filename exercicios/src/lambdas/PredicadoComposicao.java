//Aula 182 - Predicate #02

package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isPar = num -> num % 2 == 0; // Retorno booleano

		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999; // Retorno booleano

		// Chamada da função isPar, atrubuída a uma lambda, para verificar se é par.
		System.out.println(isPar.test(22));
		// Chamada da função isTresDigitos atrubuída a uma lambda, para verificar se tem
		// ou não três dígitos.
		System.out.println(isTresDigitos.test(10));
		//Utilizando ambas funções
		System.out.println(isPar.and(isTresDigitos).test(123));
		System.out.println(isPar.and(isTresDigitos).negate().test(12));//Negação
		System.out.println(isPar.or(isTresDigitos).test(123));
		
	}

}
