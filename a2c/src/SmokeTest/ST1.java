package SmokeTest;

import Controller.Banco;

public class ST1 {

	public void Iniciar(Banco BancoC) {

		System.out.println(" ---------------- Smoke Teste : ST1 ---------------------------------");

		// Teste para adicionar usuarios
		
		System.out.println("    - LUANFREITAS : " + BancoC.usuario_criar("luanfreitas","luan@unb.br", "111.111.111-11","123").getFrase());
		System.out.println("    - MARUAN : " + BancoC.usuario_criar("maruan","maruan@unb.br","222.222.222-22", "456").getFrase());
		System.out.println("    - LAFETA : " + BancoC.usuario_criar("lafeta", "lafeta@unb.br","333.333.333-33","789").getFrase());

		System.out.println(" ---------------- ---------------- ---------------------------------");

	}
}














