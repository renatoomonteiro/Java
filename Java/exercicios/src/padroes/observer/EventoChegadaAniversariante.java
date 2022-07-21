//Aula 255 - Padrão Observer #02

package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {
	private final Date momento;

//Classe responsável por rastrear eventos do mouse e do teclado
	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
}
