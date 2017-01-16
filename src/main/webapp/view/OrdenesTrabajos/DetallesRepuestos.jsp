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
			<h1>Lista de Ordenes de Repuestos</h1>
		</div>
		<div>
			<a class="btn btn-default" href="Nuevo" role="button">Nueva Orden Repuesto</a>
		    <a class="btn btn-default" href="<%=request.getContextPath()%>" role="button">Volver al home</a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Nombre</th>
					<th>Stock</th>
					<th>Precio</th>
					<th>Cantidad Repuestos</th>
					
					
					
				<tr>
			
			</thead>
			<tbody>
				<c:if test="${!empty listaRepuesto}">
					<c:forEach items="${listaRepuesto}" var="ordenNueva">
						<tr>
							<td><c:out value="${ordenNueva.id}"></c:out></td>
							<td><c:out value="${ordenNueva.repuesto.nombre}"></c:out></td>
							<td><c:out value="${ordenNueva.repuesto.stock}"></c:out></td>
							<td><c:out value="${ordenNueva.repuesto.precio}"></c:out></td>
							<td><c:out value="${ordenNueva.cantRepuestos}"></c:out></td>
						
						</tr>
					</c:forEach>
				</c:if>
				
				<c:if test="${empty listaRepuesto}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>
			</tbody>
			
		</table>
		
	
</div>
</body>
</html>