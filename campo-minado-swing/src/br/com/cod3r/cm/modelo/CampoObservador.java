//Aula 258 - Campo Minado com Observer #02

package br.com.cod3r.cm.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
