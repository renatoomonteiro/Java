package fundamentos;

import java.util.Scanner;

//importa��o da biblioteca Scanner, que l� o console
public class DesafioConversaoResposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		// M�todo de entrada do Scanner

		System.out.println("Informe o primeiro sal�rio: ");
		String valor1 = entrada.next().replace(",", ".");
//M�todo replace substitui o caracter por outro
		System.out.println("Informe o segundo sal�rio: ");
		String valor2 = entrada.next().replace(",", ".");
//Substitui ponto por v�rgula  
		System.out.println("Informe o terceiro sal�rio: ");
		String valor3 = entrada.next().replace(",", ".");
//O m�todo next � respons�vel por emitir uma mensagem na 
//linha logo abaixo da digitada pelo usu�rio.
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("A m�dia dos sal�rios � %.2f", media);
		// N�O SE ESQUECER DE FECHAR O M�TODO SCANNER DA VARI�VEL
		// ENTRADA
		entrada.close();

		entrada.close();

	}

}
