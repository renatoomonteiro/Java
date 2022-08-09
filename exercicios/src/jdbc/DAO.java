//Aula 320 - Padrão DAO #01
//Aula 321 - Padrão DAO #02

package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	private Connection conexao;

	// Criação do método que irá tratar os comandos sql
	// com a lista de atributos, que é um objeto do tipo Object...
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);
			// Execução do comando com a verificação do update
			if(stmt.executeUpdate() > 0) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			return -1;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	// Método que irá encerrar a conexão:
	public void close() {
		try {
			getConexao().close();
		} catch (Exception e) {
			
		} finally {
			conexao = null;
		}
	}
	
	// Este método irá percorrer os atributos e identificar os tipos de dados
	// String, Int, Boolean, Long, etc.
	private void adicionarAtributos(PreparedStatement stmt, 
			Object[] atributos) throws SQLException {
		int indice = 1;

		for (Object atributo : atributos) {
			if (atributo instanceof String) {
				stmt.setString(indice, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(indice, (Integer) atributo);
			}
			indice++;
		}
	}

	// Verificar se a conexao existe ou está fechada
	private Connection getConexao() throws SQLException, IOException {

		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (Exception e) {

		}
		conexao = FabricaConexao.getConexao();
		return conexao;
	}
}
