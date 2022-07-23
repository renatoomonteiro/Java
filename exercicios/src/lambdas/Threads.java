//Aula 188 - Interfaces Funcionais Antes Java 8

package lambdas;

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable trabalho1 = new Trabalho1();
		Runnable trabalho2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
					try {
						Threads.sleep(10);
					} catch (Exception e) {
					}
				}
			}
		};

		Runnable trabalho3 = Threads::trabalho3;

		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		t1.start();
		t2.start();
		t3.start();
	}

	public static void sleep(int i) {
		// TODO Auto-generated method stub

	}

	static void trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #02");
			try {
				Threads.sleep(10);
			} catch (Exception e) {
			}
		}
	}
}
