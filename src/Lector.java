import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Lector {
    public static ArrayList<Estudiante> leerEstudiantes(String ruta){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            estudiantes = (ArrayList<Estudiante>) ois.readObject();
        }catch(Exception e){
            throw  new RuntimeException("Error al leer: " + e);
        }
        return estudiantes;
    }
}
