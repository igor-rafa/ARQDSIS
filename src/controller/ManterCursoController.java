package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Curso;
import to.CursoTO;

@WebServlet("/Manter_Curso.do")

/**
 * Servlet implementation class ManterCursoController
 */

public class ManterCursoController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pAcao = request.getParameter("acao");
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
		
		if (pAcao.equals("Criar")) {
			curso.criar();
			ArrayList<CursoTO> lista = new ArrayList<>();
			lista.add(curso.getTO());
			request.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarCursos.jsp");
		} else if (pAcao.equals("Excluir")) {
			curso.excluir();
			view = request.getRequestDispatcher("ListarCursos.jsp");			
		} else if (pAcao.equals("Alterar")) {
			curso.atualizar();
			request.setAttribute("curso", curso.getTO());
			view = request.getRequestDispatcher("VisualizarCursos.jsp");			
		} else if (pAcao.equals("Visualizar")) {
			curso.carregar();
			request.setAttribute("curso", curso.getTO());
			view = request.getRequestDispatcher("VisualizarCursos.jsp");		
		} else if (pAcao.equals("Editar")) {
			curso.carregar();
			request.setAttribute("curso", curso.getTO());
			view = request.getRequestDispatcher("AlterarCursos.jsp");		
		}
		
		view.forward(request, response);
	}
	
}
