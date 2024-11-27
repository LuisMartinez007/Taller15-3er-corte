package Taller15.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Producto producto=new Producto("Laptop", 100000, 15);

        GenerarEtiqueta etiqueta=new GenerarEtiqueta();
        System.out.println(etiqueta.generaretiqueta(producto));

        CalcularPrecioP precio=new CalcularPrecioP();
        System.out.println("Precio con impuesto: "+precio.CalcularPrecioP(producto));
    }
}
