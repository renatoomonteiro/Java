package oo.composicao.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused")
	private String segredo = "..."; // Private, s� a classe enxerga
	String facoDentroDeCasa = "...";// Default ou do pacote, todos do pacote enxergam
	protected String formaDeFalar = "..."; // � transmitido por heran�a para classes filhas
	public String todosSabem = "..."; // Dispon�vel para todas as classes e pacotes
}
