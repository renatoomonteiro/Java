// Aula 343 - Um Pra Um #01

package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {

		Assento assento = new Assento("23F");
		Cliente cliente = new Cliente("Bia", assento);

		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(assento) // Inserir 1º o assento
			.incluir(cliente) // Depois o cliente
			.fecharT()
			.fechar();
	}
}
