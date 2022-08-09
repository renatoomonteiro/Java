//Aula 310 - Fábrica de Conexões
//Aula 311 - Criar Tabela
//Aula 319 - Externalizando Dados de Conexão

package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao() throws SQLException, IOException {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url"), 
					usuario = prop.getProperty("banco.usuario"),
					senha = prop.getProperty("banco.senha");

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static Properties getProperties() throws IOException{
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}
