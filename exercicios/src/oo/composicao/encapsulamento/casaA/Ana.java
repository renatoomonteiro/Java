package oo.composicao.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused")
	private String segredo = "..."; // Private, só a classe enxerga
	String facoDentroDeCasa = "...";// Default ou do pacote, todos do pacote enxergam
	protected String formaDeFalar = "..."; // É transmitido por herança para classes filhas
	public String todosSabem = "..."; // Disponível para todas as classes e pacotes
}
