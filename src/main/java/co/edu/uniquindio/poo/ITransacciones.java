package co.edu.uniquindio.poo;



/**
 * Interfaz que define los métodos para realizar transacciones relacionadas con vehículos.
 */
public interface ITransacciones {
    
    /**
     * Método para realizar un alquiler de un vehículo a un cliente.
     */
    void realizarAlquiler(Vehiculo vehiculo, Cliente cliente);

    /**
     * Método para realizar una venta de un vehículo a un cliente.
     */
    void realizarVenta(Vehiculo vehiculo, Cliente cliente);

    /**
     * Método para realizar una compra de un vehículo por parte de un cliente.
     */
    void realizarCompra(Vehiculo vehiculo, Cliente cliente);
}
