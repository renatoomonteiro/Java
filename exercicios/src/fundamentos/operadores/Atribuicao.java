package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operadores de atribuição:
		int a = 3;
		int b = a;
		int c = a + b;

		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / b;
		
		
		
		System.out.println(c);
		c %= b; // c = c % 2;  0 ou 1
		//(verificação de par ou ímpar)
		System.out.println(c);
		
	}

}
