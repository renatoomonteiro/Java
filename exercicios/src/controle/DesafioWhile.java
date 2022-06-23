package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Média dos alunos;

//drare 25 de mar. de 2022
		Scanner entrada = new Scanner(System.in);

//Inserir a biblioteca:
//1) Cursor do mouse sobre Scanner e as teclas
// CTRl+ESPAÇO
//Ou
// CTRL+SHIFT+O

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Informe a nota ou -1 para sair: \n");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {

				total += nota; 
				//Iteração que armazenará as notas
				quantidadeDeNotas++;
				//Iteração que armazenará a quantidade 
				//de notas digitadas
			} else {
				System.out.println("\nInforme uma nota entre 0 e 10");
			}
		}

//Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();
	}
}
