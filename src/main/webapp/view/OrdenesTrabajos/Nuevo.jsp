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

<style type="text/css">
body {
	margin-top: 70px;
	text-align: center;
</style>

</head>
<h1>Ingrese los datos de la Orden Trabajo</h1>
<body>
	
		
		<a class="btn btn-default" href="<%=request.getContextPath()%>"
		role="button">Volver al home</a>
	<br>
	<br>
	<table border="1">
		<form:form action="/OrdenesTrabajos/Nuevo" method="post" modelAttribute="nuevaOrden">
			<form:label path="patente">Patente: </form:label>
			<form:input path="patente" />
			<br>

			<form:label path="marca">Marca: </form:label>
			<form:input path="marca" />
			<br>
			
			<form:label path="modelo">Modelo: </form:label>
			<form:input path="modelo" />
			
			<br>					
			<form:label path="fecha">Fecha: </form:label>
			<form:input path="fecha" />
			<br>
			

			<form:label path="detalle_falla">Detalla de la falla: </form:label>
			<form:input path="detalle_falla"/>
			<br>

			<form:label path="estado">Estado: </form:label>
			<form:input path="" placeholder="Inactivo"/>
			<br>
			
			<form:label path="prop.dni">Dni Propietario: </form:label>
			<form:input path="prop.dni" />
			<br>
									
			
			
			
			<form:select path="e.id">
				<form:option value="0">Seleccione Empleado</form:option>
				<c:forEach items="${listaEmpleados}" var="emp">
					<form:option value="${emp.id}">
						<c:out value="${emp.nombre}"></c:out>
					</form:option>
				</c:forEach>
			</form:select>
			
			
			<br><br>
			<input type="submit" value="Guardar" />
		</form:form>
	</table>
	<br>
	<br>


</body>
</html>