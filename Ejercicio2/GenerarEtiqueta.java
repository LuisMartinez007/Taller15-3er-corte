package Taller15.Ejercicio2;

public class GenerarEtiqueta {
    public String generaretiqueta(Producto producto){
        CalcularPrecioP calcular= new CalcularPrecioP();
        return "Producto "+ producto.getNombre()+", Precio: "+calcular.CalcularPrecioP(producto);
    }
}
