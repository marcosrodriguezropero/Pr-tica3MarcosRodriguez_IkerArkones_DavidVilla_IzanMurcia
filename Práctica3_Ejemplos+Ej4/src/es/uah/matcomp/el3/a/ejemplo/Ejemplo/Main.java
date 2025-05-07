package es.uah.matcomp.el3.a.ejemplo.Ejemplo;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        Persona persona = new Persona("Marcos", "Rodríguez",18);

        String json = gson.toJson(persona);

        System.out.println(json);
    }
}
