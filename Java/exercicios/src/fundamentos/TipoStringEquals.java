package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("2" == "2"); 
		// Compara��o de string
		
		String s = new String("2");
		//Nova String s recebe o valor 2 
		
		System.out.println("2" == s);
		//Compara��o da String 2 com o valor de s
		
		System.out.println("2".equals(s));
		//System.out.println("2" == "a");
		// Compara��o de string 
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		//O m�todo .next() tira os espa�os em branco
		// da digita��o no Console
		//String s2 = entrada.nextLine();
		//O m�todo .nextLine() n�o tira
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		//Melhor op��o para compara��o de String � a 
		//Utiliza��o do m�todo .equals()
		//trim = m�todo que tira o espa�o 
		//em branco na string
		
		entrada.close();
		 
	}

}
