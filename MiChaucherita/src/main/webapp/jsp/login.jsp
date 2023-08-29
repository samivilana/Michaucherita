<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
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
	

	<div
		class="container d-flex justify-content-center align-items-center min-vh-100">
		<!----------------------- Login Container -------------------------->

		<div class="row border rounded-5 p-3 bg-white shadow box-area">
			
			<div
				class="col-md-6 rounded-4 d-flex justify-content-center align-items-center flex-column left-box bg-success">
				<div class="featured-image mb-3">
					<img src="../img/wallet.png" class="img-fluid" style="width: 250px" />
				</div>
				<p class="text-white fs-2"
					style="font-family: 'Courier New', Courier, monospace; font-weight: 600;">
					Mi Chaucherita Web</p>
				<small class="text-white text-wrap text-center"
					style="width: 17rem; font-family: 'Courier New', Courier, monospace">La
					mejor forma de manejar tus finanzas.</small>
			</div>

			<!-------------------- ------ Right Box ---------------------------->

			<div class="col-md-6 right-box">
				<div class="row align-items-center">
					<div class="header-text mb-4 text-center">
						<h2>Inicio de sesión</h2>
					</div>
					<form action="../LoginController?ruta=ingresar" method="POST">
						<div class="input-group mb-3">
							<input type="text"
								class="form-control form-control-lg bg-light fs-6"
								placeholder="Usuario" name="usuario" required />
						</div>
						<div class="input-group mb-1">
							<input type="password"
								class="form-control form-control-lg bg-light fs-6"
								placeholder="Contraseña" name="password" required />
						</div>
						<div class="input-group mb-5 d-flex justify-content-between"></div>
						<div class="input-group mb-3">
							<button  class="btn btn-lg btn-success w-100 fs-6">
								Iniciar sesión </button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
	
</body>
</html>