package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;

public class TransaccionTest {

    @Test
    public void testTransaccionTipoTransaccion() {
        // Crear instancias de Empleado, Cliente y Vehiculo
        Empleado empleado = new Empleado("Laura Jiménez", "laura@ejemplo.com");
        Cliente cliente = new Cliente("José Martínez", "321654987", "555-8765", "Boulevard del Sol 456");
        Vehiculo vehiculo = new Vehiculo("Chevrolet", "Malibu", "2018");

        // Crear una instancia de Transaccion
        Transaccion transaccion = new Transaccion(empleado, cliente, vehiculo, "Servicio");
    }
}