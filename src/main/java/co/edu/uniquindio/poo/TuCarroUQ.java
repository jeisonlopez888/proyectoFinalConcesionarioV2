package co.edu.uniquindio.poo;


import java.util.LinkedList;
import java.util.List;


/**
 * Clase que representa el sistema TuCarroUQ,
 * implementando las interfaces de registro y reporte.
 */
public class TuCarroUQ implements IRegistroVehiculo, IRegistroCliente, IReporte, IAlmacenamiento {

   protected List<Empleado> empleados = new LinkedList<>();
   private List<Cliente> clientes = new LinkedList<>();
   private List<Vehiculo> vehiculosDisponibles = new LinkedList<>();
   private List<Transaccion> transacciones = new LinkedList<>();

   @Override
   public void registrarVehiculo(Vehiculo vehiculo) {
       vehiculosDisponibles.add(vehiculo);
       System.out.println("Vehículo registrado en TuCarroUQ: " + vehiculo);
   }

   @Override
   public void registrarCliente(Cliente cliente) {
       clientes.add(cliente);
       System.out.println("Cliente registrado en TuCarroUQ: " + cliente);
   }

   public void realizarAlquiler(Vehiculo vehiculo, Cliente cliente, Empleado empleado) {
       if (vehiculosDisponibles.contains(vehiculo)) {
           transacciones.add(new Transaccion(empleado, cliente, vehiculo, "alquiler"));
           System.out.println("Alquiler realizado en TuCarroUQ para: " + cliente.getNombre());
       } else {
           System.out.println("El vehículo no está disponible para alquiler.");
       }
   }
   
   public void realizarVenta(Vehiculo vehiculo, Cliente cliente, Empleado empleado) {
       if (vehiculosDisponibles.contains(vehiculo)) {
           transacciones.add(new Transaccion(empleado, cliente, vehiculo, "venta"));
           System.out.println("Venta realizada en TuCarroUQ para: " + cliente.getNombre());
       } else {
           System.out.println("El vehículo no está disponible para venta.");
       }
   }
   
   public void realizarCompra(Vehiculo vehiculo, Cliente cliente, Empleado empleado) {
       if (vehiculosDisponibles.contains(vehiculo)) {
           transacciones.add(new Transaccion(empleado, cliente, vehiculo, "compra"));
           System.out.println("Compra realizada en TuCarroUQ para: " + cliente.getNombre());
       } else {
           System.out.println("El vehículo no está disponible para compra.");
       }
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
       // Implementar lógica para almacenar datos en un archivo o base de datos
       System.out.println("Datos almacenados.");
   }

   @Override
   public void recuperarDatos() {
       // Implementar lógica para recuperar datos de un archivo o base de datos
       System.out.println("Datos recuperados: " + vehiculosDisponibles);
   }

   public List<Cliente> getClientes() {
       return clientes;
   }

   // Método adicional para obtener vehículos disponibles
   public List<Vehiculo> getVehiculos() {
       return vehiculosDisponibles;
   }
}