package fundamentos;

import java.util.Scanner;

//importação da biblioteca Scanner, que lê o console
public class DesafioConversaoResposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		// Método de entrada do Scanner

		System.out.println("Informe o primeiro salário: ");
		String valor1 = entrada.next().replace(",", ".");
//Método replace substitui o caracter por outro
		System.out.println("Informe o segundo salário: ");
		String valor2 = entrada.next().replace(",", ".");
//Substitui ponto por vírgula  
		System.out.println("Informe o terceiro salário: ");
		String valor3 = entrada.next().replace(",", ".");
//O método next é responsável por emitir uma mensagem na 
//linha logo abaixo da digitada pelo usuário.
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("A média dos salários é %.2f", media);
		// NÃO SE ESQUECER DE FECHAR O MÉTODO SCANNER DA VARIÁVEL
		// ENTRADA
		entrada.close();

		entrada.close();

	}

}
