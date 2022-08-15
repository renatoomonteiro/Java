// Aula 333 - Obter Usu�rios

package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		// Usuario � o nome da classe e n�o da tabela SQL
		String jpql = "select u from Usuario u";
		// TypedQuery = consulta com tipo
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		// Definindo a sa�da do resultado para 5
		query.setMaxResults(5);
		
//		List<Usuario> usuarios = em 
//				.createQuery("select u from Usuario u", Usuario.class)
//				.setMaxResults(5)
//				.getResultList();
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("Id: " + usuario.getId() +
					" -> E-mail: " + usuario.getEmail());
		}
		
		em.close();
		emf.close();

	}

}
