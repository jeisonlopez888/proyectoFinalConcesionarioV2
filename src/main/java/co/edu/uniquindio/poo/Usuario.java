package co.edu.uniquindio.poo;

/**
 * Clase abstracta que representa a un Usuario.
 * Implementa la interfaz ICredenciales.
 */
public abstract class Usuario implements ICredenciales {
    // Atributos de la clase
    private String nombre;      // Se recomienda usar modificadores de acceso
    private String correo;
    private String contrasena;

    // Constructor por defecto (opcional)
    public Usuario() {}

    // Constructor con parámetros
    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Método abstracto para recuperar contraseña.
     * @param respuesta La respuesta a la pregunta de seguridad.
     * @return true si la recuperación es exitosa, false en caso contrario.
     */
    public abstract boolean recuperarContrasena(String respuesta);

    /**
     * Implementación del método login de la interfaz ICredenciales.
     * @param correo El correo electrónico del usuario.
     * @param password La contraseña del usuario.
     * @return true si el login es exitoso, false en caso contrario.
     */
    @Override
    public boolean login(String correo, String password) {
        return this.correo.equals(correo) && this.contrasena.equals(password);
    }
}