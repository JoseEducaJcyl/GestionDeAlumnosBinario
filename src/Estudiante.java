// Estudiante.java
import java.io.Serializable;

// Serializable permite que los objetos de esta clase se puedan guardar en archivos binarios
public class Estudiante implements Serializable {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private double nota;

    // Constructor para crear nuevos estudiantes
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getters y setters (métodos para acceder a los atributos privados)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // toString personalizado para mostrar el estudiante de forma legible
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
