import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        GeneradorDatos.crearEstudiantes(estudiantes);

        Escritor.escribirEstudiantes("estudiantes.lista", estudiantes);

        Lector.leerEstudiantes("estudiantes.lista");

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
        }
    }
}