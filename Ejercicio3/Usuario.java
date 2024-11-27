package Taller15.Ejercicio3;

public class Usuario {
    private String nombre;
    private String contra;
    private String email;

    public Usuario(String nombre, String contra, String email){
        this.nombre=nombre;
        this.contra=contra;
        this.email=email;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getContra(){
        return contra;
    }

    public void setContra(String contra){
        this.contra=contra;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
}
