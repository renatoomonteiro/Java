package arrays;

public class Foreach {

	public static void main(String[] args) {

		double notas[] = { 9.9, .87, 7.2, 9.4 };

		//Em java, não se escreve foreach (para cada)
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(i+1 +")Nota: " + notas[i]);
		}
		//Laço foreach
		
		for(double nota: notas) {//Itera através de cada elemento, 
//sem a necessidade de definir limite de tamanho
			System.out.println(nota);
		}
	}
}
