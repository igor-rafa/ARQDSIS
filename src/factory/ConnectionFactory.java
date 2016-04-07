package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

	public class Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./properties/config.properties");
		props.load(file);
		return props;
	}
	
	public class ConnectionFactory {
		static {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}
	
		// Obtem conexão com o banco de dados
		public static Connection obtemConexao() throws SQLException {
			Properties prop = getProp();
			
			String user = prop.getProperty("prop.server.login");
			String password = prop.getProperty("prop.server.password");
			
			return DriverManager
					.getConnection("jdbc:mysql://localhost/projeto_integrado?user="+user+"&password="+password);
		}
	
	}
