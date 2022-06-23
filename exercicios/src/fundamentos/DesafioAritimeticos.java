package fundamentos;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 5;
		int e = 6;
		int f = 7;
		int g = 10;

		int primeiraParte = (c + b) * e;
		int pot2 = (int) Math.pow(primeiraParte, b) / c * b;

		int segundaParte = ((a - d) * (b - f)) / b;
		int pot3 = (int) Math.pow(segundaParte, b);

		int terceiraParte = (int) Math.pow((pot2 - pot3), c);

		System.out.println("O resultado é: " + terceiraParte / (int) Math.pow(g, c));

	}

}
