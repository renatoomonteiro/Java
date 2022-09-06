// Aula 346 - Um Pra Um #03

package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

	public static void main(String[] args) {

		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

		Cliente cliente = daoCliente.obterPorID(1L);
		// Exibir o assento através do cliente
		System.out.println(cliente.getAssento().getNome());
		// Exibir o cliente através do assento
		System.out.println(cliente.getAssento().getCliente().getNome());

		daoCliente.fechar();

		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorID(4L);

		System.out.println(assento.getCliente().getNome());
		
		daoAssento.fechar();

	}

}
