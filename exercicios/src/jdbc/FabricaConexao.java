//Aula 310 - F�brica de Conex�es

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static Connection getConexao() throws SQLException {
		try {
			final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=false", 
					usuario = "root",
					senha = "123456";

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
