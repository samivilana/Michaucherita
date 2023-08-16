<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />

</head>
<body>



	<div class="wrapper">
		<div id="formContent">

			<!-- Login Form -->
			<form action="../LoginController?ruta=ingresar" method="POST">
				<fieldset>
					<legend>Login</legend>

					<p>Usuario</p>
					<input type="text" name="usuario" />
					
					<br>
					<p>Clave</p>
					<input type="password" name="password" /> 
					
					<br><br><br>
					<input type="submit"
						value="Ingresar" />
					<br><br><br>
				</fieldset>
			</form>
			<a href="listarPersona.html">[DEMO de Ingreso ]</a>
			<a href="error.html">[DEMO de Error ]</a>

		</div>
	</div>