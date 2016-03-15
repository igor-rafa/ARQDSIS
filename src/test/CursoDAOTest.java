package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dao.CursoDAO;
import to.CursoTO;

public class CursoDAOTest {
	
	CursoDAO dao;
	CursoTO to;
	
	@Before
	public void setUp() throws Exception {
		dao = new CursoDAO();
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
	
	public void test00Carregar() {
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		//insert into cliente (id, nome, fone) values (1, 'nome1', 'fone1');
		CursoTO fixture = new CursoTO();
		fixture.setCodigo(1);
		fixture.setNome("Rafael");
		fixture.setTipo("Informatica");
		fixture.setDataDeInicio("10/10/15");
		fixture.setDataDeTermino("10/10/15");
		fixture.setHorario("10:00");
		fixture.setValor(10.00);
		fixture.setNumeroDeVagas(10);
		fixture.setTipoLab("A");
		fixture.setSoftwares("Nenhum");
		fixture.setLivros("Alguns");
		fixture.setDescricao("Nenhum");
		CursoTO novo = dao.carregar(1);
		novo.setId(1);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Inserir() {
		dao.incluir(to);
		CursoTO novo = dao.carregar(to.getId());
		novo.setId(to.getId());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test02Atualizar() {
		to.setNome("i");
		dao.atualizar(to);
		CursoTO novo = dao.carregar(to.getId());
		novo.setId(to.getId());
		assertEquals("testa inclusao", novo, to);
	}
	
	@Test
	public void test03Excluir() {
		to.setNome(null);
		to.setValor(null);
		dao.excluir(to);
		CursoTO novo = dao.carregar(to.getId());
		novo.setId(to.getId());
		assertEquals("testa inclusao", novo, to);
	}
}
