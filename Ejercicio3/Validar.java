package Taller15.Ejercicio3;

public class Validar {
    public boolean validarEmail(Usuario usuario){
        String email=usuario.getEmail();
        return email.contains("@")&& email.contains(".");
    }
}
