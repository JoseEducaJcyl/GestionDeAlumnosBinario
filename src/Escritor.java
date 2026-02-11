import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    public static void escribirEstudiantes(String ruta, List<Estudiante> estudiantes){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))){
            out.writeObject(estudiantes);
        } catch (Exception e) {
            throw new RuntimeException("Error al escribir: " + e);
        }
    }
}
