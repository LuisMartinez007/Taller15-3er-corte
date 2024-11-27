package Taller15.Ejercicio3;

public class Autenticar {
    // Método para autenticar al usuario
    public boolean autenticar(Usuario usuario, String nombreUsuario, String contraseña) {
        return usuario.getNombre().equals(nombreUsuario) && usuario.getContra().equals(contraseña);
    }
}
