<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ingrese los datos a modificar</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />

<style type="text/css">
body {
	margin-top: 70px;
	text-align: center;
</style>

</head>
<body>
		<a class="btn btn-default" href="<%=request.getContextPath()%>"
		role="button">Volver al home</a>
	
	
	<br>
	<br>
	<table border="1">

		<form:form action="../AgregarRepuesto" method="post"
			modelAttribute="ordenNueva">

			<br><br>
			<form:label path="orden.id">ID ORDEN: </form:label>
			<form:input path="orden.id" />
			
			<br><br>
			<form:label path="orden.cantHoras">Ingrese la nueva cantidad de horas: </form:label>
			<form:input path="orden.cantHoras" />
			
			<br><br>
			<form:select path="repuesto.id">
				<form:option value="0">Seleccione Repuesto</form:option>
				<c:forEach items="${listaRepuestos}" var="repuesto">
					<form:option value="${repuesto.id}">
						<c:out value="${repuesto.nombre}"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
			
			<br><br>
			<form:label path="cantRepuestos">Ingrese la cantidad de repuestos: </form:label>
			<form:input path="cantRepuestos" />
			
			<br><br>
			<input type="submit" value="Guardar"/>
		</form:form>
	</table>

	<br>
	<br>

</body>










</body>
</html>