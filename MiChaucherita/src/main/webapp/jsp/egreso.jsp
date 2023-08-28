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
    <header>
        <nav class="navbar navbar-expand-sm navbar-dark bg-success">
            <div class="container">
                <a href="dashboard.jsp" class="navbar-brand mb-0 h1">
                    <img class="d-inline-block align-top" src="../img/iconWallet.png" width="30" height="30"
                        alt="wallet-image">
                    Mi Chaucherita Web
                </a>
                <button type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" class="navbar-toggler"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a href="dashboard.jsp" class="nav-link active">
                                Inicio
                            </a>
                        </li>
                        <li class="nav-item active">
                            <a href="ingreso.jsp" class="nav-link active">
                                Ingreso
                            </a>
                        </li>
                        <li class="nav-item active">
                            <a href="egreso.jsp" class="nav-link active">
                                Egreso
                            </a>
                        </li>
                        <li class="nav-item active">
                            <a href="transferencia.jsp" class="nav-link active">
                                Transferencia
                            </a>
                        </li>
                        <li class="nav-item active">
                            <a href="cuentas.jsp" class="nav-link active">
                                Cuentas
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <div class="form-container">
        <h1 class="text-center">Registro de Egreso</h1>
        <form>
            <div class="form-group">
                <label for="monto">Monto</label>
                <input type="text" class="form-control" id="monto" placeholder="Ingrese el monto" required>
            </div>
            <div class="form-group">
                <label for="cuentas">Cuentas</label>
                <select class="form-control" id="cuentas" required>
                 <option> Pichincha </option>
                    <option> Efectivo </option>
                    <option value="" disabled selected>Elige una cuenta</option>
                </select>
            </div>
            <div class="form-group">
                <label for="descripcion">Descripción</label>
                <input type="text" class="form-control" id="descripcion" placeholder="Ingrese la descripción" required>
            </div>
            <div class="form-group">
                <label for="categoria">Categoría</label>
                <select class="form-control" id="categoria" required>
                    
                    <option> Salud </option>
                    <option> Eduación </option>
                    <option> Transporte </option>
                    <option> Alimentación </option>
                    <option value="" disabled selected>Elige una categoría</option>
                </select>
            </div>
            <div class="form-group">
                <label for="fecha">Fecha</label>
                <input type="date" class="form-control" id="fecha" required>
            </div>
            <div class="d-grid gap-2 col-20 mx-auto">
                <button class="btn btn-success" type="button">Registrar Egreso</button>
            </div>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>

</html>