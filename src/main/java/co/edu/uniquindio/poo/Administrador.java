package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Administrador extends Usuario implements IReporte, ISeguridad {
    private List<Empleado> empleados = new LinkedList<>();

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
} 
