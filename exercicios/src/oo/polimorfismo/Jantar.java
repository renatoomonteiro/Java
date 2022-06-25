//Aula 164 - Polimorfismo
package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);

		Arroz arroz = new Arroz(0.2);
		Feijao feijao = new Feijao(0.1);
		Sorvete sobremesa = new Sorvete(4.0);
		Salada salada = new Salada(0.4);

		//Comida ingrediente3 = new Comida(0.3); Comida passou a ser abstrata

		Comida ingrediente3 = new Arroz(0.3);
		System.out.println("Peso inicial do convidado: " + convidado.getPeso() + "Kg."); // Mostra o peso inicial

		convidado.comer(ingrediente3);
		System.out.println("Ap�s comer o ingrediente 3, ficou com " + convidado.getPeso() + "Kg.");

		convidado.comer(arroz);
		System.out.println("Ap�s comer arroz, ficou com " + convidado.getPeso() + "Kg."); // Mostra o peso ap�s comer arroz

		convidado.comer(feijao);
		System.out.println("Ap�s comer feij�o, ficou com " + convidado.getPeso() + "Kg."); // Mostra o peso ap�s comer feij�o

		convidado.comer(sobremesa);
		System.out.println("Ap�s comer a sobremesa, ficou com " + convidado.getPeso() + "Kg."); // Mostra o peso ap�s comer sobremesa

		convidado.comer(salada);
		System.out.println("Ap�s comer a salada, ficou com " + convidado.getPeso() + "Kg."); // Mostra o peso ap�s comer salada

	}

}
