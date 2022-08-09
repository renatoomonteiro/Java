//Aula 321 - Padr�o DAO #02

package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Jo�o da Silva"));
		System.out.println(dao.incluir(sql, "Ana Julia"));
		System.out.println(dao.incluir(sql, "Djalma Pereira"));
		// Chamada do m�todo para fechar a conex�o
		dao.close();
	}
}
