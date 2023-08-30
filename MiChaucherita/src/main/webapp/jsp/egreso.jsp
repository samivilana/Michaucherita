<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mi Chaucherita Web</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/ingreso.css" />

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/styles.css" />
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/img/iconWallet.png"
	type="image/x-icon">

<script src="https://kit.fontawesome.com/ef6a53a4a6.js"
	crossorigin="anonymous"></script>
</head>

<body>
<%@include file='../templates/banner.html' %>

	<div class="form-container">
		<h1 class="text-center">Registro de Egreso</h1>
		<form action="MovimientoController?ruta=registrarGasto" method="POST">
			<div class="form-group">
				<label for="monto">Monto</label>
				<input type="text" class="form-control" id="monto" name="monto" placeholder="Ingrese el monto"	required>
			</div>
			<div class="form-group">
				<label for="cuentas">Cuentas</label> <select class="form-control"
					id="cuentas" name="cuentaOrigen" required>

					<option value="" disabled selected>Elige una cuenta</option>
					<c:forEach items="${cuentas}" var="cuentaOrigen">
						<option value="${cuentaOrigen.id}">${cuentaOrigen.getNombreCuenta()}</option>

					</c:forEach>

				</select>
			</div>
			<div class="form-group">
				<label for="descripcion">Descripción</label> <input type="text"
					class="form-control" id="descripcion"
					placeholder="Ingrese la descripción" name="descripcion" required>
			</div>
			<div class="form-group">
				<label for="categoria">Categoría</label> <select
					class="form-control" id="categoria" name = "categoria" required>


					<option value="" disabled selected>Elige una categoría</option>
					<c:forEach items="${categorias}" var="categoria">
						<option value="${categoria.id}">${categoria.descripcion}</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<label for="fecha">Fecha</label> <input type="date"
					class="form-control" id="fecha" name="fecha" required>
			</div>
			<div class="d-grid gap-2 col-20 mx-auto">
				<button class="btn btn-success" type="submit">Registrar
					Egreso</button>
			</div>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>

</html>