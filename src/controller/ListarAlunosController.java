package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListarAlunos;
import to.AlunoTO;


/**
 * Servlet implementation class ListarAlunosController
 */
@WebServlet("/Listar_Alunos.do")
public class ListarAlunosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String chave = request.getParameter("data[search]");
		ListarAlunos listaAlunos = new ListarAlunos();
		ArrayList<AlunoTO> lista;
		if(chave != null && chave.length() > 0){
			lista = listaAlunos.listarAlunos(chave);
		} else {
			lista = listaAlunos.listarAlunos();
		}
		request.setAttribute("lista", lista);
	RequestDispatcher dispatcher = request.
			getRequestDispatcher("ListarAlunos.jsp");
	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}