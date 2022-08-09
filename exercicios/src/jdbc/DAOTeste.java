//Aula 321 - Padrão DAO #02

package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "João da Silva"));
		System.out.println(dao.incluir(sql, "Ana Julia"));
		System.out.println(dao.incluir(sql, "Djalma Pereira"));
		// Chamada do método para fechar a conexão
		dao.close();
	}
}
