public class Profesor {
    private String nombre;
    private String departamento;

    public Profesor() {
    }

    public Profesor(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}

