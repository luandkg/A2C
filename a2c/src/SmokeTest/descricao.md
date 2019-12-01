# Descrição dos testes

## Objetivos

<p> Os testes proporcionam uma verificação do programa antes do uso, assim é utilizado dados hipotéticos para procurar erros, anomalias ou informações sobre atributos não funcionais do programa.
<p> Segundo Sommerville , Engenharia de Software, 9ª edição, página 175, os testes tem dois objetivos distintos. O primeiro é demonstrar ao desenvolvedor e ao cliente que o software atende a seus requisitos. O segundo é descobrir situações em que o software se comporta de maneira indesejável.  Deve ser lembrado que os teste só demonstram a presença de erros não a sua ausência. Assim, os testes mitigam a possibilidade do software não funcionar corretamente, uma vez que não é possível eliminar esse risco. </p>

## Teste escolhido
Utilizamos o Smoke test que é conjunto de testes automatizados, sendo mais céleres que os usuais, com o intuito de validar se os pontos principais da aplicação continuam funcionando após as alterações.</p>

## Pontos testados

Os seguintes pontos foram testados no software: </p>
Teste para adicionar usuários; </p>
Teste para adicionar caronas compartilhadas;</p>
Teste para solicitar caronas compartilhadas;</p>
Teste para cadastrar métodos de pagamentos; </p>

## Testes efetuados

Foram feitos testes unitários previamente determinados, nos pontos testados, a seguir o código fonte de um teste unitário para adicionar caronas compartilhadas:</p>


int LUANFREITAS_ID = BancoC.usuario_obteridPorUsuario("luanfreitas");

		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "12/11/19 20:30", 4, "Fusca Amarelo 1993")
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "12/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());
		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "13/11/19 20:30", 4, "Fusca Amarelo 1993")
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "13/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());
		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "14/11/19 20:30", 4, "Fusca Amarelo 1993")
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "14/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());
		System.out.println("    - LUANFFTEITAS : " + BancoC
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "15/11/19 20:30", 4, "Fusca Amarelo 1993")
				.caronas_criar(LUANFREITAS_ID, origem, "Setor Bancario Sul", "15/11/19 20:30", 4, "Fusca Amarelo 1993",1)
				.getFrase());

		int MARUAN_ID = BancoC.usuario_obteridPorUsuario("maruan");

		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Ceilandia - Setor O", "10/11/19 20:30", 4, "Hyndai Veloster 2012")
				.caronas_criar(MARUAN_ID, origem, "Ceilandia - Setor O", "10/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());
		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Ceilandia - Setor O", "11/11/19 20:30", 4, "Hyndai Veloster 2012")
				.caronas_criar(MARUAN_ID, origem, "Ceilandia - Setor O", "11/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());
		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Taguatinga Norte", "20/11/19 20:30", 4, "Hyndai Veloster 2012")
				.caronas_criar(MARUAN_ID, origem, "Taguatinga Norte", "20/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());
		System.out.println("    - MARUAN : " + BancoC
				.caronas_criar(MARUAN_ID, origem, "Taguatinga Norte", "21/11/19 20:30", 4, "Hyndai Veloster 2012")
				.caronas_criar(MARUAN_ID, origem, "Taguatinga Norte", "21/11/19 20:30", 4, "Hyndai Veloster 2012",5)
				.getFrase());

		int LAFETA_ID = BancoC.usuario_obteridPorUsuario("lafeta");

		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "10/11/19 20:30", 4, "Opala 1964").getFrase());
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "10/11/19 20:30", 4, "Opala 1964",13).getFrase());
		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "11/11/19 20:30", 4, "Opala 1964").getFrase());
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "11/11/19 20:30", 4, "Opala 1964",13).getFrase());
		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "20/11/19 20:30", 4, "Opala 1964").getFrase());
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "20/11/19 20:30", 4, "Opala 1964",13).getFrase());
		System.out.println("    - LAFETA : " + BancoC
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "21/11/19 20:30", 4, "Opala 1964").getFrase());
				.caronas_criar(LAFETA_ID, origem, "Águas Claras", "21/11/19 20:30", 4, "Opala 1964",13).getFrase());

		System.out.println(" ---------------- ---------------- ---------------------------------");
### Telas dos testes

!<Título>(images/prints/00.png)
		
## Resultados esperados

Os resultados foram de acordo com os requisitos do sistema. Assim, nessa fase inicial não foram necessárias intervenções e correções para a continuidade do projeto.

