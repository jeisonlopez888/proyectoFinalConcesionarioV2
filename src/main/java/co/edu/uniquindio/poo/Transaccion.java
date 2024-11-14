package co.edu.uniquindio.poo;

import java.util.Date;


public class Transaccion {
    Empleado empleado;
    Cliente cliente;
    Vehiculo vehiculo;
    Date fecha;
    String tipoTransaccion;

    public Transaccion(Empleado empleado, Cliente cliente, Vehiculo vehiculo, String tipoTransaccion) {
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = new Date();
        this.tipoTransaccion = tipoTransaccion;
    }

    @Override
    public String toString() { 
        return "Transaccion " + "\n empleado=" + empleado.getNombre() + ", \n cliente=" + cliente + ", \n vehiculo=" + vehiculo + ", \n fecha=" + fecha + ", \n tipoTransaccion='" + tipoTransaccion ; }
}
 
