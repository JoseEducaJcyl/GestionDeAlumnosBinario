// Lector.java
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lector {
    // Este método lee una lista de estudiantes desde un archivo binario
    public static ArrayList<Estudiante> leerEstudiantes(String ruta){
        // Creo una lista vacía donde guardaré los estudiantes leídos
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // Uso ObjectInputStream para leer objetos completos del archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            // Leo el objeto del archivo y lo convierto (casteo) a ArrayList<Estudiante>
            estudiantes = (ArrayList<Estudiante>) ois.readObject();
        }catch(Exception e){
            // Si hay cualquier error, lanzo una excepción con el mensaje
            throw  new RuntimeException("Error al leer: " + e);
        }
        return estudiantes; // Devuelvo la lista con los estudiantes leídos
    }
}
