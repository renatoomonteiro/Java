package fundamentos.operadores;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class AoQuadradoEAoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

		String valor = JOptionPane.showInputDialog("Informe um valor");
		Double quadCub = Double.parseDouble(valor.replace(",", "."));

		DecimalFormat formatador = new DecimalFormat("0.0");
		// Forma simples:
		// Double quadrado = quadCub * quadCub;
		// Double cubo = quadCub * quadCub * quadCub;

		// Forma com cálculo matemático:
		Double quadrado = Math.pow(quadCub, 2);
		Double cubo = Math.pow(quadCub, 3);

		System.out.println("O valor ao quadrado é: " + formatador.format(quadrado) + "\nO valor ao cubo é: "
				+ formatador.format(cubo) + ".");
	}

}
