package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if (...) senten�a; ou {}
		// while(...) senten�a; ou {}
		// for(...;...;...) senten�a; ou {}

		// do senten�a; ou {} while (...);

		// drare 25 de mar. de 2022
		Scanner entrada = new Scanner(System.in);

		// Inserir a biblioteca:
		// 1) Cursor do mouse sobre Scanner e as teclas
		// CTRl+ESPA�O
		// Ou
		// CTRL+SHIFT+O

		String texto = "por favor";

		do {
			System.out.println("Voc� precisa falar " + "\nas palavras m�gicas...");
			System.out.println("\nQuer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado!");
		entrada.close();
	}

}
