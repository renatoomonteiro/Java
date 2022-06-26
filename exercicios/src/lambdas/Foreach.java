//Aula 176 - Foreach Funcional #01
//Aula 177 - Foreach Funcional #02

package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

		System.out.println("Forma tradicional...");

		for (String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nLambda #01...");
		// Com apenas um par�metro, n�o h� a necessidade
		// de coloc�-los entre par�nteses
		aprovados.forEach(nome -> { // Passar uma fun��o lambda como par�metro para a fun��o foreach
			System.out.println(nome + "!!!"); // Para cada elemento da lista, execute esta lambda
		});

		System.out.println("\nMethod Reference #01 (M�todo de refer�ncia)");
		aprovados.forEach(System.out::println); // o dois pontos duplo, chama a refer�ncia acima

		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> meuImprimir(nome)); // Chamada do m�todo est�tico meuImprimir, que receber�
		// os nomes da lista como par�metro, imprimindo-os e concatenando com a mensagem

		System.out.println("\nMethod Reference #02 (M�todo de refer�ncia)");
		aprovados.forEach(Foreach::meuImprimir);
		// O primeiro forEach, passa os nomes da lista como par�metro para o segundo
		// Foreach, que chama o m�todo meuIprimir

	}

	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome �: " + nome);
	}
}
