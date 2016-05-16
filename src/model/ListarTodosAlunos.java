package model;

import java.util.ArrayList;

import dao.AlunoDAO;
import to.AlunoTO;


public class ListarTodosAlunos {
	
	public ArrayList<AlunoTO> listarAlunos(){
		ArrayList<AlunoTO> lista;
		AlunoDAO dao = new AlunoDAO();
		lista = dao.listarAlunos();
		
		return lista;
	}
}
