package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if (...) sentença; ou {}
		// while(...) sentença; ou {}
		// for(...;...;...) sentença; ou {}

		// do sentença; ou {} while (...);

		// drare 25 de mar. de 2022
		Scanner entrada = new Scanner(System.in);

		// Inserir a biblioteca:
		// 1) Cursor do mouse sobre Scanner e as teclas
		// CTRl+ESPAÇO
		// Ou
		// CTRL+SHIFT+O

		String texto = "por favor";

		do {
			System.out.println("Você precisa falar " + "\nas palavras mágicas...");
			System.out.println("\nQuer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}

}
