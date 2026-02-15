// Main.java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Creo una lista vacía para guardar estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // 2. Llamo al método que añade estudiantes de ejemplo a la lista
        // (Juan, Maria, Pedro, Ana con sus notas)
        GeneradorDatos.crearEstudiantes(estudiantes);

        // 3. Guardo la lista completa en un archivo binario llamado "estudiantes.lista"
        Escritor.escribirEstudiantes("estudiantes.lista", estudiantes);

        // 4. Leo los estudiantes desde el archivo (pero no guardo el resultado en ninguna variable)
        // Esto no hace nada visible, solo lee el archivo
        Lector.leerEstudiantes("estudiantes.lista");

        // 5. Muestro los estudiantes por pantalla
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString()); // Imprimo cada estudiante
        }
        
        // Nota: La media se podría calcular con CalcularMedia.calcularMedia(estudiantes)
        // pero en este main no se está usando ese método
    }
}
