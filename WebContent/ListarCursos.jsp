<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, to.CursoTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista todos cursos</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
	<table>
	<thead><tr><th>id</th><th>nome</th><th>fone</th></tr></thead>
	<tbody>
	<%
		ArrayList<CursoTO> lista = (ArrayList<CursoTO>)request.getAttribute("lista");
		for(CursoTO to:lista){
	%>
		<tr><td><%=to.getCodigo()%></td><td><%=to.getNome()%></td><td><%=to.getTipo()%></td><td><%=to.getTipo()%></td><td><%=to.getDataDeInicio()%></td><td><%=to.getDataDeTermino()%></td><td><%=to.getHorario()%></td><td><%=to.getValor()%></td><td><%=to.getNumeroDeVagas()%></td><td><%=to.getTipoLab()%></td><td><%=to.getSoftwares()%></td><td><%=to.getLivros()%></td><td><%=to.getDescricao()%></td></tr>
	
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