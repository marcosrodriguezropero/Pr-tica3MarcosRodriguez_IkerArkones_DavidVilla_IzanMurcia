import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class CursoMain {
    public static void main(String[] args) {
        Profesor profe = new Profesor("Dr. Navarro", "Tecnología");
        Asignatura a1 = new Asignatura("Programación", 6);
        Asignatura a2 = new Asignatura("Bases de Datos", 5);

        Curso curso = new Curso("1º DAM", profe, Arrays.asList(a1, a2));

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("curso.json")) {
            gson.toJson(curso, writer);
            System.out.println("Curso guardado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader("curso.json")) {
            Curso cursoLeido = gson.fromJson(reader, Curso.class);
            System.out.println("Curso leído desde JSON:");
            System.out.println(cursoLeido);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

