//Aula 309 - Criar Banco de Dados

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=false", 
				usuario = "root",
				senha = "123456";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);

		//Connection conexao =  FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java2");
		
		System.out.println("Banco criado com sucesso!");
		
		conexao.close();		
	}

}
