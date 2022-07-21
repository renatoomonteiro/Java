//Aula nº 163 Getters/Setters

package oo.composicao.encapsulamento;

//Classe que chama a classe pessoa, passando os parâmetros
public class PessoaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -45);
		p1.setIdade(230); // Alterar
		System.out.println(p1.getIdade()); // ler
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
		
	}
}
