
package Entidades;


public class inscripcion {
    private int idInscripto;
    private int nota;
    private Alumno idAlumno;
    private Materias idMaterias;

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Materias getIdMaterias() {
        return idMaterias;
    }

    public void setIdMaterias(Materias idMaterias) {
        this.idMaterias = idMaterias;
    }

    public inscripcion(int nota, Alumno idAlumno, Materias idMaterias) {
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idMaterias = idMaterias;
    }

    public inscripcion(int idInscripto, int nota, Alumno idAlumno, Materias idMaterias) {
        this.idInscripto = idInscripto;
        this.nota = nota;
        this.idAlumno = idAlumno;
        this.idMaterias = idMaterias;
    }

    @Override
    public String toString() {
        return "inscripcion{" + "idInscripto=" + idInscripto + ", nota=" + nota + ", idAlumno=" + idAlumno + ", idMaterias=" + idMaterias + '}';
    }
    
    
     
}
