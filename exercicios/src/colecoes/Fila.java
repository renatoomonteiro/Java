// Aula 132. Queue (Fila)
package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<>(); // Variável fila, do tipo fila de String. LinkedList é um construtor do
													// tipo fila

		// offer e add: adicionam elementos na fila
		// A diferença é o comportamento quando a fila está cheia
		fila.add("Ana");//Retorna false
		fila.offer("Bia");// offer também adiciona itens na fila, desde que não haja restrição de tamanho
		fila.add("Carlos");
		fila.offer("Daniel");//Lança uma exceção
		fila.add("Rafael");
		fila.offer("Gui");
		//A diferença ocorre quando a fila está vazia
		System.out.println(fila.peek());// peek lê o elemento da fila, retorna null, caso esteja vazia
		System.out.println(fila.peek()); 
		System.out.println(fila.element());// element lê o elemento da fila, retorna erro caso esteja vazia
		System.out.println(fila.element());
		
		//fila.size(); //Tamanho da fila
		//fila.clear(); //Limpar a fila
		//fila.isEmpty() //Fila está vazia
		//fila.contains() // Verifica se contém o elemento passado como parâmetro
		
		System.out.println(fila.poll()); //pool: Retorna o primeiro elemento da fila e já o remove, caso esteja vazia, retorna null
		
		System.out.println(fila.remove()); //remove: Remove o elemento da fila e retorna um erro de exceção, caso esteja vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}

}
