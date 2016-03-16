package test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import to.AlunoTO;
import dao.AlunoDAO;

	public class AlunoDAOTest {
	
		AlunoDAO dao;
		AlunoTO to;
		
		/*
		 * Antes de rodar este teste, certifique-se que nao ha no banco
		 * nenhuma linha com o id igual ao do escolhido para o to instanciado
		 * abaixo. Se houver, delete. 
		 * Certifique-se de que o fixture cliente 1 existe no banco.
		 * Certifique-se tamb�m que sobrecarregou o equals na classe ClienteTO
		 * Al�m disso, a ordem de execu��o dos testes � importante; por isso a anota��o
		 * FixMethodOrder logo acima do nome desta classe
		 */
		@Before
		public void setUp() throws Exception {
			dao = new AlunoDAO();
			to = new AlunoTO();
			to.setNome("Igor Apolin�rio");
			to.setSexo("Masculino");
			to.setDataNascimento("20/06/1996");
			to.setTelefone("0000-1234");
			to.setEndereco("Rua A");
			to.setNumero(1);
			to.setComplemento("Apartamento");
			to.setRG("000-000-000");
			to.setCPF("000-000-000");
			to.setEmail("igor@hotmail.com");
		}
		
		@Test
		public void test00Carregar() {
			//para funcionar o cliente 1 deve ter sido carregado no banco por fora
			AlunoTO fixture = new AlunoTO();
			fixture.setSexo("Masculino");
			fixture.setDataNascimento("20/06/1996");
			fixture.setTelefone("0000-1234");
			fixture.setEndereco("Rua A");
			fixture.setNumero(1);
			fixture.setComplemento("Apartamento");
			fixture.setRG("000-000-000");
			fixture.setCPF("000-000-000");
			fixture.setEmail("igor@hotmail.com");
			fixture.setCodigo(1);

			AlunoTO novo = dao.carregar(1);
			novo.setCodigo(1);
			assertEquals("testa inclusao", novo, fixture);
		}
		
		@Test
		public void testInserir01() {
			dao.incluir(to);
			AlunoTO novo = dao.carregar(to.getCodigo());
			novo.setCodigo(to.getCodigo());
			assertEquals("Teste de inclus�o", novo, to);
		}
		
		@Test
		public void testAtualizar02() {
			to.setTelefone("2521-5690");
			to.setEndereco("Rua C");
			to.setComplemento("Rua B");
			to.setDataNascimento("30/06/1997");
			to.setEmail("igor_apolinario96@hotmail.com");
			dao.atualizar(to);
			AlunoTO novo = dao.carregar(to.getCodigo());
			novo.setCodigo(to.getCodigo());
			assertEquals("Teste de atualiza��o", novo, to);
		}
		
		@Test
		public void testExcluir03() {

			to.setNome(null);
			to.setSexo(null);
			to.setDataNascimento(null);
			to.setTelefone(null);
			to.setEndereco(null);
			to.setNumero(0);
			to.setComplemento(null);
			to.setRG(null);
			to.setCPF(null);
			to.setEmail(null);
			
			dao.excluir(to);
			AlunoTO novo = dao.carregar(to.getCodigo());
			novo.setCodigo(to.getCodigo());
			assertEquals("Teste de exclus�o", novo, to);
		}

}
