<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Lista de Pais</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>

	<c:import url="Menu.jsp" />
	<c:forEach var="paises" items="${paises}">
		<div class="container ">
			<div class="row ">
				<div class="col-sm alert alert-primary" role="alert">
					<label>Id:</label>${paises.nome}
				</div>
				<div class="col-sm alert alert-primary" role="alert">
					<label>Nome:</label>${paises.populacao}
				</div>
			</div>
			<div class="row ">
				<div class="col-sm alert alert-primary" role="alert">
					<label>População:</label>${paises.populacao}
				</div>
				<div class="col-sm alert alert-primary" role="alert">
					<label>Area:</label>${paises.area}
				</div>
			</div>
		</div>
		<hr>
	</c:forEach>




	<div id="actions" class="row">
		<div class="col-md-12">
			<a href="index.jsp" class="btn btn-primary">Voltar</a>
		</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>