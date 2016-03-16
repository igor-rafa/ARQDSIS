package test;

import static org.junit.Assert.assertEquals;
import model.Cliente;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CursoTest {
	Curso curso, copia;

	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
	 * houver, delete. 
	 * Certifique-se também que sobrecarregou o equals na classe
	 * Cliente. 
	 * Certifique-se que a fixture cliente1 foi criada no banco.
	 * Além disso, a ordem de execução dos testes é importante; por
	 * isso a anotação FixMethodOrder logo acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		curso = new Cliente(3, "rafael", "informatica", null, null );
		copia = new Cliente(3, "rafaeli", "informatica", null, null );
	}
	
	@Test
	public void test00Carregar() {
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		//insert into cliente (id, nome, fone) values (1, 'nome1', 'fone1');
		Curso fixture = new Curso(1, "nome1", "fone1");
		Curso novo = new Cliente(1, null, null);
		novo.carregar();
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		Curso.criar();
		Curso.carregar();
		assertEquals("testa criacao", Curso, copia);
	}

	@Test
	public void test02Atualizar() {
		Curso.setTipo("999999");
		copia.setTipo("999999");		
		cliente.atualizar();
		assertEquals("testa inclusao", cliente, copia);
	}

	@Test
	public void test03Excluir() {
		Curso.setNome(null);
		Curso.setFone(null);
		copia.setNome(null);
		copia.setFone(null);
		Curso.excluir();
		assertEquals("testa inclusao", cliente, copia);
	}
}