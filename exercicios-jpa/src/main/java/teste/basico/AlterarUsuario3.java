//Aula 335 - Alterar Usuário #02
//Aula 336 - Alterar Usuário #03 

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
		// Desassociar uma instância:
		// Não fará alterações automáticas no banco de dados
		em.detach(usuario);
		
		usuario.setNome("Leonardo Moura Leitão");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
