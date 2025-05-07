package es.uah.matcomp.el3.a.ejemplo.Ej4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerJson {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("asignatura.json"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();

        //Leer el JSON a un objeto Asignatura
        String json = sb.toString();
        String nombre = json.split("\"nombre\": \"")[1].split("\",")[0];
        String ests = json.split("\"estudiantes\": \"")[1].split("\",")[0].replace("\"", "").trim();

        //Crear la lista de Estudiantes
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        for (String estudiante : json.split("\"estudiantes\": ")[1].split("\",")) {
            String nombreEstudiante = estudiante.split("\"nombre\": \"")[1].split("\",")[0];
            int edad = Integer.parseInt(estudiante.split("\"edad\": \"")[1].split("\",")[0]);
            estudiantes.add(new Estudiante(nombreEstudiante, edad));
        }

        Asignatura asignatura = new Asignatura(nombre, estudiantes);

        //Excepción y recuperar datos
        System.out.println("Asignatura: " + asignatura.getNombre());
        for (Estudiante estudiante : asignatura.getEstudiantes()) {
            System.out.println(estudiante.getNombre() + "(" + estudiante.getEdad() + ")");
        }
    }
}
