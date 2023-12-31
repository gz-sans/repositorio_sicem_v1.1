<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.ElementosDao" %>
<%@ page import="model.ElementosVo" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/shady.css">
    <link rel="icon" href="assets/source/ventana.png">
    <title>Registrar elementos</title>
</head>
<body>
    <header>
        <div class="logo">
            <img src="assets/source/sena.png">
            <h1>  | Sistema Inventario</h1>
            <div class="btnsup"> 
                <button>Consulta x serial</button>
                <button>Toma virtual</button>
                <button>Acceso</button>
                <button>Catalogo</button>
                <button>Test defectos</button>
            </div>
        </div>
        
<!--Parte superior ⬆️⬆️-->

      
        </div>
    </header>
<nav>
    <div class="contenedor">
        <form class="formu" action="elemento" method="post">
            <label>Nombre:</label>
            <input type="text" name="NombreElemento" id="NombreElemento">
            <label>N° placa:</label>
            <input type="text" name="N_placa" id="N_placa">
            <label>Cantidad:</label>
            <input type="text" name="cantidad" id="cantidad">
            <label>Costo:</label>
            <input type="text" name="Costo" id="Costo">
            <label>Tipo:</label>
            <select class="desp" name="TipoElemento" id="TipoElemento">
                <option disabled selected value="">Seleccionar el tipo</option>
                <option>Consumo</option>
                <option>Desechable</option>
            </select>
            <label>Fecha Ingreso:</label>
            <input type="date" name="FechaIngresoElemento" id="FechaIngresoElemento">
            <label>Categoría:</label>
            <select class="desp" name="categoriaElemento" id="categoriaElemento">
                <option disabled selected value="">Seleccionar una categoria</option>
                <option>Componente electrónico</option>
                <option>Computador todo en uno</option>
                <option>Computador portátil</option>
                <option>Periférico</option>
                <option>Arduino</option>
                <option>Equipo de red</option>
                <option>Herramientas de red</option>
                <option>Cámara</option>
                <option>Accesorio cámara</option>
            </select>
            <label>N° Aula:</label>
            <input type="text" name="NumAula" id="NumAula">
            <label>Descripcion:</label>
            <input type="text" name="Descripcion" id="Descripcion">
            <label>Estado:</label>
            <select class="desp" name="EstadoElemento" id="EstadoElemento">
                <option disabled selected value="">Seleccionar el Estado del elemento </option>
                <option>Activo</option>
                <option>Inactivo</option>
            </select>
            <button type="submit" name="accion" value="add">REGISTRO</button>
        </form>
        <div class="btngrupo">
            <aside class="extra">
                <a href="elemento?accion=listar">
                <button><center>Consultar Elementos registrados</center></button>
                </a>
                <button>Registrar Usuarios</button>
                <button>Consultar usuarios registrados en el sistema</button>
                <button>Consultar prestamos</button>
                <button>Generar reporte de relación de bienes</button>
            </aside>
    </div>
</nav>

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