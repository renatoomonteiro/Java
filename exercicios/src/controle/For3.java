package controle;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Variável declarada antes do laço
		// int i = 0;
//Mesmo assim o primeiro parâmetro, do laço deve ser mantido
//Antes do ";".
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		int i = 0;
//		System.out.println(i);
//		System.out.println("Saiu do for...");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("[ %d %d]", i, j);
			}
			System.out.println();
		}
	}
}
