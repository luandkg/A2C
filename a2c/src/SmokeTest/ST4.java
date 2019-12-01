package SmokeTest;

import Controller.Banco;

public class ST4 {

	public void Iniciar(Banco BancoC) {

		System.out.println(" ---------------- Smoke Teste : ST4 ---------------------------------");

		// Teste para cadastar metodos de pagamentos

		int LUANFREITAS_ID = BancoC.usuario_obteridPorUsuario("luanfreitas");
		int MARUAN_ID = BancoC.usuario_obteridPorUsuario("maruan");
		int LAFETA_ID = BancoC.usuario_obteridPorUsuario("lafeta");

		System.out.println("    - LUANFREITAS : " + BancoC.metododePagamento_criar(LUANFREITAS_ID, "DÉBITO", "123.456.789-86").getFrase());
		System.out.println(
				"    - MARUAN : " + BancoC.metododePagamento_criar(MARUAN_ID, "DÉBITO", "994.502.116-34").getFrase());
		System.out.println(
				"    - MARUAN : " + BancoC.metododePagamento_criar(MARUAN_ID, "CREDITO", "994.502.116-34").getFrase());
		System.out.println(
				"    - LAFETA : " + BancoC.metododePagamento_criar(LAFETA_ID, "CREDITO", "297.508.818-12").getFrase());

		System.out.println(" ---------------- ---------------- ---------------------------------");

	}
}







