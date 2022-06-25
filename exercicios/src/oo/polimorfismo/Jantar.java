//Aula 164 - Polimorfismo
package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);

		Arroz arroz = new Arroz(0.2);
		Feijao feijao = new Feijao(0.1);
		Sorvete sobremesa = new Sorvete(4.0);
		Salada salada = new Salada(0.4);

		System.out.println(convidado.getPeso()); // Mostra o peso inicial

		convidado.comer(arroz);
		System.out.println(convidado.getPeso()); // Mostra o peso ap�s comer arroz

		convidado.comer(feijao);
		System.out.println(convidado.getPeso()); // Mostra o peso ap�s comer feij�o

		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso()); // Mostra o peso ap�s comer sobremesa

		convidado.comer(salada);
		System.out.println(convidado.getPeso()); // Mostra o peso ap�s comer salada

	}

}
