package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String primeiroSalario = JOptionPane.showInputDialog("Digite o primeiro Salário: ");
		String segundoSalario = JOptionPane.showInputDialog("Digite o segundo Salário: ");
		String terceiroSalario = JOptionPane.showInputDialog("Digite o terceiro Salário: ");

		double salario1 = Double.parseDouble(primeiroSalario);
		double salario2 = Double.parseDouble(segundoSalario);
		double salario3 = Double.parseDouble(terceiroSalario);

		double soma = salario1 + salario2 + salario3;

		System.out.printf("O primeiro salário é R$ %.2f\n", salario1);
		System.out.printf("O segundo salário é R$ %.2f\n", salario2);
		System.out.printf("O terceiro salário é R$ %.2f\n", salario3);

		System.out.printf("A soma é R$ %.2f", soma);
	}

}
