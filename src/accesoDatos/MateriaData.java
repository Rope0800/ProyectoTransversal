
package accesoDatos;

import Entidades.Materias;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {
     private Connection con = null;
     
     public MateriaData(){  
       con=Conexion.getConexion();
     }
    public void guardarMateria(Materias materias){  
    
        String sql = "INSERT INTO materia (nombre, año, estado)"
                + "VALUE(?,?,?)";
        
        try {
            PreparedStatement ps  = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS); 
            
            ps.setString(1, materias.getNombre());
            ps.setInt(2, materias.getAnio());
            ps.setBoolean(3, materias.isEstado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                materias.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada");  
            }
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA MATERIA");
        }
        
    }
    
    public void modificarMateria(Materias materia){ 
    String sql= "UPDATE materia SET nombre = ? , año = ? , estado = ?"
            + "WHERE idMteria";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                
                JOptionPane.showMessageDialog(null, "Materia Modificada");
            }
            
            ps.close();
            
        } catch(SQLException sqx){
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDAR A LA TABLA MATERIA");
            
        }
    }
    
    
    public void eliminarMateria(int id){    
       
        String slq = "UPDATE materia SET estado = ¨? WHERE idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(slq);
            ps.setBoolean(1, false);
            ps.setInt(1,id );
            
            int exito = ps.executeUpdate();
            
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "MATERIA ELIMINADA");
            }
            
            ps.close();
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL INGRESAR A LA TABLA");
        }
    }
    
    public Materias buscarM(int id){  
        
        String slq= "SELECT nombre, año, estado FROM materia WHERE idMateria = ? AND estado = 1";
        Materias materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(slq);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                materia = new Materias();
                materia.setIdMateria(rs.getInt("IdMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("Año"));
                materia.setEstado(true);
            } else{
               JOptionPane.showMessageDialog(null, "NO EXISTE ESTA MATERIA");
            }
            ps.close();
            
            
        } catch (SQLException e) {
            JOptionPane.showInputDialog("ERROR AL ACCEDER A LA TABLA MATERIA");
        }
         return materia;
    }

    
    
    public List<Materias> listaMateria(){   
        String sql="SELECT* FROM materia WHERE estado = 1";
        
        ArrayList<Materias> mate = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Materias materias=new Materias();
                
                materias.setIdMateria(rs.getInt("IdMateria"));
                materias.setNombre(rs.getString("nombre"));
                materias.setAnio(rs.getInt("año"));
                materias.setEstado(rs.getBoolean("estado"));
                mate.add(materias);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR AL ACCESER A LA TABLA MATERIA");
        }
         return mate;
    }
}



