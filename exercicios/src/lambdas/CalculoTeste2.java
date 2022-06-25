//Aula 172 - Primeira Fun��o Lambda

package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		// Cria��o de uma fun��o an�nima
		Calculo calc = (x, y) -> {
			return x + y;
		}; // Defini��o da fun��o soma com o retorno da soma dos par�metros x e y
		// Chamada da soma
		System.out.println(calc.executar(2, 3)); // A vari�vel cal � do tipo Calculo

		calc = (x, y) -> x * y; // Quando a fun��o lambda n�o recebe as chaves, implicitamente h� o return
		// Chamada da multiplica��o
		// A fun��o lambda recebe os par�metros e os utiliza com os s�mbolos "->"
		System.out.println(calc.executar(2, 3));
	}
}
