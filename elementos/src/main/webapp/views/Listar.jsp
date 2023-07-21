<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.ElementosDao" %>
<%@ page import="model.ElementosVo" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/Listas.css">
    <title>Listar</title>
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
    <h1>Lista de elementos registrados en el sistema</h1>
<div class="contenedor">
    <table class="table table-hover table-bordered">
 
        <tr>
            <th>Id</th>
            <th>Nombre</th>
            <th>Placa</th>
            <th>Tipo</th>
            <th>Valor</th>
            <th>Fecha de ingreso</th>
            <th>Aula</th>
            <th>descripcion</th>
            <th><center>Estado</center></th>
        </tr>

    </tr>
    <div class="contenedor">
        <!-- Contenido de la tabla -->
        <div class="lista-usuarios">
            <% 
            ElementosDao elementosDao = new ElementosDao();
            List<ElementosVo> elementos = elementosDao.listar();
            for (ElementosVo elemento : elementos) {
            %>
            <tr>
                <td><%= elemento.getId() %></td>
                <td><%= elemento.getNombre() %></td>
                <td><%= elemento.getNumeroPlaca() %></td>
                <td><%= elemento.getTipo() %></td>
                <td><%= elemento.getValor() %></td>
                <td><%= elemento.getFechaIngreso() %></td>
                <td><%= elemento.getNumeroAula() %></td>
                <td><%= elemento.getDescripcion() %></td>
                <td><%= elemento.getEstado() %></td>
            </tr>
            <% } %>
        </div>
    </div>

    <!--
        <c:forEach var="elemento" items="${elementos}">         
        
        <tr>
        <td>${elemento.getId()}</td>
        <td>${elemento.getNombre()}</td>
        <td>${elemento.getNumeroPlaca()}</td>
        <td>${elemento.getTipo()}</td>
        <td>${elemento.getValor()}</td>
        <td>${elemento.getFechaIngreso()}</td>
        <td>${elemento.getNumeroAula()}</td>
        <td>${elemento.getDescripcion()}</td>
        
     	 <c:if test="${elemento.getEstado() == true}">
           <td><span class="badge bg-success active">Usuario Activo</span></td> 
        </c:if>
        
        <c:if test="${usuario.getEstado() == false}">
            <td><span class="badge bg-danger active">Usuario Inactivo</span></td> 
        </c:if>
          
        <td>
        <c:if test="${usuario.getEstado() == true}">
           <a usuario="button" 
           class="btn btn-danger btn-sm" 
           onclick=""> 
        Inactivar
        </a>
        </c:if>
        <c:if test="${usuario.getEstado() == false}">
            <a usuario="button" 
            class="btn btn-success btn-sm" 
          >
        Activar
        </a>
        </c:if> 
        </td>
        
        
        <td>
        <a usuario="button" 
        class="btn btn-warning" 
        href="">
        <i class="bi bi-pencil"></i> 
        </a>

	    <a usuario="button" 
	    class="btn btn-danger" 
	    onclick="">
	    <i class="bi bi-trash"></i> 
	    </a>
	    
	    </td>
        </c:forEach>
        -->
        <tr>
            


    </table>

</body>
</html>