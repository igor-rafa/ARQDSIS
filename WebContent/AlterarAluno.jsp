<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html lang="pt-br">

        <head>
            <meta charset="utf-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Alterar Aluno</title>

            <link href="css/bootstrap.min.css" rel="stylesheet">
            <link href="css/style.css" rel="stylesheet">
        </head>

<body>
	<!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp" />
	<!-- Container Principal -->
	<div id="main" class="container-fluid">
		<h3 class="page-header">Adicionar Aluno #${aluno.codigo } %></h3>
        <!-- Formulario para alteração de alunos -->
		<form action="controller.do" method="post">
           <!-- area de campos do form -->
           <input type="hidden" name="codigo" value="${aluno.codigo }" />
			<div class="row">
				<div class="form-group col-md-8">
					<label for="nome">Nome</label> <input type="text"
						class="form-control" id="nome" name="nome" value="${aluno.nome }">
				</div>
				<div class="form-group col-md-4">
					<label for="nome">Data de Nascimento</label> <input type="text"
						class="form-control" id="dataNascimento" name="dataNascimento" value="${aluno.dataNascimento }">
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
						class="form-control" id="endereco" value="${aluno.endereco}">
				</div>
				<div class="form-group col-md-2">
					<label for="numero">Número</label> <input type="number"
						class="form-control" id="numero" name="numero" value="${aluno.numero}">
				</div>
				<div class="form-group col-md-4">
					<label for="complemento">Complemento</label> <input type="text"
						class="form-control" id="complemento" name="complemento" value="${aluno.complemento}">
				</div>
			</div>

			<div class="row">
				<div class="form-group col-md-8">
					<label for="rg">RG</label> <input type="text" class="form-control"
						id="rg" name="rg" value="${aluno.rg}">
				</div>
				
				<div class="form-group col-md-4">
					<label for="cpf">CPF</label> <input type="number"
						class="form-control" id="cpf" name="cpf" value="${aluno.cpf}">
				</div>
				
				<div class="row">
				<div class="form-group col-md-12">
					<label for="email">Email</label> <input type="text"
						class="form-control" id="email" name="email" value="${aluno.email}">
				</div>
				
				</div>
				<div class="form-group col-md-4">
					<label for="telefone">Telefone</label> <input type="text"
						class="form-control" id="telefone" name="telefone" value="${aluno.telefone}">
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