package fundamentos.operadores;

import javax.swing.JOptionPane; //Op��es com bot�es.
//import java.text.DecimalFormat; //Formatador de casas decimais.

public class Equacao2Grau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar um programa que resolve equa��es do segundo grau (ax2 + bx + c = 0)
		 * utilizando a f�rmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
		 * Encontre o delta
		 */

		String valorA = JOptionPane.showInputDialog("F�rmula de Bhaskara.\nInforme um valor para a vari�vel a: ");
		Double a = Double.parseDouble(valorA.replace(",", "."));

		String valorB = JOptionPane.showInputDialog("F�rmula de Bhaskara.\nInforme um valor para a vari�vel b: ");
		Double b = Double.parseDouble(valorB.replace(",", "."));

		String valorC = JOptionPane.showInputDialog("F�rmula de Bhaskara.\nInforme um valor para a vari�vel c: ");
		Double c = Double.parseDouble(valorC.replace(",", "."));

		System.out.printf("Sua equa��o �: %.1fx� + %.1fx + %.1f = 0", a, b, c);

		Double delta = (b * b) - (4 * a * c);

		System.out.printf("\nO delta �: %.1f", delta);

		Double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x1 da equa��o �: %.1f", x1);

		Double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equa��o �: %.1f", x2);
		
//		O x1 da equa��o �: NaN
//		O x2 da equa��o �: NaN
	}
}
