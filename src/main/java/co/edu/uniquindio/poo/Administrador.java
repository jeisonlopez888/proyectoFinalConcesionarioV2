package co.edu.uniquindio.poo;




import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa a un Administrador, que extiende de Usuario
 * e implementa las interfaces IReporte e ISeguridad.
 */
public class Administrador extends Usuario implements IReporte, ISeguridad {
    // Lista de empleados gestionados por el administrador
    protected List<Empleado> empleados = new LinkedList<>();
    
    // Atributos para la recuperación de contraseña
    protected String preguntaSeguridad = "¿Cuál es el nombre de tu primera mascota?";
    protected String respuestaSeguridad = "mascota123"; // Respuesta correcta para la recuperación

    /**
     * Genera reportes.
     */
    @Override
    public void generarReportes() {
        System.out.println("Generando reportes...");
    }

    /**
     * Maneja excepciones generadas durante la ejecución.
     * @param e La excepción a manejar.
     */
    @Override
    public void manejoExcepciones(Exception e) {
        System.err.println("Error: " + e.getMessage());
    }

    /**
     * Gestiona un empleado, añadiéndolo a la lista de empleados.
     * @param empleado El empleado a gestionar.
     */
    public void gestionarEmpleado(Empleado empleado) {
        if (empleado == null) {
            System.err.println("Error: El empleado no puede ser nulo.");
            return;
        }
        empleados.add(empleado);
        System.out.println("Empleado gestionado: " + empleado.getNombre());
    }

    /**
     * Bloquea un empleado de la lista gestionada.
     * @param empleado El empleado a bloquear.
     */
    public void bloquearEmpleado(Empleado empleado) {
        if (empleado == null) {
            System.err.println("Error: El empleado no puede ser nulo.");
            return;
        }
        if (!empleados.contains(empleado)) {
            System.err.println("Error: El empleado no está en la lista.");
            return;
        }
        // Implementar lógica para bloquear al empleado si es necesario.
        System.out.println("Empleado bloqueado: " + empleado.getNombre());
    }

    /**
     * Valida las credenciales del administrador.
     * @param correo El correo electrónico del administrador.
     * @param contrasena La contraseña del administrador.
     * @throws ExcepcionCredenciales Si las credenciales son inválidas.
     */
    public void validarCredenciales(String correo, String contrasena) throws ExcepcionCredenciales {
        // Supongamos que las credenciales válidas son "jeison@e.com" y "12345"
        if (!correo.equals(this.getCorreo()) || !contrasena.equals(this.getContrasena())) {
            throw new ExcepcionCredenciales("Credenciales inválidas");
        }
        System.out.println("Credenciales válidas");
    }

    /**
     * Recupera la contraseña mediante una pregunta de seguridad.
     * @param respuesta La respuesta proporcionada para la pregunta de seguridad.
     * @return true si la recuperación es exitosa, false en caso contrario.
     */
    public boolean recuperarContrasenaPorPregunta(String respuesta) {
        if (respuesta.equals(respuestaSeguridad)) {
            System.out.println("Respuesta correcta. Tu contraseña es: " + getContrasena());
            return true; // Recuperación exitosa
        } else {
            System.out.println("Respuesta incorrecta.");
            return false; // Recuperación fallida
        }
    }

    /**
     * Obtiene la pregunta de seguridad del administrador.
     * @return La pregunta de seguridad.
     */
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    /**
     * Obtiene la lista de empleados gestionados por el administrador.
     * @return La lista de empleados.
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }
}