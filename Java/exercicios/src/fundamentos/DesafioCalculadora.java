package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ler o num1
		// Ler num2
		// + - * / %
		// O usu�rio informa o operador e o programa
		// dever� executar a opera��o correspondente

		String n1 = JOptionPane.showInputDialog("Informe o primeiro n�mero: ");
		double valor1 = Double.parseDouble(n1);

		String operador = JOptionPane.showInputDialog("Informe o operador no formato: + - * / % ");

		String n2 = JOptionPane.showInputDialog("Informe o segundo n�mero: ");
		double valor2 = Double.parseDouble(n2);

		System.out.println("O primeiro n�mero informado � " + valor1 + "\nO segundo n�mero informado � " + valor2
				+ "\nO operador informado � o " + operador + "\nO formato ser� " + valor1 + operador + valor2);

		if (operador.equals("/")) {
			double resultadoDivisao = valor1 / valor2;
			System.out.println("O resultado ser�: " + resultadoDivisao);
		} else {
			System.out.println("Informe um s�mbolo no formato: + - * / % ");
		}

		if (operador.equals("+")) {
			double resultadoDivisao = valor1 + valor2;
			System.out.println("O resultado ser�: " + resultadoDivisao);
		} else {
			System.out.println("Informe um s�mbolo no formato: + - * / % ");
		}

		if (operador.equals("*")) {
			double resultadoDivisao = valor1 * valor2;
			System.out.println("O resultado ser�: " + resultadoDivisao);
		} else {
			System.out.println("Informe um s�mbolo no formato: + - * / % ");
		}

		if (operador.equals("-")) {
			double resultadoDivisao = valor1 - valor2;
			System.out.println("O resultado ser�: " + resultadoDivisao);
		} else {
			System.out.println("Informe um s�mbolo no formato: + - * / % ");
		}

		if (operador.equals("%")) {
			double resultadoDivisao = valor1 % valor2;
			System.out.println("O resultado ser�: " + resultadoDivisao);
		} else {
			System.out.println("Informe um s�mbolo no formato: + - * / % ");
		}
	}

}
