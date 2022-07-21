//Aula 172 - Primeira Função Lambda

package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3)); //Chamada de calculo, com o comportamento de somar
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3)); //Chamada de calculo, com o comportamento de multiplicar
			}

}
