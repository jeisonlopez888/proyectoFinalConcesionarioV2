package co.edu.uniquindio.poo;

/**
 * Excepción que se lanza cuando hay un error durante una transacción.
 */
public class ExceptionTransaccion extends Exception {
    
    // Constructor que recibe un mensaje de error
    public ExceptionTransaccion(String message) {
        super(message);
    }
}

