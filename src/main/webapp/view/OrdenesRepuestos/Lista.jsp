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
		
		    <a class="btn btn-default" href="<%=request.getContextPath()%>" role="button">Volver al home</a>
			
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Id Repuesto</th>
					<th>Id Orden Trabajo</th>
					<th>Cantidad de Repuestos</th>
					
					<tr>
			
			</thead>
			<tbody>
				<c:if test="${!empty listaOrdenRepuesto}">
					<c:forEach items="${listaOrdenRepuesto}" var="orden">
						<tr>
							<td><c:out value="${orden.id}"></c:out></td>
							<td><c:out value="${orden.repuesto.id}"></c:out></td>
							<td><c:out value="${orden.orden.id}"></c:out></td>
							<td><c:out value="${orden.cantRepuestos}"></c:out></td>
							
							
							
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listaOrdenRepuesto}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	
</div>
</body>
</html>