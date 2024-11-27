package Taller15.Ejercicio1;

public class ReporteLibro {
    public String generarReporte(Libro libro){
        return "Titulo: "+libro.getTitulo()+"Autor: "+libro.getAutor()+" paginas: "+libro.getPaginas();
    }
}
