package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.12345678888888; // Impl�cita, n�o h� perda de dados, pois o tipo
//Double suporta grandes n�meros

		System.out.println(a);
		float b = (float) 1.123456789888;// Expl�cita (CAST), H� perda de dados, pois o tipo
//Float n�o suporta grandes n�meros
		System.out.println(b);
//Em par�nteses, o tipo do dado ser� convertido expl�cita

		int c = 340;
		byte d = (byte) c; // expl�cita (CAST)
// expl�cita (CAST)
		System.out.println(c);
		System.out.println(d);

		double e = 1.9999999;
		int f = (int) e; // expl�cita (CAST)
		System.out.println(f);

	}

}
