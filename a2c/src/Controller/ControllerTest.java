package Controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class ControllerTest extends TestCase {

	
	// UNIT TESTING
	
	@Test
	void test() {
		
		Banco BancoC = new Banco();
		
		Assert.assertEquals(true, BancoC.usuario_criar("maruan","maruan@unb.br", "222.222.222-22","Maruan1993").getStatus());
		
		Assert.assertEquals(true, BancoC.usuario_criar("luanfreitas","luan@unb.br", "555.555.555-55","Diluan1992").getStatus());

		

		int MARUAN_ID = BancoC.usuario_obteridPorUsuario("maruan");
		int LUAN_ID = BancoC.usuario_obteridPorUsuario("luanfreitas");

		
		Assert.assertEquals(true, BancoC.caronas_criar(LUAN_ID, "Universidade de Brasilia - PAT", "PARANOA", "10/11/19 20:30", 4, "Fusca Vermelho 1993",5).getStatus());
	
		Assert.assertEquals(true, BancoC.caronas_solicitar(MARUAN_ID, 0).getStatus());
		
		Assert.assertEquals(true, BancoC.metododePagamento_criar(MARUAN_ID, "DÉBITO", "994.502.116-34").getStatus());
	
	}	   	 

}
