<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    <nav class="navbar navbar-dark bg-dark"></nav>
	<h1 class="text-center">Registro de Ingreso</h1>
    <form class="text-center" method="" action="">
        <label for="txtMonto">Monto</label><br>
        <input type="number" name="txtMonto" id="txtMonto" /><br>

        <label for="txtDescripcion">Descripci�n</label><br>
        <input type="text" name="txtDescripcion" id="txtDescripcion" /><br>

        <label for="txtDescripcion">Descripci�n</label><br>
        <input type="text" name="txtDescripcion" id="txtDescripcion" /><br>

        <label for="cmbCategor�a">Categor�a</label><br>
        <select name="categoria" id="cmbCategoria">
            <option value="1">poner categor�as</option>
        </select><br>
        
        <label for="cmbFecha">Fecha</label><br>
        <input type="date" name="cmbFecha" id="cmbFecha"/><br>
    </form>
</body>
</html>