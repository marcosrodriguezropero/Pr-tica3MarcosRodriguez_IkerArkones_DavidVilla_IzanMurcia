import java.util.List;

public class Curso {
    private String nombreCurso;
    private Profesor profesor;
    private List<Asignatura> asignaturas;

    public Curso() {
    }

    public Curso(String nombreCurso, Profesor profesor, List<Asignatura> asignaturas) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.asignaturas = asignaturas;
    }

    public String getNombreCurso() { return nombreCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }

    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }

    public List<Asignatura> getAsignaturas() { return asignaturas; }
    public void setAsignaturas(List<Asignatura> asignaturas) { this.asignaturas = asignaturas; }

    @Override
    public String toString() {
        return "Curso{" +
                "nombreCurso='" + nombreCurso + '\'' +
                ", profesor=" + profesor +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
