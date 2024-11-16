package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Administrador extends Usuario implements IReporte, ISeguridad {
    protected List<Empleado> empleados = new LinkedList<>();

    @Override
    public void generarReportes() {
        System.out.println("Generando reportes...");
    }

    @Override
    public void manejoExcepciones(Exception e) {
        System.err.println("Error: " + e.getMessage());
    }

    public void gestionarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado gestionado: " + empleado);
    }

    public void bloquearEmpleado(Empleado empleado) {
            empleados.add(empleado);
            System.out.println("Empleado bloqueado: " + empleado);
    }

    public void validarCredenciales(String correo, String contrasena) throws ExcepcionCredenciales {
        // Supongamos que las credenciales válidas son "admin@ejemplo.com" y "12345"
        if (!correo.equals("admin@ejemplo.com") || !contrasena.equals("12345")) {
            throw new ExcepcionCredenciales("Credenciales inválidas");
        }
        System.out.println("Credenciales válidas");
    }
}
