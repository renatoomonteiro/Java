package fundamentos.operadores;

public class DesafioLogicosResposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^  trabalho2;
		boolean comprouSorvete = trabalho1 ||  trabalho2;
		//Operador unário!
		boolean maisSaudavel = !comprouSorvete;
 		
		System.out.println("Comprou TV 50\"? \n" + comprouTV50 );
		System.out.println("Comprou TV 32\"? \n" + comprouTV32 );
		System.out.println("Comprou TV sorvete? \n" + comprouSorvete );
		System.out.println("Mai saudável \n" + maisSaudavel);
		
	}

}
