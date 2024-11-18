package co.edu.uniquindio.poo;

/**
 * Interfaz que define los métodos relacionados con las credenciales de un usuario.
 */
public interface ICredenciales {
    
    /**
     * Método para realizar el login del usuario.
     */
    boolean login(String correo, String password);

    /**
     * Método para recuperar la contraseña del usuario.
     */
    void recuperarContrasena();
}
