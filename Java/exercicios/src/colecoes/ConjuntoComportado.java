//Aula 130. Set #02
package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		// Set<String> listaAprovados = new HashSet<String>();// Obriga a vari�vel lista
		// a receber dados apenas do tipo
		// string
		// Set<String> listaAprovados = new TreeSet<String>(); //O TreeSet garante a
		// ordem de execu��o
		// Tamb�m aceita que o maior que e menor que, "<", ">", estejam vazios
		SortedSet<String> listaAprovados = new TreeSet<>(); // Aceita ordena��o, com tipos de dados iguais
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {// For each
			System.out.println(candidato); // Para cada vari�vel candidato, exiba o conte�do da listaAprovados
		}
		Set<Integer> nums = new HashSet<>(); // Aceita ordena��o, com tipos de dados iguais
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		for (int i : nums) {
			System.out.println(i);
		}
	}
}
