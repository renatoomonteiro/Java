//Aula 259 - Campo Minado com Observer #03

package br.com.cod3r.cm.modelo;

public class ResultadoEvento {
	
	private final boolean ganhou;

	public ResultadoEvento(boolean ganhou) {
		this.ganhou = ganhou;
	}

	public boolean isGanhou() {
		return ganhou;
	}

}
