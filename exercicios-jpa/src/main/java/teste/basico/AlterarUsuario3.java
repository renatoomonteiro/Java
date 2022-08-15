//Aula 335 - Alterar Usu�rio #02
//Aula 336 - Alterar Usu�rio #03 

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Usuario usuario	= em.find(Usuario.class, 7L); 
		// Desassociar uma inst�ncia:
		// N�o far� altera��es autom�ticas no banco de dados
		em.detach(usuario);
		
		usuario.setNome("Leonardo Moura Leit�o");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
