//Aula 363 - Requires/Exports
// Aula 366 - Módulos e Reflection

package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{

	private String id = "abc";
	
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritimeticas.soma(nums);
		
	
	}
//	// Método que retorna uma classe de Logger
//	public Class<Logger> getLoggerClass() {
//		return Logger.class;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
