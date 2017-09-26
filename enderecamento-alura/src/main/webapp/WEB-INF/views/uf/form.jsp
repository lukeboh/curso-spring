<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<form:form action= "${s:mvcUrl('UFC#gravar').build()}" method="post" commandName="UF">
		<div>
			<label>Sigla</label>
			<input type="text" name="sigla" />
			<form:errors path="sigla" />
		</div>
		<div>
			<label>Nome</label>
			<input type="text" name="nome" />
			<form:errors path="nome" />
		</div>
		<div>
			<label>Código IBGE</label>
			<input type="text" name="codigoIBGE" />
			<form:errors path="codigoIBGE" />
		</div>
		<div>
			<label>Situação</label>
			<input type="text" name="situacao" />
			<form:errors path="situacao" />
		</div>

		<button type="submit">Cadastrar</button>
	</form:form>
</body>
</html>