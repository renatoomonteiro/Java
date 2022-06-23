package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;

		// Forma p�s fixada, operador ap�s o operando
		a++; // a = a + 1;
		a--; // a = a - 1;

		// Forma pr� fixada, operador antes do operando
		++b; // b = b + 1;
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);

		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		//Pr� incremento tem preced�ncia
		System.out.println(a);
		System.out.println(b);
	}

}
