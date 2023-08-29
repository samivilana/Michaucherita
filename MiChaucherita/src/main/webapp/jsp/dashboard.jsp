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
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/img/iconWallet.png" type="image/x-icon">

<script src="https://kit.fontawesome.com/ef6a53a4a6.js"
	crossorigin="anonymous"></script>
</head>
<body>

    <nav class="navbar navbar-expand-sm navbar-dark bg-success">
        <div class="container">
            <a href="dashboard.jsp" class="navbar-brand mb-0 h1">
                <img class="d-inline-block align-top" src="${pageContext.request.contextPath}/img/iconWallet.png" width="30" height="30"
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
    <div class="album py-5 bg-body-tertiary">
        <div class="container">

            <div class="row row-cols-1 row-cols-sm-2 row-cols-md-4 g-4">
                <div class="col">
                    <div class="card shadow-sm border rounded-4 p-3 bg-white">
                        <img src="${pageContext.request.contextPath}/img/ingresos.png" class="card-body" alt="img-cuentas">
                        <div class="card-body">
                            <div class="overlay">
                                <a href="../MovimientoController?ruta=ingreso" style="text-decoration:none;"><p>Ingreso</p></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card shadow-sm border rounded-4 p-3 bg-white">
                        <img src="${pageContext.request.contextPath}/img/egresos.png" class="card-body" alt="img-cuentas">
                        <div class="card-body">
                            <div class="overlay">
                                <a href="egreso.jsp" style="text-decoration:none;"><p>Egreso</p></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card shadow-sm border rounded-4 p-3 bg-white">
                        <img src="${pageContext.request.contextPath}/img/transferencias.png" class="card-body" alt="img-cuentas">
                        <div class="card-body">
                            <div class="overlay">
                                <a href="transferencia.jsp" style="text-decoration:none;"><p>Transferencia</p></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card shadow-sm border rounded-4 p-3 bg-white">
                        <img src="${pageContext.request.contextPath}/img/cuentas.png" class="card-body" alt="img-cuentas">
                        <div class="card-body">
                            <div class="overlay">
                                <a href=""><p>Cuentas</p></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
                crossorigin="anonymous"></script>
</body>
</html>