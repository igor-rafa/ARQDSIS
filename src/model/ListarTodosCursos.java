package model;

import java.util.ArrayList;

import dao.CursoDAO;
import to.CursoTO;

public class ListarTodosCursos {

	public ArrayList<CursoTO> listarCursos() {
		ArrayList<CursoTO> lista;
		CursoDAO dao = new CursoDAO();
		lista = dao.listarCursos();

		return lista;
	}
}
