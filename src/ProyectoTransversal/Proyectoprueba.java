
package ProyectoTransversal;

import Entidades.Alumno;
import Entidades.Materias;
import Entidades.*;
import accesoDatos.AlumnoData;
import accesoDatos.InscripcionData;
import accesoDatos.MateriaData;
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
//          Alumno alumnoEncontrado=alu.buscarAlumno(8);
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
//
//        AlumnoData alu=new AlumnoData();
//        for (Alumno alumno: alu.listarAlumnos()){
//            System.out.println(alumno.getDni());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
//           
//        }
//        
//        
////    }
////     
////
//        MateriaData m = new MateriaData();
////        Materias mate= m.buscarM(1);
////         if(mate!=null){
////              System.out.println("nombre:"+mate.getNombre());
////              System.out.println("Año:"+mate.getAnio());
////              
////         }
////        
//        for(Materias materia: m.listaMateria()){
//            System.out.println(materia.getNombre());
//            System.out.println(materia.getAnio());
//            System.out.println(materia.isEstado());
//        }
//      }
////
      AlumnoData alu = new AlumnoData();
      Alumno a= new Alumno();
//      Materias m=new Materias();
////      MateriaData Mtd = new MateriaData();
//      InscripcionData ins = new InscripcionData();
//      
//     Alumno a1=alu.buscarAlumno(9);
     
//     Inscripcion insc = new Inscripcion(7, a1, mate);
//     ins.guardarInscripcion(insc);
    InscripcionData insc = new InscripcionData();
      for(Alumno alumno: insc.obtenerAlumnosXMateria(5)){
            System.out.println(a.getNombre());
//            System.out.println(materia.getAnio());
//            System.out.println(materia.isEstado());
        }
//      }
//  AlumnoData ad=new AlumnoData();
//  MateriaData md=new MateriaData();
//  InscripcionData id= new InscripcionData();
//  Alumno jose=ad.buscarAlumno(9);
//  Materias mate=md.buscarM(5);
//  Inscripcion ins=new Inscripcion(9,jose,mate);
//  id.guardarInscripcion(ins); 
//  
    }
}

