//Aula 308 - Abrindo uma Conexão

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {

	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=false", usuario = "root", senha = "123456";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}

}
