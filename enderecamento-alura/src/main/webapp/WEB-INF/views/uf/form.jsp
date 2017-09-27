<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<form:form action="${s:mvcUrl('UFC#gravar').build()}" method="post"
		commandName="UF">
		<div>
			<label>Sigla</label> 
			<form:input path="sigla" />
			<form:errors path="sigla" />
		</div>
		<div>
			<label>Nome</label>
			<form:input path="nome" />
			<form:errors path="nome" />
		</div>
		<div>
			<label>Código IBGE</label> 
			<form:input path="codigoIBGE" />
			<form:errors path="codigoIBGE" />
		</div>
		<div>
			<label>Situação</label> 
			<form:input path="situacao" />
			<form:errors path="situacao" />
		</div>
		<div>
			<label>Data de Criação</label> 
			<form:input path="dataCriacao" />
			<form:errors path="dataCriacao" />
		</div>

		<button type="submit">Cadastrar</button>
	</form:form>
</body>
</html>