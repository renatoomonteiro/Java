package arrays;

public class Foreach {

	public static void main(String[] args) {

		double notas[] = { 9.9, .87, 7.2, 9.4 };

		//Em java, n�o se escreve foreach (para cada)
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(i+1 +")Nota: " + notas[i]);
		}
		//La�o foreach
		
		for(double nota: notas) {//Itera atrav�s de cada elemento, 
//sem a necessidade de definir limite de tamanho
			System.out.println(nota);
		}
	}
}
