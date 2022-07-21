package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		// Converte para string e diz o tamanho, no caso, cinco dígitos
		// ou caracteres
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		// Converte para String e mantém como está, nesse caso
		// uma string com números

		System.out.println(("" + num1).length());
		// Tamanho da variável num1
		System.out.println(("" + num2).length());
		// Tamanho da variável num2
	}
}
