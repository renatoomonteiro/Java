//Aula 133. Stack (Pilha) - LIFO = Last In, First Out

package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variável livro, do tipo Deque(pilha) de String, que recebe um array de String
		Deque<String> livros = new ArrayDeque<String>();

		livros.add("O Pequeno Príncipe");// Adiciona, retornando um valor booleano
		livros.push("Don Quixote");// Adiciona, desde que não haja restrição de tamanho da fila
		livros.push("O Hobbit");

		System.out.println(livros.peek()); // Retorna o último a entrar, que será o primeiro a sair. Se não tiver nenhum
											// elemento, retorna null
		System.out.println(livros.element()); // Retorna o último a entrar, que será o primeiro a sair. Se não tiver
												// nenhum elemento, retorna uma exceção
		
		for(String livro: livros) {
			System.out.println(livro);
		}

		System.out.println(livros.poll()); // Remove os útimos a entrarem na fila, caso esteja vazia, retornará null
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop()); //Remove elementos, se estiver vazia, retornará uma exceção.
//		System.out.println(livros.remove());// Remove elementos, se estiver vazia, retornará uma exceção.
//		
//		livros.size(); // Tamanho
//		livros.clear(); // Limpar
//		livros.contains("O Hobbit"); // Contém o elemento passado como parâmetro
//		livros.isEmpty(); //Está vazia?
		
		
		
	}

}
