package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos?");
		int qtdeAlunos = entrada.nextInt();

		System.out.println("Quantas notas por aluno?");
		int qtdeNotas = entrada.nextInt();

		double notasDaTurma[][] = new double[qtdeAlunos][qtdeNotas];

		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			// Para cada elemento de a, precorrer as notas < tamanho
			// n < notasDaTurma[a]
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("\nInforme a nota %d do aluno %d\n", n+1, a+1);
				notasDaTurma[a][n] += entrada.nextDouble();
				total += notasDaTurma[a][n]; 
			}

		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("A média da turma é: "+ media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			//Exibe a quantidade de notas inseridas para cada aluno
			System.out.println("Notas inseridas do aluno "+Arrays.toString(notasDoAluno));
		}
		
		
		entrada.close();

	}

}
