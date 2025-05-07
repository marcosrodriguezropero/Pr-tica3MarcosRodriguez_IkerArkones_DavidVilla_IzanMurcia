import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L; // recomendado

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Persona[nombre=" + nombre + ", edad=" + edad + "]";
    }
}

