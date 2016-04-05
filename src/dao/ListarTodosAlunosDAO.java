package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import factory.ConnectionFactory;
import to.AlunoTO;

public class ListarTodosAlunosDAO {

	public ArrayList<AlunoTO> listarAlunos() {

		AlunoTO to;
		ArrayList<AlunoTO> lista = new ArrayList<>();
		String sqlSelect = "SELECT codigo, nome, sexo, dataNascimento, endereco, numero, complemento, rg, cpf, telefone, email FROM aluno";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					to = new AlunoTO();
					to.setCodigo(rs.getInt("codigo"));
					to.setNome(rs.getString("nome"));
					to.setSexo(rs.getString("sexo"));
					to.setDataNascimento(rs.getString("dataNascimento"));
					to.setEndereco(rs.getString("endereco"));
					to.setNumero(rs.getInt("numero"));
					to.setComplemento(rs.getString("complemento"));
					to.setRG(rs.getString("rg"));
					to.setCPF(rs.getString("cpf"));
					to.setTelefone(rs.getString("telefone"));
					to.setEmail(rs.getString("email"));
					lista.add(to);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return lista;
	}
}
