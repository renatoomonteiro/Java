package oo.composicao.heranca.teste;

import oo.composicao.heranca.Direcao;
import oo.composicao.heranca.Heroi;
import oo.composicao.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("O monstro tem " + monstro.vida + " de vida.");
		System.out.println("O heroi tem " + heroi.vida + " de vida.");

		monstro.atacar(heroi);
		System.out.println("O monstro atacou o heroi");
		heroi.atacar(monstro);
		System.out.println("O heroi atacou o monstro");
		monstro.atacar(heroi);
		System.out.println("O monstro atacou o heroi");
		heroi.atacar(monstro);
		System.out.println("O heroi atacou o monstro");
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		System.out.println("O monstro atacou o heroi");
		heroi.atacar(monstro);
		System.out.println("O heroi atacou o monstro");

		System.out.println("O monstro tem " + monstro.vida + " de vida.");
		System.out.println("O heroi tem " + heroi.vida + " de vida.");

		System.out.println("O monstro andou " + monstro.x + " posição(ões) na direção do eixo x.");
		System.out.println("O monstro andou " + monstro.y + " posição(ões) na direção do eixo y.");
		System.out.println("O heroi andou " + heroi.x + " posição(ões) na direção do eixo x.");
		System.out.println("O heroi andou " + heroi.y + " posição(ões) na direção do eixo y.");
	}
}
