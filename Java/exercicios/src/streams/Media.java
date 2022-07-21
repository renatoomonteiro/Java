//Aula 207 - Reduce #04

package streams;

public class Media {
	private double total;
	private int quantidade;

	public Media adicionar(double valor) {
		total += valor;
		quantidade++;
		return this;
	}

	public double getValor() {
		return total / quantidade;
	}

	// Esta fun��o ir� combinar as m�dias
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;

	}
}