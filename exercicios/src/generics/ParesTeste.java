//Aula 249 - Criando uma Estrutura Chave/Valor com Generics

package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Renato");
		resultadoConcurso.adicionar(2, "Regiane"); //Não aceitará duplicações
		resultadoConcurso.adicionar(3, "Gabriel");
		resultadoConcurso.adicionar(4, "Corina");
		resultadoConcurso.adicionar(2, "Fernando"); //Exibirá apenas o último valor recebido na chave 2
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
		

	}

}
