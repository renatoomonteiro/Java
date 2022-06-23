package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Domingo ->1
		// Quarta-> 4
		// Tera -> 3

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("Domingo = 1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("segunda = 2");
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("terça = 3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("quarta = 4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("quinta = 5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("quinta = 6");
		} else if (dia.equalsIgnoreCase("sábado")) {
			System.out.println("quinta = 7");
		} else if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("quinta = 8");
		} else 
			System.out.println("Digite um dia válido!");
		entrada.close();
	}
}
