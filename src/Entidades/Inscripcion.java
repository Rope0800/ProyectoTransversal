
package Entidades;


public class Inscripcion {
    private int idInscripto;
    private double nota;
    private Alumno Alumno;
    private Materias Materias;

    public Inscripcion() {
        
    }

    public Inscripcion(Alumno a, Materias m, int i) {
       
    }
    

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return Alumno;
    }

    public void setAlumno(Alumno Alumno) {
        this.Alumno = Alumno;
    }

    public Materias getMaterias() {
        return Materias;
    }

    public void setMaterias(Materias Materias) {
        this.Materias = Materias;
    }
   

    public Inscripcion(double nota, Alumno Alumno, Materias Materias) {
        this.nota = nota;
        this.Alumno = Alumno;
        this.Materias = Materias;
    }

    public Inscripcion(int idInscripto,Alumno Alumno, Materias Materias, double nota) {
        this.idInscripto = idInscripto;
        this.Alumno = Alumno;
        this.Materias = Materias;
        this.nota = nota;
    }
 
    
    

    @Override
    public String toString() {
        return "inscripcion{" + "idInscripto=" + idInscripto + ", nota=" + nota + ", idAlumno=" + Alumno + ", idMaterias=" + Materias + '}';
    }
}
