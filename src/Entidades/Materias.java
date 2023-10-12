
package Entidades;


public class Materias {
    private int idMateria;
    private String nombre;
    private int anio;
    private boolean estado;

    public Materias() {
    }

    public Materias(int idMateria, String nombre, int anio, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materias(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Materias{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anio=" + anio + ", estado=" + estado + '}';
    }
    
    
}