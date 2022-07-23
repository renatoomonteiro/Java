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
		// Com apenas um parâmetro, não há a necessidade
		// de colocá-los entre parênteses
		aprovados.forEach(nome -> { // Passar uma função lambda como parâmetro para a função foreach
			System.out.println(nome + "!!!"); // Para cada elemento da lista, execute esta lambda
		});

		System.out.println("\nMethod Reference #01 (Método de referência)");
		aprovados.forEach(System.out::println); // o dois pontos duplo, chama a referência acima

		System.out.println("\nLambda #02");
		aprovados.forEach(nome -> meuImprimir(nome)); // Chamada do método estático meuImprimir, que receberá
		// os nomes da lista como parâmetro, imprimindo-os e concatenando com a mensagem

		System.out.println("\nMethod Reference #02 (Método de referência)");
		aprovados.forEach(Foreach::meuImprimir);
		// O primeiro forEach, passa os nomes da lista como parâmetro para o segundo
		// Foreach, que chama o método meuIprimir

	}

	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome é: " + nome);
	}
}
