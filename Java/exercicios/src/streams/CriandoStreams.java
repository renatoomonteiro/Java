//Aula 194 - Criando Stream
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		// Consumer do tipo object servirá para interiros e strings, vários tipos de
		// dados
		Consumer<Object> print = System.out::print; // Criando uma referência para o método
		// Consumer<Integer> println = System.out::println;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Pearl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		// Pega o array, a partir do índice
		// 1 até o ídice 2, com exceção deste
		Arrays.stream(maisLangs, 1, 2).forEach(print); // = maisLangs = {"Lisp "}

		List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		// Com o paralelismo, os dados não são executados na ordem
		outrasLangs.parallelStream().forEach(print);
		// Irá gerar o valor a infinitamente.
		// Stream.generate(() -> "a").forEach(print);
//Iterate, o primeiro parâmetro é um inteiro, o segundo é o tipo de iteração
		// Irá somar n + 1 infinitamente
		// Stream.iterate(0, n -> n + 1).forEach(println);

	}
}
