//Aula 172 - Primeira Função Lambda

package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		// Criação de uma função anônima
		Calculo calc = (x, y) -> {
			return x + y;
		}; // Definição da função soma com o retorno da soma dos parâmetros x e y
		// Chamada da soma
		System.out.println(calc.executar(2, 3)); // A variável cal é do tipo Calculo

		calc = (x, y) -> x * y; // Quando a função lambda não recebe as chaves, implicitamente há o return
		// Chamada da multiplicação
		// A função lambda recebe os parâmetros e os utiliza com os símbolos "->"
		System.out.println(calc.executar(2, 3));
	}
}
