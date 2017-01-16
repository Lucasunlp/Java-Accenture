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
			<h1>Lista de Ordenes de Trabajo</h1>
		</div>
		<div>
			<a class="btn btn-default" href="../Propietarios/VerificarDni" role="button">Nueva Orden Trabajo</a>
		    <a class="btn btn-default" href="<%=request.getContextPath()%>" role="button">Volver al home</a>
			<a class="btn btn-default" href="<%=request.getContextPath()%>/OrdenesTrabajos/ListarEstado" role="button">Listar por Estado</a>
		</div>
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Patente</th>
					<th>Marca</th>
					<th>Modelo</th>
					<th>Estado</th>
					<th>Fecha</th>
					<tr>
			
			</thead>
			<tbody>
				<c:if test="${!empty listaOrdenesTrabajos}">
					<c:forEach items="${listaOrdenesTrabajos}" var="orden">
						<tr>
							<td><c:out value="${orden.id}"></c:out></td>
							<td><c:out value="${orden.patente}"></c:out></td>
							<td><c:out value="${orden.marca}"></c:out></td>
							<td><c:out value="${orden.modelo}"></c:out></td>
							<c:if test="${orden.estado}">
								<td><c:out value="Finalizado"></c:out>
							</c:if>
							<c:if test="${!orden.estado}">
								<td><c:out value="Activo"></c:out>
							</c:if>							
							<td><c:out value="${orden.fecha}"></c:out></td>
							
						
							<td><a href="Modificar/${orden.id}">Modificar</a></td>
							<td><a href="Detalles/${orden.id}">Detalles</a></td>							
							<td><a href="Finalizar/${orden.id}">Finalizar</a></td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty listaOrdenesTrabajos}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	
</div>
</body>
</html>