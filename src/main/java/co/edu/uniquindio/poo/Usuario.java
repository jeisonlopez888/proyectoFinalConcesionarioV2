package co.edu.uniquindio.poo;



public abstract class Usuario implements ICredenciales {
    protected String nombre;
    protected String correo;
    protected String contrasena;

    @Override
    public boolean login(String correo, String contrasena) {
        return this.correo.equals(correo) && this.contrasena.equals(contrasena);
    }

    @Override
    public boolean recuperarContrasena(String respuesta) {
        System.out.println("Recuperando contraseña para " + correo);
        return false; // Este método debería ser implementado en las subclases
    }

    // Getters y Setters
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
        this.contrasena = contrasena; // Este método debe estar definido
    }
}