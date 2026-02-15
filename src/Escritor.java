// Escritor.java
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    // Este método guarda una lista de estudiantes en un archivo binario
    public static void escribirEstudiantes(String ruta, List<Estudiante> estudiantes){
        // Uso ObjectOutputStream para guardar objetos completos (no texto plano)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))){
            // Escribo la lista entera de estudiantes en el archivo de golpe
            out.writeObject(estudiantes);
        } catch (Exception e) {
            // Si hay cualquier error, lanzo una excepción con el mensaje
            throw new RuntimeException("Error al escribir: " + e);
        }
    }
}
