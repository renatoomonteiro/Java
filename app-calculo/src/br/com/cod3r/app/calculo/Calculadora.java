//Aula 363 - Requires/Exports

package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;
import br.com.cod3r.app.logging.Logger;

public class Calculadora {

	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritimeticas.soma(nums);
	}
//	// Método que retorna uma classe de Logger
//	public Class<Logger> getLoggerClass() {
//		return Logger.class;
//	}
	
}
