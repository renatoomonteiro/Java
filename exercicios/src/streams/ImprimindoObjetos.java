//Aula 192 - List/Iterator/Stream
package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
//		// Laço for com o limitador do tamanho da variável lista de aprovados,
		System.out.println("Usando o For");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));// .get pega o valor na posição "i" de cada elemento da lista
		}

		// For mais simples, com menos linhas de comando
		System.out.println("\nUsando o Foreach");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nUsando o Iterador");
		Iterator<String> iterator = aprovados.iterator();
		while (iterator.hasNext()) {// Há elementos próximos?
			// Se a resposta for verdadeira:
			System.out.println(iterator.next());// Exiba o próximo valor
		}
		// Sequência de dados
		System.out.println("\nUsando Stream");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);// laço interno

	}
}
