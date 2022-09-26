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
	  <h2>Cadastramento de produtos</h2>

	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>

	  <form action="/produto" method="get">
	    <button type="submit" class="btn btn-primary">Novo</button>
	  </form>
	  
	  <hr>
	<c:if test="${not empty lista}">		
		  <h2>Total de produtos: ${lista.size()}</h2>
		<table class="table table-striped">
		    <thead>
		      <tr>
		        <th>ID</th>
		        <th>nome</th>
		        <th>aplicacao</th>
				<th>Barra</th>
		        <th>Fabricante</th>
		        <th>Grupo</th>
		        <th>unidade</th>
		        <th>Local(is)</th>
		        <th>referencia(s)</th>
		        <th>status</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="p" items="${lista}">
			      <tr>
			        <td>${p.id}</td>
			        <td>${p.nome}</td>
			        <td>${p.aplicacao}</td>
					<td>${p.cd_barra}</td>					
			        <td>${p.fabricante.nome}</td>
			        <td>${p.grupo.nome}</td>
			        <td>${p.unidade.medida}</td>
			        <td>
			        <form action="/locais" method="get">
			        	<input type="hidden" name="idproduto" value="${p.id}">
						 <button type="submit" class="btn btn-primary">ADD (${p.locais.size()})</button>
					  </form></td>
					  <td>
					  <form action="/referencias" method="get">
			        	<input type="hidden" name="idproduto" value="${p.id}">
						 <button type="submit" class="btn btn-primary">ADD (${p.referencias.size()})</button>
					  </form></td>
			      	<td>${p.status}</td>
		        	<td><a href="/produto/${p.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem produto cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>