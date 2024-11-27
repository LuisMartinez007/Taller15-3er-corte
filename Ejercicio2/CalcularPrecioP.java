package Taller15.Ejercicio2;

public class CalcularPrecioP {
    public double CalcularPrecioP(Producto producto){
        return producto.getPreciob()+(producto.getPreciob()*producto.getImpuesto()/100);
    }
}
