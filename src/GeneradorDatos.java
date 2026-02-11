import java.util.ArrayList;

public class GeneradorDatos {
    public static ArrayList<Estudiante> crearEstudiantes(ArrayList<Estudiante> estudiantes){
        estudiantes.add(new Estudiante("Juan", 7.5));
        estudiantes.add(new Estudiante("Maria", 8.2));
        estudiantes.add(new Estudiante("Pedro", 6.9));
        estudiantes.add(new Estudiante("Ana", 9.1));

        return estudiantes;

    }
}
