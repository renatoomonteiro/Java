package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.12345678888888; // Implícita, não há perda de dados, pois o tipo
//Double suporta grandes números

		System.out.println(a);
		float b = (float) 1.123456789888;// Explícita (CAST), Há perda de dados, pois o tipo
//Float não suporta grandes números
		System.out.println(b);
//Em parênteses, o tipo do dado será convertido explícita

		int c = 340;
		byte d = (byte) c; // explícita (CAST)
// explícita (CAST)
		System.out.println(c);
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // explícita (CAST)
		System.out.println(f);

	}

}
