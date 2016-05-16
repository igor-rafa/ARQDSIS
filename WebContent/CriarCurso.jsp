<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="pt-br" xml:lang="pt-br">
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <meta http-equiv="X-UA-Compatible" content="IE=edge">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>Cadastrar Curso</title>

 <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body> 
	<!-- Barra superior com os menus de navegação -->
	<c:import url="Menu.jsp" />
	<!-- Container Principal -->
  	<div id="main" class="container-fluid">
    <h3 class="page-header">Adicionar Curso</h3>
    <form action="controller.do" method="post">
      <div class="row">
        <div class="form-group col-md-2">
          <label for="codigo">Codigo</label>
          <input type="text" class="form-control" id="codigo">
        </div>
        <div class="form-group col-md-6">
          <label for="nome">Nome</label>
          <input type="text" class="form-control" id="nome">
        </div>
        <div class="form-group col-md-4">
         <label for="Tipo">Tipo</label>
         <input type="text" class="form-control" id="tipo">
       </div>
     </div>

     <div class="row">
      <div class="form-group col-md-4">
        <label for="data/inicio">Data/Inicio</label>
        <input type="Date" class="form-control" id="dataInicio">
      </div>
      <div class="form-group col-md-4">
        <label for="Data/Fim">Data/Fim</label>
        <input type="Date" class="form-control" id="dataTermino">
      </div>
      <div class="form-group col-md-4">
       <label for="campo3">Horário</label>
       <input type="time" class="form-control" id="horario">
     </div>
   </div>

   <div class="row">
    <div class="form-group col-md-4">
      <label for="Valor">Valor</label>
      <input type="number" class="form-control" id="valor">
    </div>
    <div class="form-group col-md-4">
      <label for="numero">Número de vagas</label>
      <input type="number" class="form-control" id="numeroVagas">
    </div>
    <div class="form-group col-md-4">
     <label for="Tipos">Tipos de Laboratorios</label>
     <input type="text" class="form-control" id="tipoLaboratorio">
   </div>
 </div>

 <div class="row">
  <div class="form-group col-md-6">
    <label for="Softwares">Softwares</label>
    <input type="text" class="form-control" id="softwares">
  </div>
  <div class="form-group col-md-6">
    <label for="Livros">Livros</label>
    <input type="text" class="form-control" id="livros">
  </div>
</div>
<div class="row">
  <div class="form-group col-md-12">
    <label for="Softwares">Descrição</label>
    <input type="text" class="form-control" id="softwares">
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