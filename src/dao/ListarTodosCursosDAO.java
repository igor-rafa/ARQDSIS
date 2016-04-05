package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import factory.ConnectionFactory;
import to.CursoTO;

public class ListarTodosCursosDAO {

	public ArrayList<CursoTO> listarCursos() {
		CursoTO to;
		ArrayList<CursoTO> lista = new ArrayList<>();
		String sqlSelect = "SELECT codigo, nome, tipo, dataDeInicio, dataDeTermino, horario, numeroDeVagas, valor, tipoLab, softwares, livros, descricaoMaterial";
		// usando o try with resources do Java 7, que fecha o que abriu
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			try (ResultSet rs = stm.executeQuery();) {
				while (rs.next()) {
					to = new CursoTO();
					to.setCodigo(rs.getInt("codigo"));
					to.setNome(rs.getString("nome"));
					to.setTipo(rs.getString("tipo"));
					to.setDataDeInicio(rs.getString("dataDeInicio"));
					to.setDataDeTermino(rs.getString("dataDeTermino"));
					to.setHorario(rs.getString("horario"));
					to.setNumeroDeVagas(rs.getInt("numeroDeVagas"));
					to.setValor(rs.getDouble("valor"));
					to.setTipoLab(rs.getString("tipoLab"));
					to.setSoftwares(rs.getString("softwares"));
					to.setLivros(rs.getString("livros"));
					to.setDescricao(rs.getString("descricaoMaterial"));
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
