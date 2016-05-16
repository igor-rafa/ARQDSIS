package model;

import java.util.ArrayList;

import dao.CursoDAO;
import to.CursoTO;

public class ListarCursos {
	public ArrayList<CursoTO> listarCursos(){
		ArrayList<CursoTO> lista;
		CursoDAO dao = new CursoDAO();
		lista = dao.listarCursos();
		return lista;
	}
	public ArrayList<CursoTO> listarCursos(String chave){
		ArrayList<CursoTO> lista;
		CursoDAO dao = new CursoDAO();
		lista = dao.listarCursos(chave);
		return lista;
	}

}
