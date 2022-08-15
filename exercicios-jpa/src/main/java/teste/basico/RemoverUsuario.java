//Aula 336 - Alterar Usuário #03

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class , 8L);
		//Se usuário não estiver vazio, remova-o de acordo com 
		// o parâmetro passado, Id 8 = 8L
		if(usuario != null) {
			// Inicio a transação:
			em.getTransaction().begin();
			// Removo o usuário
			em.remove(usuario);
			// Confirmo a transação:
			em.getTransaction().commit();
			System.out.println("Usuario " + usuario.getNome() + " removido com sucesso!");
		}
		
		em.close();
		emf.close();

	}

}
