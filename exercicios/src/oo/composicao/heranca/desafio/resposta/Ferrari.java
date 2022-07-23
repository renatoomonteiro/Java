package oo.composicao.heranca.desafio.resposta;

//Ferrari implementa as interfaces Esportivo e Luxo
public class Ferrari extends Carro implements Esportivo, Luxo {
//Chamada do construtor padrão, sem informar o parâmetro.

	boolean ligarTurbo = false, ligarAr = false;
		
	Ferrari() {
		super(315);
	}

//Chamada do construtor padrão, com o parâmetro informado
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		// Alteração da variável delta, de 5 para 15
		setDelta(15);
	}

	public void ligarTurbo() {// Ligou o turbo, o delta sobe para 35
		ligarTurbo = true;
	};

	public void desligarTurbo() {// Desligou o turbo, o delta volta a ser 15
		ligarTurbo = false;
	};

	public void ligarAr() {
		ligarAr = true;
	};

	public void desligarAr() {
		ligarAr = false;
	};
	

	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) { // Se turbo estiver ligado e o ar não
			return 35;
		} else if (ligarTurbo && ligarAr) {// Se o Turbo estiver ligado e o ar também
			return 30;
		} else if (!ligarTurbo && !ligarAr) {// Se ambos estiverem desligados
			return 20;
		}
		return 15;
	}

//	@Override
//	void acelerar() {
////Aumento de velocidade em 15
//		velocidadeAtual += 15;
//		// TODO Auto-generated method stub
//		// super.acelerar();
//	}
}
