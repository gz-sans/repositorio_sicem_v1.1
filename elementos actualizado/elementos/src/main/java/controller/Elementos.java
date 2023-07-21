package controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ElementosDao;
import model.ElementosVo;

public class Elementos extends HttpServlet{
    ElementosVo e= new ElementosVo();
    ElementosDao l=new ElementosDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al Doget");
        String a=req.getParameter("accion");
        switch(a){
            case "crearCategoria":
            crearCategoria(req,resp);
            break;
            case  "listar":
            listar(req,resp);
            System.out.println("entro listar");
            break;
            case  "registrar":
            registrar(req,resp);
            System.out.println("entro listar");
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String a=req.getParameter("accion");

        switch(a){
            case "add":
                add(req,resp);
                System.out.println("accion boton");
            break;

        }
    }
    private void crearCategoria(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }catch(Exception e){
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }
    private void registrar(HttpServletRequest req, HttpServletResponse resp) {
        try{
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        }catch(Exception e){
            System.out.println("El formulario NO ha sido abierto"+e.getMessage().toString());
        }
    }

    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List elemento=l.listar();
            req.setAttribute("elementos", elemento);
            req.getRequestDispatcher("views/Listar.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
            System.out.println(req.getAttribute("elementos"));
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos "+e.getMessage().toString());
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {

        if(req.getParameter("NombreElemento")!=null){
            e.setNombre(req.getParameter("NombreElemento"));
        }
        if(req.getParameter("N_placa")!=null){
            e.setNumeroPlaca( Integer.parseInt(req.getParameter("N_placa")));
        }
        if(req.getParameter("TipoElemento")!=null){
            e.setTipo(Boolean.parseBoolean(req.getParameter("TipoElemento")));
        }
        if(req.getParameter("ValorElemento")!=null){
            e.setValor( Integer.parseInt(req.getParameter("ValorElemento")));
        }
        if(req.getParameter("FechaIngresoElemento")!=null){
            e.setFechaIngreso(req.getParameter("FechaIngresoElemento"));
        }
        if(req.getParameter("NumAula")!=null){
            e.setNumeroAula( Integer.parseInt(req.getParameter("NumAula")));
        }
        if(req.getParameter("Descripcion")!=null){
            e.setDescripcion(req.getParameter("Descripcion"));
            
        }
        if(req.getParameter("chkestado")!=null){
            e.setEstado(true);
        }else{
            e.setEstado(false);
        }
        
        try {
            l.registrar(e);
            System.out.println("Registro insertado correctamente");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro "+e.getMessage().toString());
        }
    }

    
}
