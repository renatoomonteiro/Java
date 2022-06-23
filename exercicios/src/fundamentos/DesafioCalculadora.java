package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ler o num1
		// Ler num2
		// + - * / %
		// O usuário informa o operador e o programa
		// deverá executar a operação correspondente

		String n1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
		double valor1 = Double.parseDouble(n1);

		String operador = JOptionPane.showInputDialog("Informe o operador no formato: + - * / % ");

		String n2 = JOptionPane.showInputDialog("Informe o segundo número: ");
		double valor2 = Double.parseDouble(n2);

		System.out.println("O primeiro número informado é " + valor1 + "\nO segundo número informado é " + valor2
				+ "\nO operador informado é o " + operador + "\nO formato será " + valor1 + operador + valor2);

		if (operador.equals("/")) {
			double resultadoDivisao = valor1 / valor2;
			System.out.println("O resultado será: " + resultadoDivisao);
		} else {
			System.out.println("Informe um símbolo no formato: + - * / % ");
		}

		if (operador.equals("+")) {
			double resultadoDivisao = valor1 + valor2;
			System.out.println("O resultado será: " + resultadoDivisao);
		} else {
			System.out.println("Informe um símbolo no formato: + - * / % ");
		}

		if (operador.equals("*")) {
			double resultadoDivisao = valor1 * valor2;
			System.out.println("O resultado será: " + resultadoDivisao);
		} else {
			System.out.println("Informe um símbolo no formato: + - * / % ");
		}

		if (operador.equals("-")) {
			double resultadoDivisao = valor1 - valor2;
			System.out.println("O resultado será: " + resultadoDivisao);
		} else {
			System.out.println("Informe um símbolo no formato: + - * / % ");
		}

		if (operador.equals("%")) {
			double resultadoDivisao = valor1 % valor2;
			System.out.println("O resultado será: " + resultadoDivisao);
		} else {
			System.out.println("Informe um símbolo no formato: + - * / % ");
		}
	}

}
