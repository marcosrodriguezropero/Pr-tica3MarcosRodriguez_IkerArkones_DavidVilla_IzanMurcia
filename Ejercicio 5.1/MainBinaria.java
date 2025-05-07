import java.io.*;

public class MainBinaria {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 45);

        // Serialización
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            Persona cargada = (Persona) ois.readObject();
            System.out.println("Objeto cargado: " + cargada);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
