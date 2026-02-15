// CalcularMedia.java
import java.util.ArrayList;

public class CalcularMedia {
    // Este método calcula la nota media de todos los estudiantes de la lista
    public static double calcularMedia(ArrayList<Estudiante> estudiantes) {
        double media = 0; // Variable para ir acumulando las notas
        
        // Recorro todos los estudiantes de la lista
        for (Estudiante estudiante : estudiantes) {
            media += estudiante.getNota(); // Voy sumando las notas
        }
        
        // Divido la suma total entre el número de estudiantes
        media = media / estudiantes.size();
        
        return media; // Devuelvo la media calculada
    }
}
