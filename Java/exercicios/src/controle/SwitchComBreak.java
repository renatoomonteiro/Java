package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//drare 29 de mar. de 2022
		Scanner entrada = new Scanner(System.in);
		
		//Inserir a biblioteca:
		//1) Cursor do mouse sobre Scanner e as teclas
		// CTRl+ESPA�O
		//Ou
		// CTRL+SHIFT+O
		
		String conceito ="";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch(nota) {
		case 10: case 9: 
		conceito ="A";
		case 8: case 7: 
			conceito ="B";
		case 6: case 5: 
			conceito ="C";
		case 4: case 3: 
			conceito ="D";
		case 2: case 1: case 0: // O case n�o aceita 
								//faixa de valores 
			conceito ="E";		
		break;
		default: // O default n�o precisa estar na �ltima linha
			conceito = "n�o encontrado!";
		}
		System.out.println("Conceito � " + conceito );
		entrada.close();
	}

}
