package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Curso;

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
		if(pAcao.equals("Inserir")){
			curso.criar();
		} else if (pAcao.equals("Atualizar")){
			curso.atualizar();
		} else if (pAcao.equals("Excluir")){
			curso.excluir();
		}
		curso.carregar();
		
		CursoTo to = new CursoTO();
		to.setCodigo(curso.getCodigo());
		to.setNome(curso.getNome());
		to.setTipo(curso.getTipo());
		to.setDataDeInicio(curso.getDataDeInicio());
		to.setDataDeTermino(curso.getDataDeTermino());
		to.setHorario(curso.getHorario());
		to.setNumeroDeVagas(curso.getNumeroDeVagas());
		to.setValor(curso.getValor());
		to.setTipoLab(curso.getTipoLab());
		to.setSoftwares(curso.getSoftwares());
		to.setLivros(curso.getLivros());
		to.setDescricao(curso.getDescricao());
		
		request.setAttribute("curso", to);
		
		RequestDispatcher view = request.getRequestDispatcher("Curso.jsp");
		view.forward(request, response);
	}
	
}
