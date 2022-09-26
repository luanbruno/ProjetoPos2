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
	  <h2>Cadastramento de candidatos</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>
		
	  <form action="/local/incluir" method="post">
	  
	    <div class="mb-3 mt-3">
	    <input type="hidden" name="produto.id" value="${produto.id}">
	      <label>local:</label>
	      <input type="text" class="form-control" placeholder="local" name="posicao" value="c10a15">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>andar:</label>
	      <input type="text" class="form-control" placeholder="andar" name="andar" value="terrio">
	    </div>


	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>