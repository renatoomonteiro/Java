// Aula 331 - Novo Usuário
// Aula 332 - Obter Usuário

package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		// EntityManagerFactory = FabricaDeConexoes,
		// responsável por criar o EntityManager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		// EntityManager responsável pela conexão
		// Entre a entidade e a tabela (CRUD)
		EntityManager em = emf.createEntityManager();
		// Criação de um novo usuário:
		Usuario novoUsuario = new Usuario("Xaropinho", "xaropinho@di.com");
		// Criação do id do usuario
		// novoUsuario.setId(1L);
		// Iniciei a transação: (similar ao begin tran do SQL Server)
		em.getTransaction().begin();
		// Mandei persistir no banco:
		em.persist(novoUsuario);
		// Mandei efetivar a transação:
		em.getTransaction().commit();
		// Mandei fechar a conexao
		System.out.println("Id gerado:" + novoUsuario.getId());
		em.close();
		emf.close();
	}

}
