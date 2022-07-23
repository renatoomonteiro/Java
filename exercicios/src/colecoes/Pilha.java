//Aula 133. Stack (Pilha) - LIFO = Last In, First Out

package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vari�vel livro, do tipo Deque(pilha) de String, que recebe um array de String
		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Pr�ncipe");// Adiciona, retornando um valor booleano
		livros.push("Don Quixote");// Adiciona, desde que n�o haja restri��o de tamanho da fila
		livros.push("O Hobbit");

		System.out.println(livros.peek()); // Retorna o �ltimo a entrar, que ser� o primeiro a sair. Se n�o tiver nenhum
											// elemento, retorna null
		System.out.println(livros.element()); // Retorna o �ltimo a entrar, que ser� o primeiro a sair. Se n�o tiver
												// nenhum elemento, retorna uma exce��o
		
		for(String livro: livros) {
			System.out.println(livro);
		}

		System.out.println(livros.poll()); // Remove os �timos a entrarem na fila, caso esteja vazia, retornar� null
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop()); //Remove elementos, se estiver vazia, retornar� uma exce��o.
//		System.out.println(livros.remove());// Remove elementos, se estiver vazia, retornar� uma exce��o.
//		
//		livros.size(); // Tamanho
//		livros.clear(); // Limpar
//		livros.contains("O Hobbit"); // Cont�m o elemento passado como par�metro
//		livros.isEmpty(); //Est� vazia?
		
		
		
	}

}
