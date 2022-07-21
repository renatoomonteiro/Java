//Aula 194 - Criando Stream
package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		// Consumer do tipo object servir� para interiros e strings, v�rios tipos de
		// dados
		Consumer<Object> print = System.out::print; // Criando uma refer�ncia para o m�todo
		// Consumer<Integer> println = System.out::println;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Pearl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		// Pega o array, a partir do �ndice
		// 1 at� o �dice 2, com exce��o deste
		Arrays.stream(maisLangs, 1, 2).forEach(print); // = maisLangs = {"Lisp "}

		List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		// Com o paralelismo, os dados n�o s�o executados na ordem
		outrasLangs.parallelStream().forEach(print);
		// Ir� gerar o valor a infinitamente.
		// Stream.generate(() -> "a").forEach(print);
//Iterate, o primeiro par�metro � um inteiro, o segundo � o tipo de itera��o
		// Ir� somar n + 1 infinitamente
		// Stream.iterate(0, n -> n + 1).forEach(println);

	}
}
