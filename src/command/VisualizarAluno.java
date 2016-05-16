package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Curso;
import to.CursoTO;

public class VisualizarAluno implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pTipo = request.getParameter("tipo");
		String pDataInicio = request.getParameter("dataInicio");
		String pDataTermino = request.getParameter("dataTermino");
		String pHorario = request.getParameter("horario");
		double pValor = Double.parseDouble(request.getParameter("valor"));
		int pNumeroVagas = Integer.parseInt(request.getParameter("numeroVagas"));
		String pTipoLaboratorio = request.getParameter("tipoLaboratorio");
		String pSoftwares = request.getParameter("softwares");
		String pLivros = request.getParameter("livros");
		String pDescricao = request.getParameter("descricao");
	
		int pCodigo = Integer.parseInt(request.getParameter("codigo"));
		
		Curso curso = new Curso(pCodigo, pNome, pTipo, pDataInicio, pDataTermino, pHorario, pValor, pNumeroVagas, pTipoLaboratorio, pSoftwares, pLivros, pDescricao);
		RequestDispatcher view = null;
		HttpSession session = request.getSession();
		
		curso.carregar();
		session.setAttribute("curso", curso.getTO());
		view = request.getRequestDispatcher("VisualizarAlunos.jsp");	
		view.forward(request, response);
	}
	
	public int busca(Curso curso, ArrayList<CursoTO> lista) {
		CursoTO to;
		for (int i = 0; i < lista.size(); i++) {
			to = lista.get(i);
			if (to.getCodigo() == curso.getCodigo()) {
				return i;
			}
		}
		return -1;
	}

}
