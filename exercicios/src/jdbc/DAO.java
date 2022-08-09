//Aula 320 - Padr�o DAO #01
//Aula 321 - Padr�o DAO #02

package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	private Connection conexao;

	// Cria��o do m�todo que ir� tratar os comandos sql
	// com a lista de atributos, que � um objeto do tipo Object...
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);
			// Execu��o do comando com a verifica��o do update
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
	// M�todo que ir� encerrar a conex�o:
	public void close() {
		try {
			getConexao().close();
		} catch (Exception e) {
			
		} finally {
			conexao = null;
		}
	}
	
	// Este m�todo ir� percorrer os atributos e identificar os tipos de dados
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

	// Verificar se a conexao existe ou est� fechada
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
