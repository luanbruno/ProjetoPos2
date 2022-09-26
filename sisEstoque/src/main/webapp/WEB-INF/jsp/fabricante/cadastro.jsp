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
	  <h2>Cadastramento de unidades</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>
		
	  <form action="/fabricante/incluir" method="post">
	  <div class="form-group"> </div>
	  
	    <div class="mb-3 mt-3">
	      <label>Fabricante:</label>
	      <input type="text" class="form-control" placeholder="Nome do fabricante" name="nome" value="gonnel">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Sigla:</label>
	      <input type="text" class="form-control" placeholder="Sigla do fabricante" name="sigla" value="GL">
	    </div>


	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>