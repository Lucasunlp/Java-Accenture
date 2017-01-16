<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title></title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/archivo1.css" />

</head>
<h1>Ingrese los datos del propietario</h1>
<body>
	
	<br>
	<br>
	<table border="1">
		<form:form action="Nuevo" method="post" modelAttribute="propietario">
			<form:label path="nombre">Nombre: </form:label>
			<form:input path="nombre" />
			<br>

			<form:label path="apellido">Apellido: </form:label>
			<form:input path="apellido" />
			<br>
			
			<form:label path="dni">Documento de Identidad: </form:label>
			<form:input path="dni" />
			<br>
			

			<form:label path="direccion">Direccion: </form:label>
			<form:input path="direccion" />
			<br>

			<form:label path="telefono">Telefono: </form:label>
			<form:input path="telefono" />
			<br>

			<br><br>
			<input type="submit" value="Guardar" />
			<br><br>
		</form:form>
	</table>
	<br>
	<br>
	<a class="btn btn-default" href="<%=request.getContextPath()%>"
		role="button">Volver al home</a>

</body>
</html>