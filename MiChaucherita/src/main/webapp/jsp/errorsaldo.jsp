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
	 <style>
        .error-window {
            width: 300px;
            background-color: #ff3333;
            color: #fff;
            padding: 20px;
            border-radius: 10px;
            margin: 0 auto;
            margin-top: 50px;
            text-align: center;
        }
    </style>
<body>
	<%@include file='../templates/banner_inside.html' %>
	<div class="container">
        <div class="error-window">
            <h3>Error en la transacción</h3>
            <p>Saldo insucifiente intentalo de nuevo</p>
        </div>
    </div>
	
	
</body>
</html>