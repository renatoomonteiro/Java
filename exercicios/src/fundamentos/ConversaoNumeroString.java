package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		// Converte para string e diz o tamanho, no caso, cinco d�gitos
		// ou caracteres
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		// Converte para String e mant�m como est�, nesse caso
		// uma string com n�meros

		System.out.println(("" + num1).length());
		// Tamanho da vari�vel num1
		System.out.println(("" + num2).length());
		// Tamanho da vari�vel num2
	}
}
