package SmokeTest;

import Controller.Banco;

public class Smoker {

	public void Iniciar(Banco BancoC) {

		System.out.println(" ------------------------- Smoke Tests ---------------------------------");

		ST1 Teste1 = new ST1();
		Teste1.Iniciar(BancoC);

		ST2 Teste2 = new ST2();
		Teste2.Iniciar(BancoC);

		ST3 Teste3 = new ST3();
		Teste3.Iniciar(BancoC);

		ST4 Teste4 = new ST4();
		Teste4.Iniciar(BancoC);

		System.out.println(" ---------------- ---------------- ---------------------------------");

	}
}



