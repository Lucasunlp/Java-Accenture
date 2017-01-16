<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import de JSTL para utilizar los tags de Java  -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
}
</style>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Lista de Propietarios</h1>
		</div>
		<div>
		    <a class="btn btn-default" href="<%=request.getContextPath() %>" role="button">Volver al home</a>
			
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Direccion</th>
					<th>Telefono</th>
					<th>Dni</th>
					<tr>
			
			</thead>
			<tbody>
				<c:if test="${!empty listaPropietarios}">
					<c:forEach items="${listaPropietarios}" var="propietario">
						<tr>
							
							<td><c:out value="${propietario.nombre}"></c:out></td>
							<td><c:out value="${propietario.apellido}"></c:out></td>
							<td><c:out value="${propietario.direccion}"></c:out></td>
							<td><c:out value="${propietario.telefono}"></c:out></td>
							<td><c:out value="${propietario.dni}"></c:out></td>
							
							
						
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listaPropietarios}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	
</div>
</body>
</html>