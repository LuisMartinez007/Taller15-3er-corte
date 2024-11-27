package Taller15.Ejercicio2;

public class Producto {
    private String nombre;
    private double preciob;
    private double impuesto;

    public Producto(String nombre, double preciob, double impuesto){
        this.nombre=nombre;
        this.preciob=preciob;
        this.impuesto=impuesto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public double getPreciob(){
        return preciob;
    }

    public void setPreciob(double preciob){
        this.preciob=preciob;
    }

    public double getImpuesto(){
        return impuesto;
    }

    public void setImpuesto(double impuesto){
        this.impuesto=impuesto;
    }
}
