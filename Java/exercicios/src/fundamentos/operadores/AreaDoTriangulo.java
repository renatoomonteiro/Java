package fundamentos.operadores;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valor1 = JOptionPane.showInputDialog("Informe o valor da base do triângulo");
		Double base = Double.parseDouble(valor1.replace(",", "."));

		String valor2 = JOptionPane.showInputDialog("Informe o valor da altura do triângulo");
		Double altura = Double.parseDouble(valor2.replace(",", "."));

		DecimalFormat formatador = new DecimalFormat("0.0");
		Double area = (base * altura) / 2;

		System.out.println("A área do triângulo é: " + formatador.format(area));
	}
}
