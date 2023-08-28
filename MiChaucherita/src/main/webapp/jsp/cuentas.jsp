<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

    <header>
        <nav class="navbar navbar-expand-sm navbar-dark bg-success">
            <div class="container">
                <a href="#" class="navbar-brand mb-0 h1">
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
                        <th colspan="4" class="text-center">Movimientos</th>
                    </tr>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Movimientos - Transferencia</th>
                        <th scope="col">Movimientos - Gastos</th>
                        <th scope="col">Movimientos - Ingreso</th>
                    </tr>
                </thead>
                <tbody class="table-group-divider">
                    <tr>
                        <th scope="row">1</th>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    
                   
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
                        <th scope="col">Pichincha</th>
                        <th scope="col">Efectivo</th>
                        <th scope="col">Guayaquil</th>
                    </tr>
                </thead>
                <tbody class="table-group-divider">
                    <tr>
                        <th scope="row">1</th>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
               
                   
                </tbody>
            </table>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>