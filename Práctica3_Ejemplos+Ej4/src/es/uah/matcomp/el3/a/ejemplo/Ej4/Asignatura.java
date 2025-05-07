package es.uah.matcomp.el3.a.ejemplo.Ej4;

import java.util.List;

public class Asignatura {
    private String nombre;
    private List<Estudiante> estudiantes;

    public Asignatura() {}

    public Asignatura(String nombre, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
