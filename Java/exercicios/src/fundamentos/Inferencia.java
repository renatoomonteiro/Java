package fundamentos;

public class Inferencia {
//Infer�ncia = identifica a vari�vel de acordo com
//o tipo de dado 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 12;
		System.out.println(a);

		var b = 4.5;
		System.out.println(b);

		var c = "Texto";
		System.out.println(c);

		c = "Outro texto";
		System.out.println(c);

		// c=4.5;

		double d; // vari�vel foi declarada
		d = 123.65; // vari�vel foi inicializada
		System.out.println(d);// usada!

		var e = 123.45;
		System.out.println(e);
		var f = 12; // inteiro
		// f = 12.01;
		System.out.println(f);

	}

}
