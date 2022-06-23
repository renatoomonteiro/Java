package oo.composicao.heranca.desafio.resposta;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro c1 = new Civic();
		Carro c2 = new Ferrari(400);

		c1.acelerar();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);

		c2.acelerar();
		c2.frear();
		System.out.println(c2);

		c2.acelerar();
		System.out.println(c2);

		c2.acelerar();
		System.out.println(c2);
	}
}
