package model;

import java.util.ArrayList;

import dao.ListarTodosCursosDAO;
import to.CursoTO;

public class ListarTodosCursos {

	public ArrayList<CursoTO> listarCursos() {
		ArrayList<CursoTO> lista;
		ListarTodosCursosDAO dao = new ListarTodosCursosDAO();
		lista = dao.listarCursos();

		return lista;
	}
}
