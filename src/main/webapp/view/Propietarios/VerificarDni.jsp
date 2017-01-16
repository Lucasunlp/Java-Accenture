<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"/>

<style type="text/css">
body{
	margin-top: 70px;
	}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

	<br>
	<br>
	<h1>Ingrese el número de documento del propietario</h1>
	<table border="1">
		<!-- En modelAttribute, recibo el tipo de dato que le envio desde el controller de la vista (get)  -->
		<form:form action="VerificarDni" method="post" modelAttribute="propietario">
			<form:label path="dni">Ingrese el dni : </form:label>
			<form:input path="dni" />
			<br>



			<input type="submit" value="Verificar" />
		</form:form>
	</table>
	<br>
	<br>
	<a class="btn btn-default" href="<%=request.getContextPath()%>"
		role="button">Volver al home</a>
</body>
</html>