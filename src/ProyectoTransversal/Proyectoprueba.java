
package ProyectoTransversal;

import Entidades.Alumno;
import accesoDatos.alumnoData;
import java.time.LocalDate;






public class Proyectoprueba {

   
    public static void main(String[] args) {
       
        
       Alumno alum1 = new Alumno(43690505, "Carlos", "Cartes", LocalDate.of(1999, 5, 2), true);
       alumnoData alumdata = new alumnoData();
        alumdata.guardaralumno(alum1);
       
        
        
        
    }
    
}
