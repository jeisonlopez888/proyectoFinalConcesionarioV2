package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Administrador extends Usuario implements IReporte, ISeguridad {
    protected List<Empleado> empleados = new LinkedList<>();

    // Atributos para la recuperación de contraseña
    protected String preguntaSeguridad = "¿Cuál es el nombre de tu primera mascota?";
    protected String respuestaSeguridad = "mascota123"; // Respuesta 

    @Override
    public void generarReportes() {
        System.out.println("Generando reportes...");
    }

    @Override
    public void manejoExcepciones(Exception e) {
        System.err.println("Error: " + e.getMessage());
    }

    public void gestionarEmpleado(Empleado empleado) {
        if (empleado == null) {
            System.err.println("Error: El empleado no puede ser nulo.");
            return;
        }
        empleados.add(empleado);
        System.out.println("Empleado gestionado: " + empleado.getNombre());
    }

    public void bloquearEmpleado(Empleado empleado) {
        if (empleado == null) {
            System.err.println("Error: El empleado no puede ser nulo.");
            return;
        }
        if (!empleados.contains(empleado)) {
            System.err.println("Error: El empleado no está en la lista.");
            return;
        }
        // Aquí puedes implementar lógica para bloquear empleados si es necesario.
        System.out.println("Empleado bloqueado: " + empleado.getNombre());
    }

    public void validarCredenciales(String correo, String contrasena) throws ExcepcionCredenciales {
        // Supongamos que las credenciales válidas son "jeison@e.com" y "12345"
        if (!correo.equals(this.getCorreo()) || !contrasena.equals(this.getContrasena())) {
            throw new ExcepcionCredenciales("Credenciales inválidas");
        }
        System.out.println("Credenciales válidas");
    }

    // Método para recuperar la contraseña mediante una pregunta de seguridad
    public boolean recuperarContrasenaPorPregunta(String respuesta) {
        if (respuesta.equals(respuestaSeguridad)) {
            System.out.println("Respuesta correcta. Tu contraseña es: " + getContrasena());
            return true; // Recuperación exitosa
        } else {
            System.out.println("Respuesta incorrecta.");
            return false; // Recuperación fallida
        }
    }

    // Método para obtener la pregunta de seguridad
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}