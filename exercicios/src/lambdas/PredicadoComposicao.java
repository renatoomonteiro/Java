//Aula 182 - Predicate #02

package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isPar = num -> num % 2 == 0; // Retorno booleano

		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999; // Retorno booleano

		// Chamada da fun��o isPar, atrubu�da a uma lambda, para verificar se � par.
		System.out.println(isPar.test(22));
		// Chamada da fun��o isTresDigitos atrubu�da a uma lambda, para verificar se tem
		// ou n�o tr�s d�gitos.
		System.out.println(isTresDigitos.test(10));
		//Utilizando ambas fun��es
		System.out.println(isPar.and(isTresDigitos).test(123));
		System.out.println(isPar.and(isTresDigitos).negate().test(12));//Nega��o
		System.out.println(isPar.or(isTresDigitos).test(123));
		
	}

}
