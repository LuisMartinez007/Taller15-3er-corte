package Taller15.Ejercicio1;

public class Prueba{
    public static void main(String[] args) {
        // Crear una instancia de Libro
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        // Generar reporte del libro
        ReporteLibro reporte = new ReporteLibro();
        System.out.println(reporte.generarReporte(libro));

        // Guardar la información del libro en un archivo
        PersistenciaLibro persistencia = new PersistenciaLibro();
        persistencia.guardarEnArchivo(libro, "libro.txt");
    }
}
