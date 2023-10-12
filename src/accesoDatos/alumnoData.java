
package accesoDatos;

import Entidades.Alumno;
import java.sql.*;
import javax.swing.JOptionPane;


public class alumnoData {
    private Connection con = null;
    
 public alumnoData(){   
  con=Conexion.getConexion();
 }
 
 
 public void guardaralumno(Alumno alumno){  
     String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
             + "VALUE(?,?,?,?,?)";
     
     try {
        PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        
        ps.setInt(1, alumno.getDni());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getApellido());
        ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
        ps.setBoolean(5,alumno.isEstado());
        ps.executeUpdate();
        
        ResultSet rs =ps.getGeneratedKeys();
        
         if (rs.next()) {
             alumno.setIdAlumno(rs.getInt(1));
             JOptionPane.showMessageDialog(null, "Alumno Guardado");
         }
        ps.close();
         
        
     } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA ALUMNO");
     }

 }
 
 
}
