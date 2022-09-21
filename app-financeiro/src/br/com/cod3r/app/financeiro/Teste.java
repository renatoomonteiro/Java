//Aula 363 - Requires/Exports
// Aula 366 - Módulos e Reflection

package br.com.cod3r.app.financeiro;
import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		
//		Calc c1 = new CalcImpl1();
//		Calc c2 = new CalcImpl2();
//		
//		System.out.println(c1.soma(1,2,3));
//		System.out.println(c2.soma(1,2,3));
		

		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
				
		System.out.println(calc.soma(2, 3, 4));

		//System.out.println(calc.getLoggerClass());
		
//		OperacoesAritimeticas op = new OperacoesAritimeticas();
//		System.out.println(op.soma(4, 5, 6));
		
		//Buscando o campo id, dentro da classe Calculadora
//		System.out.println(CalculadoraImpl.class.getDeclaredFields()[0].getName());
		//Alterar o conteúdo da variável id , identificada aqui como fieldId, só foi possível
		// pois o módulo cálculo está aberto para financeiro 
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc, "def");
			fieldId.setAccessible(false);
			
			System.out.println(calc.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
