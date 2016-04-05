<%@page import="to.CursoTO"%>
<%@ page language="java" contentType="text/html; charset=UFT-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, to.AlunoTO"%>
<!DOCTYPE html">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">
	<title>Lista todos alunos</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
	<div class="container">
		<table>
			<thead><tr><th>Código</th><th>Nome</th><th>Data de nascimento</th><th>Sexo</th><th>Endereço</th><th>Número</th><th>Complemento</th><th>RG</th><th>CPF</th><th>Email</th><th>Telefone</th></tr></thead>
		
			<tbody>
			<%
				ArrayList<AlunoTO> lista = (ArrayList<AlunoTO>)request.getAttribute("lista");
				for(AlunoTO to:lista){
			%>
				<tr><td><%=to.getCodigo()%></td><td><%=to.getNome()%></td><td><%=to.getDataNascimento()%></td><td><%=to.getSexo()%></td><td><%=to.getEndereco()%></td><td><%=to.getNumero()%></td><td><%=to.getComplemento()%></td><td><%=to.getRG()%></td><td><%=to.getCPF()%></td><td><%=to.getEmail()%></td><td><%=to.getTelefone()%></td></tr>
			
			<%
				}
			%>
			</tbody>	
		</table>

	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>