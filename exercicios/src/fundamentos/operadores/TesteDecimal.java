package fundamentos.operadores;

import java.text.DecimalFormat;

public class TesteDecimal {

	public static void main(String args[]) {
		double numero = 1.9851008;
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("Número antes da formatação: " + numero);
		System.out.println("Número depois formatação: " + formatador.format(numero));
	}
}
