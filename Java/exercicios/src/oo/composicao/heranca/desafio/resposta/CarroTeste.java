package oo.composicao.heranca.desafio.resposta;

public class CarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Civic c1 = new Civic();
		Ferrari c2 = new Ferrari(400);
		c2.ligarTurbo(); // ligou o turbo da Ferrari

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

		c2.desligarTurbo();
		System.out.println(c2);

		c2.acelerar();
		System.out.println(c2);
		
		c2.desligarTurbo();
		System.out.println(c2);

		c2.acelerar();
		System.out.println(c2);
		
		System.out.println(c2.velocidadeDoAr()); //Chamada do método padrão
	}
}
