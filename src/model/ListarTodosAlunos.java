package model;

import java.util.ArrayList;

import dao.ListarTodosAlunosDAO;
import to.AlunoTO;


public class ListarTodosAlunos {
	
	public ArrayList<AlunoTO> listarAlunos(){
		ArrayList<AlunoTO> lista;
		ListarTodosAlunosDAO dao = new ListarTodosAlunosDAO();
		lista = dao.listarAlunos();
		
		return lista;
	}
}
