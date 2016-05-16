package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import to.AlunoTO;

@WebServlet("/Manter_Aluno.do")

public class ManterAlunoController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pAcao = request.getParameter("acao");
		String pNome = request.getParameter("nome");
		String pSexo = request.getParameter("sexo");
		String pDataNascimento = request.getParameter("dataNascimento");
		String pEndereco = request.getParameter("endereco");
		int pNumero = Integer.parseInt(request.getParameter("numero"));
		String pComplemento = request.getParameter("complemento");
		String pRg = request.getParameter("rg");
		String pCpf = request.getParameter("cpf");
		String pTelefone = request.getParameter("telefone");
		String pEmail = request.getParameter("email");
		
		int pCodigo = Integer.parseInt(request.getParameter("codigo"));
		
		Aluno aluno = new Aluno(pCodigo, pNome, pSexo, pDataNascimento, pEndereco, pNumero, pComplemento, pRg, pCpf, pTelefone, pEmail);
		RequestDispatcher view = null;
		
		if (pAcao.equals("Criar")) {
			aluno.criar();
			ArrayList<AlunoTO> lista = new ArrayList<>();
			lista.add(aluno.getTO());
			request.setAttribute("lista", lista);
			view = request.getRequestDispatcher("ListarAlunos.jsp");
		} else if (pAcao.equals("Excluir")) {
			aluno.excluir();
			view = request.getRequestDispatcher("ListarAlunos.jsp");			
		} else if (pAcao.equals("Alterar")) {
			aluno.atualizar();
			request.setAttribute("aluno", aluno.getTO());
			view = request.getRequestDispatcher("VisualizarAlunos.jsp");			
		} else if (pAcao.equals("Visualizar")) {
			aluno.carregar();
			request.setAttribute("aluno", aluno.getTO());
			view = request.getRequestDispatcher("VisualizarAlunos.jsp");		
		} else if (pAcao.equals("Editar")) {
			aluno.carregar();
			request.setAttribute("aluno", aluno.getTO());
			view = request.getRequestDispatcher("AlterarAlunos.jsp");		
		}
		
		view.forward(request, response);
	}

}	

