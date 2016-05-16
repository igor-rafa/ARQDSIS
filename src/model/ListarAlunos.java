package model;

import java.util.ArrayList;

import dao.AlunoDAO;
import to.AlunoTO;

public class ListarAlunos {
	public ArrayList<AlunoTO> listarAlunos(){
		ArrayList<AlunoTO> lista;
		AlunoDAO dao = new AlunoDAO();
		lista = dao.listarAlunos();
		return lista;
	}
	public ArrayList<AlunoTO> listarAlunos(String chave){
		ArrayList<AlunoTO> lista;
		AlunoDAO dao = new AlunoDAO();
		lista = dao.listarAlunos(chave);
		return lista;
	}

}
