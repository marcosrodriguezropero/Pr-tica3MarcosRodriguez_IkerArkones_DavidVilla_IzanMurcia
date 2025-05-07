package es.uah.matcomp.el3.a.ejemplo;

import es.uah.matcomp.el3.a.ejemplo.Ejemplo2.GsonUtilEjemplo;

import static es.uah.matcomp.el3.a.ejemplo.Ejemplo2.GsonUtilEjemplo.cargarObjetoDesdeArchivo;


public class MainDeCambio {
    public static void main(String[] args) {
        String rutaArchivo = "usuario.json";
        GsonUtilEjemplo.Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, GsonUtilEjemplo.Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario Cargado: " + usuarioCargado.getNombre());
        }
    }
}
