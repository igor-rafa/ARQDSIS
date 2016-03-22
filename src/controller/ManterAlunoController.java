package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;

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
		if(pAcao.equals("Inserir")){
			aluno.criar();
		} else if (pAcao.equals("Atualizar")){
			aluno.atualizar();
		} else if (pAcao.equals("Excluir")){
			aluno.excluir();
		}
		aluno.carregar();
		
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Aluno Cadastrado!");
		out.println("</title></head><body>");
		out.println("Código: "+ aluno.getCodigo()+"<br>");
		out.println("Nome: "+ aluno.getNome()+"<br>");
		out.println("Data de Nascimento: "+ aluno.getDataNascimento()+"<br>");
		out.println("Sexo: "+ aluno.getSexo()+"<br>");
		out.println("Endereço: "+ aluno.getEndereco()+"<br>");
		out.println("Número: "+ aluno.getNumero()+"<br>");
		out.println("Complemento: "+ aluno.getComplemento()+"<br>");
		out.println("RG: "+ aluno.getRG()+"<br>");
		out.println("CPF: "+ aluno.getCPF()+"<br>");
		out.println("Email: "+ aluno.getEmail()+"<br>");
		out.println("Telefone: "+ aluno.getTelefone()+"<br>");
		out.println("</body></html>");
	}

}	

