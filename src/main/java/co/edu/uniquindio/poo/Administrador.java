package co.edu.uniquindio.poo;


import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa a un Administrador, que extiende de Usuario
 * e implementa las interfaces IReporte e ISeguridad.
 */
public class Administrador extends Usuario implements IReporte, ISeguridad {
    private List<Empleado> empleados = new LinkedList<>();

    // Atributos para la recuperación de contraseña
    private String preguntaSeguridad = "¿Cuál es el nombre de tu primera mascota?";
    private String respuestaSeguridad = "mascota123"; // Respuesta 


    @Override
    public void generarReportes() {
        System.out.println("Generando reportes...");
        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre());
        }
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

    public void validarCredenciales(String correo, String contrasena) throws ExceptionCredenciales {
        if (!correo.equals(this.getCorreo()) || !contrasena.equals(this.getContrasena())) {
            throw new ExceptionCredenciales("Credenciales inválidas");
        }
        System.out.println("Credenciales válidas");
    }

    public boolean recuperarContrasenaPorPregunta(String respuesta) {
        if (respuesta.equals(respuestaSeguridad)) {
            System.out.println("Respuesta correcta. Tu contraseña es: " + getContrasena());
            return true; // Recuperación exitosa
        } else {
            System.out.println("Respuesta incorrecta.");
            return false; // Recuperación fallida
        }
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}