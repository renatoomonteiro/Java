// Aula 132. Queue (Fila)
package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<>(); // Vari�vel fila, do tipo fila de String. LinkedList � um construtor do
													// tipo fila

		// offer e add: adicionam elementos na fila
		// A diferen�a � o comportamento quando a fila est� cheia
		fila.add("Ana");//Retorna false
		fila.offer("Bia");// offer tamb�m adiciona itens na fila, desde que n�o haja restri��o de tamanho
		fila.add("Carlos");
		fila.offer("Daniel");//Lan�a uma exce��o
		fila.add("Rafael");
		fila.offer("Gui");
		//A diferen�a ocorre quando a fila est� vazia
		System.out.println(fila.peek());// peek l� o elemento da fila, retorna null, caso esteja vazia
		System.out.println(fila.peek()); 
		System.out.println(fila.element());// element l� o elemento da fila, retorna erro caso esteja vazia
		System.out.println(fila.element());
		
		//fila.size(); //Tamanho da fila
		//fila.clear(); //Limpar a fila
		//fila.isEmpty() //Fila est� vazia
		//fila.contains() // Verifica se cont�m o elemento passado como par�metro
		
		System.out.println(fila.poll()); //pool: Retorna o primeiro elemento da fila e j� o remove, caso esteja vazia, retorna null
		
		System.out.println(fila.remove()); //remove: Remove o elemento da fila e retorna um erro de exce��o, caso esteja vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}

}
