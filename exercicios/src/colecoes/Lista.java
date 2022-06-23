//Aula 131. List
package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("Ana");

		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));

		System.out.println(lista.get(3));// Acessa pelo índice

		System.out.println(">>>" + lista.remove(1)); // Remoção através do índice
		System.out.println(lista.remove(new Usuario("Manu"))); // Remove pelo nome
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(u1));

		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
	}
}
