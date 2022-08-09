// Aula 318 - Excluir Registro

package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExlcuirPessoa {

	public static void main(String[] args) throws SQLException, IOException {
		// Peguei o c�digo:
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o c�digo: ");
		int codigo = entrada.nextInt();
		// Fiz o delete
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		// Setei o c�digo
		// Tratamento do comando sql para evitar sqlInjection
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);

		
		// Criei um contador para saber a quantidade de linhas afetadas
		int contador = stmt.executeUpdate();
		
		
		// Testei para saber se foi feito o update
		if (contador > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else {
			System.out.println("Nada feito!");
		}
		System.out.println("Linhas afetadas: " + contador);

		conexao.close();
		entrada.close();

	}

}
