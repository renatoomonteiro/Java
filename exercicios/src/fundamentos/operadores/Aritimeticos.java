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
		System.out.println(a / (double) b); // convers�o com cast
//do tipo inteiro para double (expl�cita)
		System.out.println(a%b); //mod, verifica��o de pares da vari�vel
		System.out.println(8%3); //mod, verifica��o de pares do valor

		System.out.println(x+y-a*b);
	}

}
