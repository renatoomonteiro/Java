package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String primeiroSalario = JOptionPane.showInputDialog("Digite o primeiro Sal�rio: ");
		String segundoSalario = JOptionPane.showInputDialog("Digite o segundo Sal�rio: ");
		String terceiroSalario = JOptionPane.showInputDialog("Digite o terceiro Sal�rio: ");

		double salario1 = Double.parseDouble(primeiroSalario);
		double salario2 = Double.parseDouble(segundoSalario);
		double salario3 = Double.parseDouble(terceiroSalario);

		double soma = salario1 + salario2 + salario3;

		System.out.printf("O primeiro sal�rio � R$ %.2f\n", salario1);
		System.out.printf("O segundo sal�rio � R$ %.2f\n", salario2);
		System.out.printf("O terceiro sal�rio � R$ %.2f\n", salario3);

		System.out.printf("A soma � R$ %.2f", soma);
	}

}
