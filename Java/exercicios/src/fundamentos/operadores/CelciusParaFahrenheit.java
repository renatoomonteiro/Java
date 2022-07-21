package fundamentos.operadores;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CelciusParaFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um programa que leia a temperatura em Fahrenheit e converta para
		 * Celsius.
		 */

		String cel = JOptionPane.showInputDialog("Informe a temperatura em Celcius: ");
		double cel_convert = Double.parseDouble(cel);
		final double F = 32.0;
		final double FATOR = 9.0 / 5.0;
		DecimalFormat formatador = new DecimalFormat("0.0");

		System.out.printf(cel + "ºC equivalem a " + formatador.format((cel_convert * FATOR)+F) + "ºF");

	}

}