// Aula 353 - Named Native Query

package teste.consulta;

import infra.DAO;
import modelo.consulta.NotaFilme;

public class ObterMediaFilmes {

	public static void main(String[] args) {
			
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFimes");
		
		System.out.println("A média é " + nota.getMedia());
		
		dao.fechar();

	}

}
