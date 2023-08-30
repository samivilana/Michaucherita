<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/ingreso.css">
    <link rel="shortcut icon" href="../img/iconWallet.png" type="image/x-icon">
    <title>Mi Chaucherita Web</title>
</head>
<body>

    <%@include file='../templates/banner.html' %>

    <div class="container mt-5">
        <form class="container-fluid ">
            <div class="input-group">
                <select class="form-control" id="categoria">
                    <option value="" disabled selected>Seleccione el mes a buscar</option>
                    <option value="categoria1">Enero</option>
                    <option value="categoria2">Febrero</option>
                    <option value="categoria3">Marzo</option>
                    <option value="categoria1">Abril</option>
                    <option value="categoria2">Mayo</option>
                    <option value="categoria3">Junio</option>
                    <option value="categoria1">Julio</option>
                    <option value="categoria2">Agosto</option>
                    <option value="categoria3">Septiembre</option>
                    <option value="categoria1">Octubre</option>
                    <option value="categoria2">Noviembre</option>
                    <option value="categoria3">Diciembre</option>
                </select>
                <button class="btn btn-outline-success" type="submit">Search</button>
            </div>
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
	                <c:forEach items = "${movimientos}" var ="movimiento">							
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
	                <c:forEach items = "${cuentas}" var ="cuenta">							
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

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>