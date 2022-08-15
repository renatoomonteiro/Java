// Aula 331 - Novo Usu�rio
// Aula 332 - Obter Usu�rio

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		// EntityManagerFactory = FabricaDeConexoes,
		// respons�vel por criar o EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		// EntityManager respons�vel pela conex�o
		// Entre a entidade e a tabela (CRUD)
		EntityManager em = emf.createEntityManager();
		// Cria��o de um novo usu�rio:
		Usuario novoUsuario = new Usuario("Xaropinho", "xaropinho@di.com");
		// Cria��o do id do usuario
		// novoUsuario.setId(1L);
		// Iniciei a transa��o: (similar ao begin tran do SQL Server)
		em.getTransaction().begin();
		// Mandei persistir no banco:
		em.persist(novoUsuario);
		// Mandei efetivar a transa��o:
		em.getTransaction().commit();
		// Mandei fechar a conexao
		System.out.println("Id gerado:" + novoUsuario.getId());
		em.close();
		emf.close();
	}

}
