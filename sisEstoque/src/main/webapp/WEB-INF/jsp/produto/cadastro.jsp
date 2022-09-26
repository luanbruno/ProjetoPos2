<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de produto</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>
		
	  <form action="/produto/incluir" method="post">
	  <div class="form-group">
		  	<label>fabricante:</label>
		  	<select class="form-control" name="fabricante.id">
		    	<c:forEach var="f" items="${fabricante_lis}">
		    	<option value="${f.id}">${f.nome}</option>
		    	</c:forEach>
		  	</select>
		</div>
		<div class="form-group">
		  	<label>Grupo:</label>
		  	<select class="form-control" name="grupo.id">
		    	<c:forEach var="g" items="${grupo_lis}">
		    	<option value="${g.id}">${g.nome}</option>
		    	</c:forEach>
		  	</select>
		</div>
		<div class="form-group">
		  	<label>Unidade:</label>
		  	<select class="form-control" name="unidade.id">
		    	<c:forEach var="u" items="${unidade_lis}">
		    	<option value="${u.id}">${u.medida}</option>
		    	</c:forEach>
		  	</select>
		</div>
	  
	  
	    <div class="mb-3 mt-3">
	      <label>nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o seu nome do produto" name="nome" value="bateria de carro">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Codigo de Barra:</label>
	      <input type="number" class="form-control" placeholder="Entre com o codigo de barra" name="cd_barra" value="4646478648787">
	    </div>
	     <div class="mb-3 mt-3">
	      <label>Aplicacao:</label>
	      <input type="text" class="form-control" placeholder="Entre com a aplicacao" name="aplicacao" value="4 amperes">
	    </div>


	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>