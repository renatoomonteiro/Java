package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media = 8.6;
 
		String resultadoFinal = media >= 7.0 ? 
		"Aprovado!" : "Em recupera��o";
		//True      :    False
		// ? = Operador tern�rio
		// : = separador de condi��es, 
		//1� = true;
		//2� = false.
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "N�o"; 
		
		System.out.println("Tem desconto? " + resultado); 
		System.out.printf("Tem desconto? %s", resultado);
		
	}

}
