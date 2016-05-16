package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ListarCursos;
import to.CursoTO;

/**
 * Servlet implementation class ListarClientesController
 */
@WebServlet("/listar_curso.do")

public class ListarCursoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String chave = request.getParameter("data[search]");
			ListarCursos curso = new ListarCursos();
			ArrayList<CursoTO> lista;
			if(chave != null && chave.length() > 0){
				lista = curso.listarCursos(chave);
			} else {
				lista = curso.listarCursos();
			}
			request.setAttribute("lista", lista);
		RequestDispatcher dispatcher = request.
				getRequestDispatcher("ListarCurso.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}