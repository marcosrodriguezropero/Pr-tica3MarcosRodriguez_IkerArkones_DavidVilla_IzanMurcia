package es.uah.matcomp.el3.a.ejemplo.EjEjemplo;

public class Alumnito {
    String nombre;
    int edad;
    String sexo;
    String modalidad;

    public Alumnito(String nombre, int edad, String sexo, String modalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String toString() {
        return nombre + " " + edad + " " + sexo + " " + modalidad;
    }
}
