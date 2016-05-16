<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cadastrar Aluno</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp" />
	<!-- Container Principal -->
	<div id="main" class="container-fluid">
		<h3 class="page-header">Adicionar Aluno</h3>
		<form action="controller.do" method="post">
			<div class="row">
				<div class="form-group col-md-2">
					<label for="codigo">Codigo</label> <input type="text"
						class="form-control" id="codigo" name="codigo">
				</div>
				<div class="form-group col-md-6">
					<label for="nome">Nome</label> <input type="text"
						class="form-control" id="nome" name="nome">
				</div>
				<div class="form-group col-md-4">
					<label for="Sexo">Sexo</label>
					<div class="radio">
						<label><input type="radio" name="masculino" value="masc">Masculino</label>
						<label><input type="radio" name="feminino" value="fem">Feminino</label>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-6">
					<label for="endereco">Endereço</label> <input type="text"
						class="form-control" id="endereco" value="endereco">
				</div>
				<div class="form-group col-md-2">
					<label for="numero">Número</label> <input type="number"
						class="form-control" id="numero" name="numero">
				</div>
				<div class="form-group col-md-4">
					<label for="complemento">Complemento</label> <input type="text"
						class="form-control" id="complemento" name="complemento">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-4">
					<label for="rg">RG</label> <input type="text" class="form-control"
						id="rg" name="rg">
				</div>
				<div class="form-group col-md-4">
					<label for="cpf">CPF</label> <input type="number"
						class="form-control" id="cpf" name="cpf">
				</div>
				<div class="form-group col-md-4">
					<label for="telefone">Telefone</label> <input type="text"
						class="form-control" id="telefone" name="telefone">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-12">
					<label for="email">Email</label> <input type="text"
						class="form-control" id="email" name="email">
				</div>
			</div>
			<hr />

			<div id="actions" class="row">
				<div class="col-md-12">
					<button type="submit" class="btn btn-primary" name="acao"
						value="Criar">Inserir</button>
					<a href="index.jsp" class="btn btn-default">Cancelar</a>
				</div>
			</div>
		</form>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>

</html>