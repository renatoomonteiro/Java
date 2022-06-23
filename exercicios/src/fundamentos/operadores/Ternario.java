package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media = 8.6;
 
		String resultadoFinal = media >= 7.0 ? 
		"Aprovado!" : "Em recuperação";
		//True      :    False
		// ? = Operador ternário
		// : = separador de condições, 
		//1ª = true;
		//2ª = false.
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não"; 
		
		System.out.println("Tem desconto? " + resultado); 
		System.out.printf("Tem desconto? %s", resultado);
		
	}

}
