package co.edu.uniquindio.poo;

/**
 * Excepción que se lanza cuando hay un error relacionado con las credenciales del usuario.
 */
public class ExceptionCredenciales extends Exception {
    
    // Constructor que recibe un mensaje de error
    public ExceptionCredenciales(String message) {
        super(message);
    }
}
