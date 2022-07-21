//Aula 207 - Reduce #04
package streams;

public class MediaTeste {

	public static void main(String[] args) {

		// Chamada do método utilizando a variável m1

//		Media m1 = new Media();
//		m1.adicionar(8.3);
//		m1.adicionar(6.7);

		// Chamada do método logo após o nome da classe, passando o valor como parâmetro
		Media m1 = new Media().adicionar(8.3).adicionar(6.7);
		Media m2 = new Media().adicionar(7.9).adicionar(6.6);

		System.out.println(m1.getValor());
		System.out.println(m2.getValor());

		System.out.println(Media.combinar(m1, m2).getValor());
	}

}
