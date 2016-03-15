package test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import factory.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void testObterConexao() {
		try {
			Connection conn = ConnectionFactory.obtemConexao();
			assertNotNull("Ir� testar se a conex�o n�o � nula", conn);
			assertTrue("Ir� verificar se � um objeto de conex�o", conn instanceof Connection );
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Caso der errado, gerou SQLException");
		}
	}


}
