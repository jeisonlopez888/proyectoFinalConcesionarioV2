package co.edu.uniquindio.poo;

import java.time.LocalDateTime;

public class Transaccion {
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDateTime fecha;
    private String tipoTransaccion;

    public Transaccion(Empleado empleado, Cliente cliente, Vehiculo vehiculo, String tipoTransaccion) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = LocalDateTime.now(); // Usar LocalDateTime
        this.tipoTransaccion = tipoTransaccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    @Override
    public String toString() { 
        return "Transaccion \n empleado = " + empleado.getNombre() + 
               ", \n cliente = " + cliente.toString() + 
               ", \n vehiculo = " + vehiculo.toString() + 
               ", \n fecha = " + fecha.toString() + 
               ", \n tipoTransaccion = '" + tipoTransaccion + "'";
    }
}