package co.edu.uniquindio.poo;

/**
 * Excepción que se lanza cuando hay un error al registrar un vehículo.
 */
public class ExcepcionRegistroVehiculo extends Exception {
    
    // Constructor que recibe un mensaje de error
    public ExcepcionRegistroVehiculo(String message) {
        super(message);
    }
}
