//Aula 352 - Named Query

package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {

		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar(
				"obterFilmesComNotaMaiorQue", "nota" , 8.5);
		//La�o que tr�s o nome do filme com maior nota 
		System.out.println("O filme com a maior nota foi: ");
		for (Filme filme : filmes) {
			System.out.println(filme.getNome() + 
					"\nA nota do filme foi " + filme.getNota());
			//La�o que tr�s os atores desse filme
			System.out.println("Os atores s�o: ");
			for (Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());				
			}
			
		}
	}
}
