//Aula 336 - Alterar Usu�rio #03

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
		//Se usu�rio n�o estiver vazio, remova-o de acordo com 
		// o par�metro passado, Id 8 = 8L
		if(usuario != null) {
			// Inicio a transa��o:
			em.getTransaction().begin();
			// Removo o usu�rio
			em.remove(usuario);
			// Confirmo a transa��o:
			em.getTransaction().commit();
			System.out.println("Usuario " + usuario.getNome() + " removido com sucesso!");
		}
		
		em.close();
		emf.close();

	}

}
