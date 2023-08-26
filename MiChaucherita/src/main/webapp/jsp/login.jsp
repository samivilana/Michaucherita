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
<script src="https://kit.fontawesome.com/ef6a53a4a6.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<%@include file='../templates/banner.html'%>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-xl-10 col-lg-12 col-md-9">
				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="row">
						<div class="col-lg-6 d-none d-lg-block ">
							<img src="${pageContext.request.contextPath}/img/logo.jpg" alt="">
						</div>
						<div class="col-lg-6">
							<div class="p-5">
								<div id="formContent">
									<form action="../LoginController?ruta=ingresar" method="POST">
										<fieldset>
											<legend>Login</legend>
											<p>Usuario</p>
											<input type="text" name="usuario" /> <br>
											<p>Contraseña</p>
											<input type="password" name="password" /> <br> <br>
											<input type="submit" value="Iniciar sesion" /> <br> <br>
										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>