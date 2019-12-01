package SmokeTest;

import Controller.Banco;

public class ST2 {

	public void Iniciar(Banco BancoC) {

		System.out.println(" ---------------- Smoke Teste : ST2 ---------------------------------");

		String origem = "Universidade de Brasilia - PAT";

		// Teste para adicionar caronas compartilhadas
		
		int LUANFREITAS_ID = BancoC.usuario_obteridPorUsuario("luanfreitas");

		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "12/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());
		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "13/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());
		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "14/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());
		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "15/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());

		int MARUAN_ID = BancoC.usuario_obteridPorUsuario("maruan");

		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Ceilandia - Setor O", "10/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());
		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Ceilandia - Setor O", "11/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());
		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Taguatinga Norte", "20/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());
		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Taguatinga Norte", "21/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());

		int LAFETA_ID = BancoC.usuario_obteridPorUsuario("lafeta");

		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "10/11/19 20:30", 4, "Opala 1964",13).getFrase());
		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "11/11/19 20:30", 4, "Opala 1964",13).getFrase());
		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "20/11/19 20:30", 4, "Opala 1964",13).getFrase());
		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "21/11/19 20:30", 4, "Opala 1964",13).getFrase());

		System.out.println(" ---------------- ---------------- ---------------------------------");

	}
}
