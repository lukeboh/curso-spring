<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<form action="/enderecamento-alura/uf" method="post">
		<div>
			<label>Sigla</label> <input type="text" name="sigla" />
		</div>
		<div>
			<label>Nome</label>
			<input type="text" name="nome" />
		</div>
		<div>
			<label>Código IBGE</label> <input type="text" name="codigoIBGE" />
		</div>
		<div>
			<label>Situação</label> <input type="text" name="situacao" />
		</div>
		
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>