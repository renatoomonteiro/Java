package fundamentos.operadores;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class AreaDoTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valor1 = JOptionPane.showInputDialog("Informe o valor da base do tri�ngulo");
		Double base = Double.parseDouble(valor1.replace(",", "."));

		String valor2 = JOptionPane.showInputDialog("Informe o valor da altura do tri�ngulo");
		Double altura = Double.parseDouble(valor2.replace(",", "."));

		DecimalFormat formatador = new DecimalFormat("0.0");
		Double area = (base * altura) / 2;

		System.out.println("A �rea do tri�ngulo �: " + formatador.format(area));
	}
}
