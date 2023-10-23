package accesoDatos;

import Entidades.Inscripcion;
import Entidades.Alumno;
import Entidades.Materias;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InscripcionData {
    
    private Connection con = null;
    private MateriaData md=new MateriaData();
    private AlumnoData ad=new AlumnoData();
    
    public InscripcionData(){   
      this.con=Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion ins) {
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
    
    public void actualizarNota(int idAlumno,int idMateria, double nota) {
      String sql= "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idMateria";
     
       try {
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setDouble(1, nota);
        ps.setInt(2, idAlumno);
        ps.setInt(3, idMateria);
        
        int filas=ps.executeUpdate();
        if(filas>0){
            
            JOptionPane.showMessageDialog(null, "Nota Actualizada");
        }
        ps.close();
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
            }
}
    
    public void borrarInscripcionMateriaAlumno(int idAlumno,int idMateria) {
      String sql= "DELETE FROM inscripcio WHERE idAlumno = ? and idMateria = ?";
      
    try{  
      PreparedStatement ps=con.prepareStatement(sql);
      ps.setInt(1, idAlumno);
      ps.setInt(2, idMateria);
      
      int filas=ps.executeUpdate();
        if(filas>0){
            
            JOptionPane.showMessageDialog(null, "INSCRIPCION BORRADA");
       }
        ps.close();
        
    }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
            } 
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        
        ArrayList<Inscripcion> cursadas=new ArrayList<>();
        
        String sql="SELECT * FROM inscripcion";
        
        try{
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
            
            Inscripcion insc=new Inscripcion();
            insc.setIdInscripto(rs.getInt("idInscripto"));
            Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
            Materias mat=md.buscarM(rs.getInt("idAlumno"));
            insc.setAlumno(alu);
            insc.setMaterias(mat);
            insc.setNota(rs.getDouble("nota"));
            cursadas.add(insc);
            
        }
        ps.close();
        
        
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
                }
        return cursadas;
        
        
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        
        ArrayList<Inscripcion> cursadas=new ArrayList<>();
        
        String sql="SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        try{
        PreparedStatement ps=con.prepareStatement(sql);
         ps.setInt(1, idAlumno);
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
            
            Inscripcion insc=new Inscripcion();
            insc.setIdInscripto(rs.getInt("idInscripto"));
            Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
            Materias mat=md.buscarM(rs.getInt("idAlumno"));
            insc.setAlumno(alu);
            insc.setMaterias(mat);
            insc.setNota(rs.getDouble("nota"));
            cursadas.add(insc);
            
        }
        ps.close();
        
        
        }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
                }
        return cursadas;
        
    }
    public List<Materias> obtenerMateriasCursadas(int idAlumno){
        
        ArrayList<Materias> materias=new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                + " materia WHERE inscripcion.idMateria = materia.idMateria"
                + "AND inscripcion.idAlumno = ?;";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                
                Materias materia=new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return materias;
    }
    public List<Materias> obtenerMateriasNOCursadas(int idAlumno){
        
        ArrayList<Materias> materias=new ArrayList<>();
        
        String sql ="SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
                try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                
                Materias materia=new Materias();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return materias;
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        
        ArrayList<Alumno> alumnosMateria=new ArrayList<>();
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado"
                + "FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        
        try {
            PreparedStatement ps=con.prepareCall(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                
                Alumno alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                alumnosMateria.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA INSCRIPCION");
        }
        return alumnosMateria;
    }

}