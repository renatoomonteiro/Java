package arrays;

import java.util.Arrays;

public class Exercicio2 {
//Alteração da classe Exercicio para trocar o laço for pelo foreach 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notasAlunoA[] = new double[4];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		// Posição na memória
		System.out.println(notasAlunoA);

		// Biblioteca para exibir valores de Arrays
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA.length - 1);
		// System.out.println(notasAlunoA[4]); ERRO! fora do tamanho

		double totalAlunoA = 0;
		for (double notaA : notasAlunoA) {
			System.out.println("Nota do aluno A: "+ notaA);
		}
		System.out.println(totalAlunoA / notasAlunoA.length);

		final double notaArmazenada = 5.9;
		double notasAluboB[] = { 6.9, 8.9, notaArmazenada, 10 };

		double totalAlunoB = 0;
		for (double notaB : notasAluboB) {
			System.out.println("Nota do aluno B: "+ notaB);
		}
		System.out.println(totalAlunoB / notasAluboB.length);
	}

}
