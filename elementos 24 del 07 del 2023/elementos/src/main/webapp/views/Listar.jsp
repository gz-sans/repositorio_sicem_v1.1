<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.ElementosDao" %>
<%@ page import="model.ElementosVo" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/Listas.css">
    <link rel="icon" href="assets/source/ventana.png">
    <title>Consultas</title>
</head>
<body>
    <header class="presen">
        <div class="header-content">
            <img src="assets/source/sena.png">
            <h1>| Consulta |</h1>
            <div class="salir">
                <a href="elemento?accion=registrar">
                    <img src="assets/source/salir.ico">
                </a>
            </div>
        </div>
    </header>
    <article class="contenedor">
        <div class="search-bar">
            <form action="elemento" method="GET">
                <input type="text" name="placa" placeholder="Buscar por N° de placa">
                <button type="submit" name="accion" value="buscar_elementos">Buscar</button>
            </form>
            <form action="elemento" method="GET">
                <input type="text" name="tipo" placeholder="Buscar por Tipo">
                <button type="submit" name="accion" value="buscar_tipo">Buscar</button>
            </form>
        </div>
        <div class="subCont">
            <table class="tabla">
            <thead>
                <tr id="cabecera">

                    <th>Nombre</th>
                    <th>N° placa</th>
                    <th>Cantidad</th>
                    <th>Costo</th>
                    <th>Tipo</th>
                    <th>Fecha de Ingreso</th>
                    <th>Categoría</th>
                    <th>N° aula</th>
                    <th>Descripción</th>
                    <th>Estado</th>
                </tr>
            </thead>
            <tbody>
                <% 
                ElementosDao elementosDao = new ElementosDao();
                List<ElementosVo> elementos;
                String placa = request.getParameter("placa");
                if (placa != null && !placa.isEmpty()) {
                    elementos = elementosDao.buscarPorNumeroPlaca(placa);
                } else {
                    elementos = elementosDao.listar();
                }
                for (ElementosVo elemento : elementos) {
                %>

                <tr id="campo">

                    <td><%= elemento.getNombre()%></td>
                    <td><%= elemento.getNumeroPlaca()%></td>
                    <td><%= elemento.getCantidad()%></td>
                    <td><%= elemento.getCosto()%></td>
                    <td><%= elemento.getTipo()%></td>
                    <td><%= elemento.getFechaIngreso()%></td>
                    <td><%= elemento.getCategoria()%></td>
                    <td><%= elemento.getNumeroAula()%></td>
                    <td><%= elemento.getDescripcion()%></td>
                    <td><%= elemento.getEstado()%></td>
                </tr>
                <% } %>
            </tbody>
            </table>

        </div>
    </article>

    <footer class="end0">
        <div class="end1">
            <h1><a class="link" href="https://www.sena.edu.co/">WWW.SENA.EDU.CO</a></h1>
        </div>
        <div class="end2">
            <legend>Equipo de desarrollo</legend>
            <ul class="lista">
                <li>Michael Josué Rico</li>
                <li>Juan Camilo Torres Ávila</li>
                <li>Luis Carlos Galindo Flórez</li>
                <li>Duvan Felipe Sánchez Leguizamón</li>
                <li>Kevin Andrés Mora Castañeda</li>
            </ul>
        </div>
    </footer>
</body>
</html>
