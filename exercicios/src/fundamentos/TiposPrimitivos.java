package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Informa��es do funcionario

//Tipos num�ricos inteiros
		// tipos primitivos

		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		// L mai�sculo identifica que � um long,
		// se deixar min�sculo, pode confundir com o
		// n�mero um

		//Tipos num�ricos reais
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano: true or false
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//N�meros de viagens
		System.out.println(numerosDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha- > R$ " + salario);
		System.out.println("F�rias? "+ estaDeFerias);
		System.out.println("Status " + status);
		
	}

}
