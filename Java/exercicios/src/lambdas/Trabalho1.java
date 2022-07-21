//Aula 188 - Interfaces Funcionais Antes Java 8
package lambdas;

public class Trabalho1 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #01");
			try {
				Threads.sleep(10);
			} catch (Exception e) {
			}
		}
	}

}
