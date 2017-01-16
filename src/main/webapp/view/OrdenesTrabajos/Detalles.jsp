<%@page
	import="sun.reflect.ReflectionFactory.GetReflectionFactoryAction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista detalle de Orden Trabajo</title>
<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />

<style type="text/css">
body {
	margin-top: 70px;
}
</style>
</head>
<body>

	<div class="container">
		<div class="page-header">
			<h1>Lista de Detalles</h1>
		</div>
		    <a class="btn btn-default" href="<%=request.getContextPath()%>" role="button">Volver al home</a>
				<c:if test="${ordenTrabajo.estado ge true}">
				   <a class="btn btn-default" href="<%=request.getContextPath()%>/OrdenesTrabajos/Total/${ordenTrabajo.id}" role="button">Ver Factura con Precio Final</a>		
				</c:if>
			
			
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id Orden Trabajo</th>
					<th>Detalle de la falla</th>
					<th>Cantidad Horas</th>
					<th>Estado</th>
					<th>SubTotal</th>
				<tr>
			</thead>
			<tbody>

		
				<td><c:out value="${ordenTrabajo.id}"></c:out></td>
				<td><c:out value="${ordenTrabajo.detalle_falla}"></c:out></td>
				<td><c:out value="${ordenTrabajo.cantHoras}"></c:out></td>
				<c:if test="${orden.estado}">
								<td><c:out value="Finalizado"></c:out>
							</c:if>
							<c:if test="${!orden.estado}">
								<td><c:out value="Activo"></c:out>
							</c:if>	
				<c:if test="${ordenTrabajo.estado ge true}">
 					<td><c:out value="${ordenTrabajo.cantHoras*150}"></c:out></td>
				</c:if>
				<td><a href="<%=request.getContextPath()%>/OrdenesTrabajos/Det/${ordenTrabajo.id}">Ver lista Repuestos</a></td>

				</tr>


				<c:if test="${empty ordenTrabajo}">
					<tr>
						<td colspan="5">No hay datos disponibles por el momento</td>
					</tr>
				</c:if>
			</tbody>


		</table>

	</div>
</body>
</html>