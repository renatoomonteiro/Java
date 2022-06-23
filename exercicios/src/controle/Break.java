package controle;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
//Este break irá interromper o laço assim que 
//o valor do if for encontrado.
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}

}
