package co.edu.uniquindio.poo;


import java.util.LinkedList;
import java.util.List;

public class TuCarroUQ implements IRegistroVehiculo, IRegistroCliente, ITransacciones, IReporte, IAlmacenamiento {
    protected List<Empleado> empleados = new LinkedList<>();
    protected List<Cliente> clientes = new LinkedList<>();
    protected List<Vehiculo> vehiculos = new LinkedList<>();
    protected List<Transaccion> transacciones = new LinkedList<>();

    @Override
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado en TuCarroUQ: " + vehiculo);
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado en TuCarroUQ: " + cliente);
    }

    public void realizarAlquiler(Vehiculo vehiculo, Cliente cliente, Empleado empleado) {
        transacciones.add(new Transaccion(empleado, cliente, vehiculo, "alquiler"));
        System.out.println("Alquiler realizado en TuCarroUQ para: " + cliente);
    }
    
    public void realizarVenta(Vehiculo vehiculo, Cliente cliente, Empleado empleado) {
        transacciones.add(new Transaccion(empleado, cliente, vehiculo, "venta"));
        System.out.println("Venta realizada en TuCarroUQ para: " + cliente);
    }
    
    public void realizarCompra(Vehiculo vehiculo, Cliente cliente, Empleado empleado) {
        transacciones.add(new Transaccion(empleado, cliente, vehiculo, "compra"));
        System.out.println("Compra realizada en TuCarroUQ para: " + cliente);
    }
    
    @Override
    public void generarReportes() {
        System.out.println("Reportes de transacciones de TuCarroUQ:");
        for (Transaccion transaccion : transacciones) {
            System.out.println(transaccion);
        }
    }

    @Override
    public void almacenarDatos() {
        System.out.println("Datos almacenados.");
    }

    @Override
    public void recuperarDatos() {
        System.out.println("Datos recuperados." + vehiculos);
    }
}