import java.util.ArrayList;

public class CalcularMedia {
    public static double calcularMedia(ArrayList<Estudiante> estudiantes) {
        double media = 0;
        for (Estudiante estudiante : estudiantes) {
            media += estudiante.getNota();
        }
        media = media / estudiantes.size();
        return media;
    }
}
