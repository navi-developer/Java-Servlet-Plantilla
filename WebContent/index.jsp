<%@page import="com.ferreteria.entity.Cliente"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Documento plantilla</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">proyecto servlet-war
				eclipse-2020</a>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<a href="ServletCliente?operacion=listar" class="btn btn-info">listar</a>
		<table class="table table-bordered">
			<%
				List<Cliente> lista = (List<Cliente>) request.getAttribute("clientes");
			%>
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">nombre</th>
					<th scope="col">dni</th>
					<th scope="col">direccion</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.clientes}" var="fila">
					<tr>
						<td>${fila.cod}</td>
						<td>${fila.nom}</td>
						<td>${fila.dni}</td>
						<td>${fila.dir}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>