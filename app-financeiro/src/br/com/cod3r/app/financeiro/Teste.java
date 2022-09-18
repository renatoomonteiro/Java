//Aula 363 - Requires/Exports

package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3, 4));

		//System.out.println(calc.getLoggerClass());
		
		OperacoesAritimeticas op = new OperacoesAritimeticas();
		System.out.println(calc.soma(4, 5, 6));
	}

}
