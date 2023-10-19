
package Entidades;


public class inscripcion {
    private int idInscripto;
    private double nota;
    private Alumno Alumno;
    private Materias Materias;

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

    public inscripcion(double nota, Alumno Alumno, Materias Materias) {
        this.nota = nota;
        this.Alumno = Alumno;
        this.Materias = Materias;
    }

    public inscripcion(int idInscripto, double nota, Alumno Alumno, Materias Materias) {
        this.idInscripto = idInscripto;
        this.nota = nota;
        this.Alumno = Alumno;
        this.Materias = Materias;
    }
    
    

    @Override
    public String toString() {
        return "inscripcion{" + "idInscripto=" + idInscripto + ", nota=" + nota + ", idAlumno=" + Alumno + ", idMaterias=" + Materias + '}';
    }
}
