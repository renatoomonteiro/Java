package classe;

import java.util.Date;

public class Equals {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";

		System.out.println(u1 == u2); // False, pois s�o iguais em locais distintos na mem�ria
		System.out.println(u1.equals(u2)); // Mesmo resultado da compara��o acima
		System.out.println(u2.equals(u1)); // Mesmo resultado da compara��o acima

		System.out.println(u2.equals(new Date())); // O Usu�rio dois � igual a uma data?
	}
}
