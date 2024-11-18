package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;


/**
 * Clase que representa a un Empleado, que extiende de Usuario
 * e implementa las interfaces IRegistroVehiculo, IRegistroCliente e ITransacciones.
 */
public class Empleado extends Usuario implements IRegistroVehiculo, IRegistroCliente, ITransacciones {
    
    // Lista de vehículos gestionados por el empleado
    protected List<Vehiculo> vehiculos = new LinkedList<>();
    
    // Lista de clientes gestionados por el empleado
    protected List<Cliente> clientes = new LinkedList<>();
    
    // Lista de transacciones realizadas por el empleado
    protected List<Transaccion> transacciones = new LinkedList<>();

    /**
     * Registra un vehículo en la lista de vehículos del empleado.
     */
    @Override
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo);
    }

    /**
     * Registra un cliente en la lista de clientes del empleado.
     */
    @Override
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente);
    }

    /**
     * Realiza un alquiler de un vehículo a un cliente.
     */
    @Override
    public void realizarAlquiler(Vehiculo vehiculo, Cliente cliente) {
        if (vehiculos.contains(vehiculo)) {
            Transaccion transaccion = new Transaccion(this, cliente, vehiculo, "alquiler");
            transacciones.add(transaccion);
            System.out.println("Alquiler realizado para: " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }
    }

    /**
     * Realiza una venta de un vehículo a un cliente.
     */
    @Override
    public void realizarVenta(Vehiculo vehiculo, Cliente cliente) {
        if (vehiculos.contains(vehiculo)) {
            Transaccion transaccion = new Transaccion(this, cliente, vehiculo, "venta");
            transacciones.add(transaccion);
            System.out.println("Venta realizada para: " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no está disponible para venta.");
        }
    }

    /**
     * Realiza una compra de un vehículo por parte de un cliente.
     */
    @Override
    public void realizarCompra(Vehiculo vehiculo, Cliente cliente) {
        if (vehiculos.contains(vehiculo)) {
            Transaccion transaccion = new Transaccion(this, cliente, vehiculo, "compra");
            transacciones.add(transaccion);
            System.out.println("Compra realizada para: " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no está disponible para compra.");
        }
    }
}