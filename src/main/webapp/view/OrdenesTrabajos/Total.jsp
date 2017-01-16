<%@page	import="sun.reflect.ReflectionFactory.GetReflectionFactoryAction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cantidad total lista repuesto</title>
<style type="text/css">
body {
	margin-top: 70px;
}
</style>
</head>


<body>


<h1>Taller Mecánico - Factura </h1>


<a class="btn btn-default" href="<%=request.getContextPath()%>/OrdenesTrabajos/Detalles/${id}" role="button">Volver al detalle de orden  trabajo</a>

<table class="table table-striped" >
			<thead>
				<tr>
					
					<th>Cantidad de Horas Trabajadas</th>
					<th>Precio de la hora</th>
					<th>Precio total de repuestos comprados</th>
					<th>Precio Final</th>
					
				</tr>
			</thead>
				
			<td><c:out value="${canthoras}"></c:out></td>
			<td><c:out value="${150}"></c:out></td>
			<td><c:out value="${preciorepuesto}"></c:out></td>
			<td><c:out value="${preciofinal}"></c:out></td>
			
			
			
</table>


</body>
</html>