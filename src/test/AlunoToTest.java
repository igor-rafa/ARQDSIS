package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import to.AlunoTO;

public class AlunoToTest {

	AlunoTO to;

	@Before
	public void setUp() throws Exception {
		to = new AlunoTO();
		to.setNome("Igor Apolinário");
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
	public void test() {
		fail("Not yet implemented");
	}

}
