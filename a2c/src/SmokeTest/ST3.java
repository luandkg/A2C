package SmokeTest;

import Controller.Banco;

public class ST3 {

	public void Iniciar(Banco BancoC) {

		System.out.println(" ---------------- Smoke Teste : ST3 ---------------------------------");

		// Teste para solicitar caronas compartilhadas

		int LUANFREITAS_ID = BancoC.usuario_obteridPorUsuario("luanfreitas");
		int MARUAN_ID = BancoC.usuario_obteridPorUsuario("maruan");
		int LAFETA_ID = BancoC.usuario_obteridPorUsuario("lafeta");

		System.out.println("    - LUANFREITAS : " + BancoC.caronas_solicitar(LUANFREITAS_ID, 6).getFrase());
		System.out.println("    - LUANFREITAS : " + BancoC.caronas_solicitar(LUANFREITAS_ID, 8).getFrase());
		System.out.println("    - MARUAN : " + BancoC.caronas_solicitar(MARUAN_ID, 0).getFrase());
		System.out.println("    - MARUAN : " + BancoC.caronas_solicitar(MARUAN_ID, 1).getFrase());
		System.out.println("    - MARUAN : " + BancoC.caronas_solicitar(MARUAN_ID, 2).getFrase());
		System.out.println("    - LAFETA : " + BancoC.caronas_solicitar(LAFETA_ID, 2).getFrase());

		System.out.println(" ---------------- ---------------- ---------------------------------");

	}
}
