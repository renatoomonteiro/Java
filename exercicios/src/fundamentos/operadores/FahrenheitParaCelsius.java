package fundamentos.operadores;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class FahrenheitParaCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Criar um programa que leia a temperatura em Fahrenheit 
		 e converta para Celsius.
		 * */
		
		String fah = JOptionPane.showInputDialog("Informe a temperatura em Fahrenheit: ");
		double fah_convert = Double.parseDouble(fah);
		final double C = 32.0;
		final double FATOR = 5.0 / 9.0;
		DecimalFormat formatador = new DecimalFormat("0.0");
		
		System.out.printf(fah + "ºF equivalem a " +  formatador.format((fah_convert - C) * FATOR) + "ºC" );
		
	}

}
