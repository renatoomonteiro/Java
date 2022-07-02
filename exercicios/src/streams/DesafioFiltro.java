package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFiltro {

	public static void main(String[] args) {
		CartaoEstacionamento c1 = new CartaoEstacionamento("Renato", "Sgt", "FGJ8678", 122466, true);
		CartaoEstacionamento c2 = new CartaoEstacionamento("Oliveira", "Cb", "JJT4693", 122467, false);
		CartaoEstacionamento c3 = new CartaoEstacionamento("Monteiro", "Sd", "CJS1891", 122468, true);
		CartaoEstacionamento c4 = new CartaoEstacionamento("Roger", "Cb", "KRL1991", 148913, true);
		CartaoEstacionamento c5 = new CartaoEstacionamento("Fernando", "Sd", "UNO1F35", 146962, true);
		CartaoEstacionamento c6 = new CartaoEstacionamento("Renata", "Sd", "FIT1B10", 195196, true);
		CartaoEstacionamento c7 = new CartaoEstacionamento("Raposo", "Sgt", "FIT1B10", 195196, true);
		CartaoEstacionamento c8 = new CartaoEstacionamento("Fahur", "Sgt", "FIT1B10", 195196, true);
		CartaoEstacionamento c9 = new CartaoEstacionamento("Prates", "Sgt", "FIT1B10", 195196, true);
		CartaoEstacionamento c10 = new CartaoEstacionamento("Vivian", "Sgt", "FIT1B10", 195196, false);

		List<CartaoEstacionamento> ce = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

		Predicate<CartaoEstacionamento> possui = p -> p.possuiCartao;

		ce.stream().filter(a -> a.posto.equals("Sgt") || a.posto.equals("Cb")) // Verifica se é Sgt ou Cb
				.filter(possui) // Verifica se possui ou não cartão
				.map(a -> "O senhor " + a.posto + " " + a.nome + " está liberado(a) para estacionar") // Confirma com a
																										// saudação
				.forEach(System.out::println);
	}
}
