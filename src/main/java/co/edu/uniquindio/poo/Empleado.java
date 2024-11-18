package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Empleado extends Usuario implements IRegistroVehiculo, IRegistroCliente, ITransacciones {
    protected List<Vehiculo> vehiculos = new LinkedList<>();
    protected List<Cliente> clientes = new LinkedList<>();
    protected List<Transaccion> transacciones = new LinkedList<>();



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
        if (vehiculos.contains(vehiculo)) {
            Transaccion transaccion = new Transaccion(this, cliente, vehiculo, "alquiler");
            transacciones.add(transaccion);
            System.out.println("Alquiler realizado para: " + cliente.getNombre());
        } else {
            System.out.println("El vehículo no está disponible para alquiler.");
        }
    }

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