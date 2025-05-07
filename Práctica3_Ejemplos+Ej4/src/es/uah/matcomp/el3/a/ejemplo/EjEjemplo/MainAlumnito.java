package es.uah.matcomp.el3.a.ejemplo.EjEjemplo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class MainAlumnito {
    public static void main(String[] args) throws IOException {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            cadena.append("Argumento " + i + ": " + args[i] + "\n");
        }
        System.out.println("Argumentos: \n" + cadena);

        if (args.length != 2) {
            System.out.println("Uso: java -jar alumnito.jar alumnito.json");
        }

        String operacion = args[0];
        String fichero = args[1];
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        switch (operacion) {
            case "init":
                Alumnito alumno = new Alumnito("Mateo",19,"Varón","Ciencias y tecnología");
                try (FileWriter fw = new FileWriter(fichero)) {
                    gson.toJson(alumno, fw);
                } catch (IOException e) {
                    e.getMessage();
                }
                break;

            case "show":
                try (FileReader fr = new FileReader(fichero)) {
                    alumno = gson.fromJson(fr, Alumnito.class);
                    System.out.println(alumno);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
