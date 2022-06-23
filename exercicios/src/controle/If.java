package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		if (media >= 7.0) {
			System.out.println("Aprovado!");
		System.out.println("Parabéns!");
		}
		//System.out.println("Estude mais!");
		
		if (media < 7 && media >= 4.5) {
			System.out.println("Recuperação!");
		}
		
		boolean criterioReprovacaoAtingido = 
				media < 4.5 && media >= 0;
		
		if (criterioReprovacaoAtingido) {
			System.out.println("Reprovado!");
		}

		entrada.close();
	}

}
