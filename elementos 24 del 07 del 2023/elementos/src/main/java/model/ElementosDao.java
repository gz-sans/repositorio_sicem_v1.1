package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

    

public class ElementosDao{
    /* Atributos para realizar operaciones sobre la BD */

    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia
    public int registrar(ElementosVo elementos) throws SQLException {
        sql = "INSERT INTO Elementos(NombreElemento,N_placa,cantidad,Costo,TipoElemento,FechaIngresoElemento,categoriaElemento,NumAula,Descripcion,EstadoElemento) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            con = Conexion.conectar(); //abrir conexión
            ps = con.prepareStatement(sql); //preparar sentencia
            ps.setString(1, elementos.getNombre());
            ps.setInt(2, elementos.getNumeroPlaca());
            ps.setInt(3, elementos.getCantidad());
            ps.setInt(4, elementos.getCosto());
            ps.setString(5, elementos.getTipo());
            ps.setDate(6, Date.valueOf(elementos.getFechaIngreso()));
            ps.setString(7, elementos.getCategoria());
            ps.setInt(8, elementos.getNumeroAula());
            ps.setString(9, elementos.getDescripcion());
            ps.setString(10, elementos.getEstado());
            System.out.println(ps);
            r = ps.executeUpdate(); //Ejecutar sentencia
            ps.close(); //cerrar sentencia
            System.out.println("Se registró el rol correctamente");
        } catch (Exception e) {
            System.out.println("Error en el registro " + e.getMessage().toString());
        } finally {
            con.close(); //cerrando conexión
        }
        return r;
    }

    public List<ElementosVo> listar() throws SQLException {
        List<ElementosVo> Elementos = new ArrayList<>();
        sql = "SELECT * FROM Elementos";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
    
            while (rs.next()) {
                ElementosVo l = new ElementosVo();
                //Escribir en el setter cada valor encontrado
                l.setId(rs.getInt("IdElemento"));
                l.setNombre(rs.getString("NombreElemento"));
                l.setCantidad(rs.getInt("cantidad"));
                l.setCosto(rs.getInt("Costo"));
                l.setNumeroPlaca(rs.getInt("N_placa"));
                l.setTipo(rs.getString("TipoElemento"));
                l.setFechaIngreso(rs.getDate("FechaIngresoElemento").toLocalDate());
                l.setCategoria(rs.getString("categoriaElemento"));
                l.setNumeroAula(rs.getInt("NumAula"));
                l.setDescripcion(rs.getString("Descripcion"));
                l.setEstado(rs.getString("EstadoElemento"));
    
                System.out.println(l.getNombre());
                System.out.println(l.getNumeroPlaca());
                Elementos.add(l);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutada " + e.getMessage().toString());
        } finally {
            con.close();
        }
    
        return Elementos;
    }

    public List<ElementosVo> buscarPorNumeroPlaca(String placa) throws SQLException {
        List<ElementosVo> elementos = new ArrayList<>();
        sql = "SELECT * FROM Elementos WHERE N_placa = ?";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, placa);
            rs = ps.executeQuery();
    
            while (rs.next()) {
                ElementosVo l = new ElementosVo();
                l.setId(rs.getInt("IdElemento"));
                l.setNombre(rs.getString("NombreElemento"));
                l.setCantidad(rs.getInt("cantidad"));
                l.setCosto(rs.getInt("Costo"));
                l.setNumeroPlaca(rs.getInt("N_placa"));
                l.setTipo(rs.getString("TipoElemento"));
                l.setFechaIngreso(rs.getDate("FechaIngresoElemento").toLocalDate());
                l.setCategoria(rs.getString("categoriaElemento"));
                l.setNumeroAula(rs.getInt("NumAula"));
                l.setDescripcion(rs.getString("Descripcion"));
                l.setEstado(rs.getString("EstadoElemento"));
    
                elementos.add(l);
            }
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            con.close();
        }
    
        return elementos;
    }

        public List<ElementosVo> buscarPorTipo(String placa) throws SQLException {
        List<ElementosVo> elementos = new ArrayList<>();
        sql = "SELECT * FROM Elementos WHERE TipoElemento = ?";
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, placa);
            rs = ps.executeQuery();
    
            while (rs.next()) {
                ElementosVo l = new ElementosVo();
                l.setId(rs.getInt("IdElemento"));
                l.setNombre(rs.getString("NombreElemento"));
                l.setCantidad(rs.getInt("cantidad"));
                l.setCosto(rs.getInt("Costo"));
                l.setNumeroPlaca(rs.getInt("N_placa"));
                l.setTipo(rs.getString("TipoElemento"));
                l.setFechaIngreso(rs.getDate("FechaIngresoElemento").toLocalDate());
                l.setCategoria(rs.getString("categoriaElemento"));
                l.setNumeroAula(rs.getInt("NumAula"));
                l.setDescripcion(rs.getString("Descripcion"));
                l.setEstado(rs.getString("EstadoElemento"));
    
                elementos.add(l);
            }
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        } finally {
            con.close();
        }
    
        return elementos;
    }
}

