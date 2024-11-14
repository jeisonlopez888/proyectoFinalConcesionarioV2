package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Empleado extends Usuario implements IRegistroVehiculo, IRegistroCliente, ITransacciones {
    private List<Vehiculo> vehiculos = new LinkedList<>();
    private List<Cliente> clientes = new LinkedList<>();
    private List<Transaccion> transacciones = new LinkedList<>();

    @Override
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo);
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente);
    }

    @Override
    public void realizarAlquiler(Vehiculo vehiculo, Cliente cliente) {
        transacciones.add(new Transaccion(this, cliente, vehiculo, "alquiler"));
        System.out.println("Alquiler realizado para: " + cliente);
    }

    @Override
    public void realizarVenta(Vehiculo vehiculo, Cliente cliente) {
        transacciones.add(new Transaccion(this, cliente, vehiculo, "venta"));
        System.out.println("Venta realizada para: " + cliente);
    }

    @Override
    public void realizarCompra(Vehiculo vehiculo, Cliente cliente) {
        transacciones.add(new Transaccion(this, cliente, vehiculo, "compra"));
        System.out.println("Compra realizada para: " + cliente);
    }
} 
