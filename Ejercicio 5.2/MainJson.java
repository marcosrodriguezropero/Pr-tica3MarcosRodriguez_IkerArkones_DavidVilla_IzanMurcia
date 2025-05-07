import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainJson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Persona persona = new Persona("Carlos", 45);

        // Guardar en archivo JSON
        try (FileWriter writer = new FileWriter("persona.json")) {
            gson.toJson(persona, writer);
            System.out.println("Objeto guardado en persona.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde archivo JSON
        try (FileReader reader = new FileReader("persona.json")) {
            Persona cargada = gson.fromJson(reader, Persona.class);
            System.out.println("Objeto cargado: " + cargada);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
