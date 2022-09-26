<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Referencias</h2>

	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/referencia" method="get">
	  	<input type="hidden" name="idproduto" value="${produto.id}">
	    <button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	  
	  <hr>
	<c:if test="${not empty lista}">		
	<h4>Produto - ${produto.id} - Nome: ${produto.nome}</h4>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>nome</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="u" items="${lista}">
			      <tr>
			        <td>${u.id}</td>
			        <td>${u.nome}</td>
		        	<td><a href="/referencia/${u.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem referencias cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>