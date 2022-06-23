package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("2" == "2"); 
		// Comparação de string
		
		String s = new String("2");
		//Nova String s recebe o valor 2 
		
		System.out.println("2" == s);
		//Comparação da String 2 com o valor de s
		
		System.out.println("2".equals(s));
		//System.out.println("2" == "a");
		// Comparação de string 
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		//O método .next() tira os espaços em branco
		// da digitação no Console
		//String s2 = entrada.nextLine();
		//O método .nextLine() não tira
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		//Melhor opção para comparação de String é a 
		//Utilização do método .equals()
		//trim = método que tira o espaço 
		//em branco na string
		
		entrada.close();
		 
	}

}
