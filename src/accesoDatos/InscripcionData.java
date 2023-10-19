
package accesoDatos;

import Entidades.inscripcion;
import java.sql.*;
import javax.swing.JOptionPane;

public class InscripcionData {
    
    private Connection con = null;
    
    public InscripcionData(){   
      this.con=Conexion.getConexion();
    }
    
    public void guardarInscripcion(inscripcion ins) {
        String sql= "INSERT INTO `inscripcion`(`nota`, `idAlumno`, `idMateria`)"
                + "VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno()); ////el primer getidAlumno hacer referencia al alumno de la clase inscrpcion y el segundo al de la clase Alumno
            ps.setInt(3, ins.getMaterias().getIdMateria());/// el primer getMateria es de la clase inscripcion y el otro de la clase materia
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            
            if (rs.next()) {
                ins.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "INSCRIPCION REGISTRADA");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        
        }
        
      
}
}
