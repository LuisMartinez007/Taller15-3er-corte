package Taller15.Ejercicio1;

import java.io.*;

public class PersistenciaLibro {
    // Método para guardar la información del libro en un archivo
    public void guardarEnArchivo(Libro libro, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            ReporteLibro reporte = new ReporteLibro();
            writer.write(reporte.generarReporte(libro));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
