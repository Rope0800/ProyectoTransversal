
package ProyectoTransversal;

import Entidades.Alumno;
import accesoDatos.AlumnoData;
import java.time.LocalDate;
import java.time.Month;


public class Proyectoprueba {

   
    public static void main(String[] args) {
       
////        
//       Alumno carlos = new Alumno(14,40500505, "Carlos", "Lopez", LocalDate.of(1999, 5, 2), true);
//       AlumnoData alu = new AlumnoData();
//        alu.guardaralumno(carlos);
//        alu.modificarAlumno(carlos);
//        alu.eliminarAlumno(14);
//          Alumno alumnoEncontrado=alu.buscarAlumno(13);
//          if(alumnoEncontrado!=null){
//              System.out.println("Dni:"+alumnoEncontrado.getDni());
//              System.out.println("Apellido:"+alumnoEncontrado.getApellido());
//              System.out.println("Nombre:"+alumnoEncontrado.getNombre());
//         }
//          Alumno alumnoEncontradodni=alu.buscarAlumnoporDni(436905055);
//          if(alumnoEncontradodni!=null){
//              System.out.println("Dni:"+alumnoEncontradodni.getDni());
//              System.out.println("Apellido:"+alumnoEncontradodni.getApellido());
//              System.out.println("Nombre:"+alumnoEncontradodni.getNombre());
//          }

        AlumnoData alu=new AlumnoData();
        for (Alumno alumno: alu.listarAlumnos()){
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
           
        }
        
        
//    }
//    
      }
    }
