<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>Lista de UFs</h1>
	<div>${sucesso }</div>
	<table>
		<tr>
			<td>Sigla</td>
			<td>Nome</td>
			<td>Situação</td>
			<td>Código IBGE</td>
		</tr>

		<c:forEach items="${ufs}" var="uf">
			<tr>
				<td>${uf.sigla}</td>
				<td>${uf.nome}</td>
				<td>${uf.situacao}</td>
				<td>${uf.codigoIBGE}</td>
				<td>${uf.dataCriacao}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>