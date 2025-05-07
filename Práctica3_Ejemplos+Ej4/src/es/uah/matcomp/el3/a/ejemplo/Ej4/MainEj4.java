package es.uah.matcomp.el3.a.ejemplo.Ej4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class MainEj4 {
    public static void main(String[] args) throws IOException {
        //Dos objetos estudiante
        Estudiante est = new Estudiante("Arnaldo", 19);
        Estudiante est2 = new Estudiante("Tessa", 21);
        List<Estudiante> estudiantes = Arrays.asList(est, est2);

        //Asignatura en función de los estudiantes
        Asignatura as = new Asignatura("Matemáticas", Arrays.asList(est, est2));

        PrintWriter pw = new PrintWriter(new FileWriter("asignatura.json"));

        pw.println("  \"nombre\": " + as.getNombre());
        pw.println("  \"estudiantes\":");

        //Bucle para la lista de estudiantes
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante estudiante = estudiantes.get(i);
            pw.println("  \"nombre:\" " + estudiante.getNombre());
            pw.println("  \"edad:\"  " + estudiante.getEdad());
            if (i < estudiantes.size() - 1)
                pw.println(",");
            else pw.println();
        }
    }
}
