package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas? ");
		int qtdeNotas = entrada.nextInt();
		// A variável qtdeNotas recebe o valor de entrada

		// O tamanho do array é definodo através do valor da variável
		// qtdeNotas
		double[] notas = new double[qtdeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + i + 1 + ": ");
			notas[i] = entrada.nextDouble();
		}

		System.out.println("As notas inseridas foram: "+Arrays.toString(notas));

		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é: " +media + "!");
		
		entrada.close();

	}
}
