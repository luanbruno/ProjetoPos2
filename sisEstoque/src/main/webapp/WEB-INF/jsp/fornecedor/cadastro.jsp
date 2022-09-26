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
	  <h2>Cadastramento de fornecedor</h2>
	  
	  <c:if test="${not empty mensagem}">
		<div class="alert alert-success">
		  <strong>Confirmação!</strong> ${mensagem}
		</div>	  
	  </c:if>
		
	  <form action="/fornecedor/incluir" method="post">
	  <div class="form-group"> </div>
	  
	    <div class="mb-3 mt-3">
	      <label>Fabricante:</label>
	      <input type="text" class="form-control" placeholder="Nome do fornecedor" name="nome" value="jaimeoleo">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Sigla:</label>
	      <input type="text" class="form-control" placeholder="email do fornecedor" name="email" value="forne@forne">
	    </div>
	    <div class="mb-3 mt-3">
	      <label>Sigla:</label>
	      <input type="text" class="form-control" placeholder="cnpj" name="cnpj" value="11.111.111/0001-11">
	    </div>
	    <div class="mb-3 mt-3">
	      <label>Sigla:</label>
	      <input type="text" class="form-control" placeholder="inscricao estadual" name="ins_estadual" value="2656594554">
	    </div>


	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>