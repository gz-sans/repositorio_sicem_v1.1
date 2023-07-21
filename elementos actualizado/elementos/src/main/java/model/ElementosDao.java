package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


    

public class ElementosDao{
    /* Atributos para realizar operaciones sobre la BD */

    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia
    public int registrar(ElementosVo elementos) throws SQLException{
    sql="INSERT INTO Elementos(NombreElemento,N_placa,TipoElemento,ValorElemento,FechaIngresoElemento,NumAula,Descripcion,EstadoElemento) values(?,?,?,?,?,?,?,?)";
    try{
        con=Conexion.conectar(); //abrir conexión
        ps=con.prepareStatement(sql); //preparar sentencia
        ps.setString(1, elementos.getNombre());
        ps.setInt(2, elementos.getNumeroPlaca());
        ps.setBoolean(3, elementos.getTipo());
        ps.setInt(4, elementos.getValor());
        ps.setString(5, elementos.getFechaIngreso());
        ps.setInt(6, elementos.getNumeroAula());
        ps.setString(7, elementos.getDescripcion());
        ps.setBoolean(8, elementos.getEstado());
        System.out.println(ps);
        ps.executeUpdate(); //Ejecutar sentencia
        ps.close(); //cerrar sentencia
        System.out.println("Se registró el rol correctamente");
    }catch(Exception e){
        System.out.println("Error en el regisro "+e.getMessage().toString());
    }
    finally{
        con.close();//cerrando conexión
    }
    return r;
}

public List<ElementosVo> listar() throws SQLException{
    List<ElementosVo> Elementos=new ArrayList<>();
    sql="SELECT * from Elementos";
    try {
        con=Conexion.conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery(sql);
        while(rs.next()){
            ElementosVo l=new ElementosVo();
            //Escribir  en el setter cada valor encontrado
            l.setId(rs.getInt("IdElemento"));
            l.setNombre(rs.getString("NombreElemento"));
            l.setNumeroPlaca(rs.getInt("N_placa"));
            l.setTipo(rs.getBoolean("TipoElemento"));
            l.setValor(rs.getInt("ValorElemento"));
            l.setFechaIngreso(rs.getString("FechaIngresoElemento"));
            l.setNumeroAula(rs.getInt("NumAula"));
            l.setDescripcion(rs.getString("Descripcion"));
            l.setEstado(rs.getBoolean("EstadoElemento"));
                System.out.println(l.getNombre());
                System.out.println(l.getNumeroPlaca());
            Elementos.add(l);
        }
        ps.close();
        System.out.println("consulta exitosa");
    } catch (Exception e) {
        System.out.println("La consulta no pudo ser ejecutado "+e.getMessage().toString());
    }
    finally{
        con.close();
    }

    return Elementos;
}
}
