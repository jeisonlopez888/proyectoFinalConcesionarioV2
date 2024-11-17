package co.edu.uniquindio.poo;


public abstract class Usuario implements ICredenciales {
    protected String nombre;
    protected String correo;
    protected String contrasena;

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

    // Método abstracto para recuperar contraseña
    public abstract boolean recuperarContrasena(String respuesta);
}