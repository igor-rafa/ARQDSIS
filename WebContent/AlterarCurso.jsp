<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Alterar Curso</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>
	<!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp" />
	<!-- Container Principal -->
	<div id="main" class="container">
		<h3 class="page-header">Alterar Curso #${curso.codigo } %></h3>
		<!-- Formulario para alteração de cursos -->
		<form action="controller.do" method="post">
           <!-- area de campos do form -->
           <input type="hidden" name="codigo" value="${curso.codigo }" />
			<div class="row">
				<div class="form-group col-md-6">
					<label for="nome">Nome</label> <input type="text"
						class="form-control" id="nome" name="nome" value="${curso.nome }">
				</div>
				<div class="form-group col-md-4">
					<label for="tipo">Tipo</label> <input type="text"
						class="form-control" id="tipo" name="tipo" value="${curso.tipo }">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-4">
					<label for="dataDeInicio">Data/Inicio</label> <input type="Date"
						class="form-control" id="dataDeInicio" name="dataDeInicio" value="${curso.dataDeInicio }">
				</div>
				<div class="form-group col-md-4">
					<label for="dataDeTermino">Data/Fim</label> <input type="Date"
						class="form-control" id="dataDeTermino" name="dataDeTermino" value="${curso.dataDeTermino }">
				</div>
				<div class="form-group col-md-4">
					<label for="horario">Horário</label> <input type="time"
						class="form-control" id="horario" name="horario" value="${curso.horario }">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-4">
					<label for="valor">Valor</label> <input type="number"
						class="form-control" id="valor" name="valor" value="${curso.valor }">
				</div>
				<div class="form-group col-md-4">
					<label for="numero">Número de vagas</label> <input type="number"
						class="form-control" id="numeroDeVagas" name="numeroDeVagas" value="${curso.numeroDeVagas }">
				</div>
				<div class="form-group col-md-4">
					<label for="tipoLab">Tipos de Laboratorios</label> <input type="text"
						class="form-control" id="tipoLab" name="tipoLab" value="${curso.tipoLab }">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-6">
					<label for="softwares">Softwares</label> <input type="text"
						class="form-control" id="softwares" value="${curso.softwares }">
				</div>
				<div class="form-group col-md-6">
					<label for="livros">Livros</label> <input type="text"
						class="form-control" id="livros" value="${curso.livros }">
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label for="descricaoMaterial">Descrição do Material</label> <input type="text"
						class="form-control" id="descricaoMaterial" value="${curso.descricaoMaterial }">
				</div>
			</div>
			<hr />
			
			<div id="actions" class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary" name="acao"
						value="Alterar">Salvar</button>
					<a href="ListarCursos.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>