package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		boolean trabalhoTer�a = true;
		boolean trabalhoQuinta = true;

		System.out.printf("Trabalhei na ter�a e na quinta? %s", trabalhoTer�a && trabalhoQuinta);
		if (trabalhoTer�a == true && trabalhoQuinta == true) {
			System.out.println("\nBora comprar a TV de 50\" e tomar sorvete");
		}

		System.out.printf("Trabalhei na ter�a ou na quinta? %s", trabalhoTer�a || trabalhoQuinta);
		if (trabalhoTer�a == true && trabalhoQuinta == true) {
			System.out.println("\nBora comprar a TV de 32\"  e tomar sorvete");
		}

		System.out.printf("Trabalhei na ter�a ou na quinta? %s", !trabalhoTer�a || !trabalhoQuinta);
		if (trabalhoTer�a == true && trabalhoQuinta == true) {
			System.out.println("\nVamos ficar em casa e n�o tomar sorvete");
		}
	}
}
