package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import to.CursoTO;

public class CursoTOTest {
	CursoTO to; 
	@Before
	public void setUp() throws Exception {
		to = new CursoTO();
		to.setCodigo(1);
		to.setNome("Rafael");
		to.setTipo("Informatica");
		to.setDataDeInicio("10/10/15");
		to.setDataDeTermino("10/10/15");
		to.setHorario("10:00");
		to.setValor(10.00);
		to.setNumeroDeVagas(10);
		to.setTipoLab("A");
		to.setSoftwares("Nenhum");
		to.setLivros("Alguns");
		to.setDescricao("Nenhum");

	}

	@Test
	public void testGets() {
		assertEquals("getNome", to.getNome(), "Rafael");
		assertEquals("getTipo", to.getFone(), "Informatica");
		assertEquals("getId", to.getId(), 3);
	}
	
	@Test
	public void testEquals(){
		ClienteTO copia = new ClienteTO();
		copia.setFone(to.getFone());
		copia.setNome(to.getTipo());
		copia.setId(to.getId());
		assertEquals("teste to igual a copia", to, copia);
	}

}
