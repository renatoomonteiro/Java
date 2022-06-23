package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Informações do funcionario

//Tipos numéricos inteiros
		// tipos primitivos

		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		// L maiúsculo identifica que é um long,
		// se deixar minúsculo, pode confundir com o
		// número um

		//Tipos numéricos reais
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano: true or false
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Números de viagens
		System.out.println(numerosDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha- > R$ " + salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status " + status);
		
	}

}
