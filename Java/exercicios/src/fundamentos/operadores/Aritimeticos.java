package fundamentos.operadores;

public class Aritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 + 3);

		var x = 34.56;
		double y = 2.2;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);

		int a = 8;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double) b); // conversão com cast
//do tipo inteiro para double (explícita)
		System.out.println(a%b); //mod, verificação de pares da variável
		System.out.println(8%3); //mod, verificação de pares do valor

		System.out.println(x+y-a*b);
	}

}
