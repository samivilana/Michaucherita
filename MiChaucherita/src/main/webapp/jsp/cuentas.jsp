<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/ingreso.css">
<link rel="shortcut icon" href="../img/iconWallet.png"
	type="image/x-icon">
	

<title>Mi Chaucherita Web</title>
</head>
<body>

	<%@include file='../templates/banner.html'%>

	<div class="container mt-5">
		<h2>BUSCAR POR</h2>
		<form action="MovimientoController?ruta=mostrarMovimientosbyFecha" method="POST">
			<div class="container mt-5">
				<div class="form-group">
					<label for="opciones">Selecciona una opción:</label> <select
						class="form-control" id="opciones" onchange="mostrarCombo()">
						<option value="default">Selecciona una opción</option>
						<option value="opcion1">Fecha</option>
						<option value="opcion2">Tipo Movimiento</option>
					</select>
				</div>

				<!-- Combo box oculto por defecto -->
				<div class="form-group" id="comboFecha" style="display: none;">
					<label for="fecha">Selecciona una fecha:</label> <input type="date"
						class="form-control" id="fecha" name="fecha">
				</div>

				<!-- Combo box oculto por defecto -->
				<div class="form-group" id="comboOtro" name="tipoMov" style="display: none;">
					<label for="otro">Selecciona el tipo de movimiento:</label> <select
						class="form-control" id="otro">
						<option value="INGRESO">INGRESO</option>
						<option value="EGRESO">EGRESO</option>
						<option value="TRANSFERENCIA">TRANSFERENCIA</option>
					</select>
				</div>
			</div>
			<button class="btn btn-outline-success" type="submit">Filtrar</button>
		</form>
		<div class="row justify-content-center mt-5">
			<table class="table table-bordered-sm table-rounded-lg shadow">
				<thead>
					<tr class="table-success">
						<th colspan="5" class="text-center">Movimientos</th>
					</tr>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Fecha</th>
						<th scope="col">Descripción</th>
						<th scope="col">Tipo</th>
						<th scope="col">Monto</th>
					</tr>

				</thead>

				<tbody class="table-group-divider">
					<c:forEach items="${movimientos}" var="movimiento">
						<tr>
							<th scope="row">${movimiento.id}</th>
							<td>${movimiento.fecha}</td>
							<td>${movimiento.descripcion}</td>
							<td>${movimiento.tipo}</td>
							<td>${movimiento.monto}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="row justify-content-center mt-5">
			<table class="table table-bordered table-rounded-lg shadow">
				<thead>
					<tr class="table-success">
						<th colspan="4" class="text-center">Cuentas</th>
					</tr>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Cuenta</th>
						<th scope="col">Saldo</th>
					</tr>
				</thead>
				<tbody class="table-group-divider">
					<c:forEach items="${cuentas}" var="cuenta">
						<tr>
							<th scope="row">${cuenta.id}</th>
							<td>${cuenta.nombreCuenta}</td>
							<td>${cuenta.saldototal}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<script
		>
		function mostrarCombo() {
	        var opciones = document.getElementById("opciones");
	        var comboFecha = document.getElementById("comboFecha");
	        var comboOtro = document.getElementById("comboOtro");
	
	        if (opciones.value === "opcion1") {
	            comboFecha.style.display = "block"; // Mostrar combo de fecha
	            comboOtro.style.display = "none";   // Ocultar otro combo
	        } else if (opciones.value === "opcion2") {
	            comboFecha.style.display = "none";   // Ocultar combo de fecha
	            comboOtro.style.display = "block";  // Mostrar otro combo
	        } else {
	            comboFecha.style.display = "none";   // Ocultar ambos combos si no se selecciona ninguna opción
	            comboOtro.style.display = "none";
	        }
	    }
    </script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>