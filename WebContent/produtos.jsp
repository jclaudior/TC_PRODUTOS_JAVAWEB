<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.com.rdtc.model.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<title>Listar Produtos</title>
</head>
<body>
	<h1 class="display-4">Produtos</h1>
	<table class="table">
		<tr>
			<th scope="col">COD. PRODUTO</th>
			<th scope="col">DESCRIÇÃO</th>
			<th scope="col">FORNECEDOR</th>
			<th scope="col">VALOR</th>
		</tr>
		<c:forEach var="produto" items="${produtos}"> 
		<tr>
			<td><c:out value="${produto.getCd_produto()}"></c:out></td>
			<td><c:out value="${produto.getDs_produto()}"></c:out></td>
			<td><c:out value="${produto.getDs_fornecedor()}"></c:out></td>
			<td><c:out value="${produto.getVl_produto()}"></c:out></td>
		</tr>
		</c:forEach>
	</table>
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
</body>
</html>