<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/shady.css">
    <title>Registrar elementos</title>
</head>
<body>
    <header>
        <div class="logo">
            <img src="assets/source/sena.png" alt="Sena Logo">
            <h1> | Sistema Inventario</h1>
            <div class="btnsup"> 
                <span><a class="link" href="elemento?accion=listar">Consulta Elementos</a></span>
                <button>Toma virtual</button>
                <button>Acceso</button>
                <button>Catalogo</button>
                <button>Test defectos</button>
            </div>
        </div>
    </header>
    <nav>
        <div class="contenedor">
            <form class="formu" action="elemento" method="post">
                <label for="nPlaca">Nombre</label>
                <input type="text" name="NombreElemento" id="NombreElemento">
                <label for="tipoElemento">Numero de placa:</label>
                <input type="text" name="N_placa" id="N_placa">
                <label for="tipoElemento">Tipo de Elemento:</label>
                <input type="text" name="TipoElemento" id="TipoElemento">
                <label for="valorElemento">Valor del Elemento:</label>
                <input type="text" name="ValorElemento" id="ValorElemento">
                <label for="fechaIngreso">Fecha de Ingreso:</label>
                <input type="text" name="FechaIngresoElemento" id="FechaIngresoElemento">
                <label for="numAula">N° Aula:</label>
                <input type="text" name="NumAula" id="NumAula">
                <label for="Descripcion" >Descripción:</label>
                <input type="text" name="Descripcion" id="Descripcion">
                <label for="estadoElemento">Estado del Elemento:</label>
                <input type="checkbox" name="chkestado" id="chkestado" checked class="form-check-input">
                <button type="submit" class="link" name="accion" value="add">REGISTRO</button>
            </form>            
            <div class="btngrupo">
                <aside class="extra">
                    <button>Consultar comprobante de realización de toma virtual de inventarios</button>
                    <button><a class="link" href="categoria?accion=crearCategoria">crear categoria</a></button>
                    <button>Transpasar bienes</button>
                    <button>Reintegrar bienes</button>
                    <button>Generar reporte de relación de bienes</button>
                </aside>
            </div>
        </div>
    </nav>
    <footer class="end0">
        <div class="end2">
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
