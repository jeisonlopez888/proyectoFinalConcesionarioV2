package co.edu.uniquindio.poo;

/**
 * Interfaz que define los métodos relacionados con las credenciales de un usuario.
 */
public interface ICredenciales {
    
    /**
     * Método para realizar el login del usuario.
     * @param correo El correo electrónico del usuario.
     * @param password La contraseña del usuario.
     * @return true si el login es exitoso, false en caso contrario.
     */
    boolean login(String correo, String password);

    /**
     * Método para recuperar la contraseña del usuario.
     */
    void recuperarContrasena();
}
