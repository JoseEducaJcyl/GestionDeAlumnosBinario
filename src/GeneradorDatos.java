// GeneradorDatos.java
import java.util.ArrayList;

public class GeneradorDatos {
    // Este método añade estudiantes de ejemplo a la lista que recibe
    public static ArrayList<Estudiante> crearEstudiantes(ArrayList<Estudiante> estudiantes){
        // Creo 4 estudiantes con sus nombres y notas y los añado a la lista
        estudiantes.add(new Estudiante("Juan", 7.5));
        estudiantes.add(new Estudiante("Maria", 8.2));
        estudiantes.add(new Estudiante("Pedro", 6.9));
        estudiantes.add(new Estudiante("Ana", 9.1));

        return estudiantes; // Devuelvo la misma lista con los estudiantes añadidos
    }
}
