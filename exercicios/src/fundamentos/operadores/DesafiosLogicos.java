package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		boolean trabalhoTerça = true;
		boolean trabalhoQuinta = true;

		System.out.printf("Trabalhei na terça e na quinta? %s", trabalhoTerça && trabalhoQuinta);
		if (trabalhoTerça == true && trabalhoQuinta == true) {
			System.out.println("\nBora comprar a TV de 50\" e tomar sorvete");
		}

		System.out.printf("Trabalhei na terça ou na quinta? %s", trabalhoTerça || trabalhoQuinta);
		if (trabalhoTerça == true && trabalhoQuinta == true) {
			System.out.println("\nBora comprar a TV de 32\"  e tomar sorvete");
		}

		System.out.printf("Trabalhei na terça ou na quinta? %s", !trabalhoTerça || !trabalhoQuinta);
		if (trabalhoTerça == true && trabalhoQuinta == true) {
			System.out.println("\nVamos ficar em casa e não tomar sorvete");
		}
	}
}
