package co.edu.uniquindio.poo;



public abstract class Usuario implements ICredenciales {
    public String nombre;
    public String correo;
    public String contrasena;

    @Override
    public boolean login(String correo, String contrasena) {
        return this.correo.equals(correo) && this.contrasena.equals(contrasena);
    }

    @Override
    public void recuperarContrasena() {
        System.out.println("Recuperando contraseña para " + correo);
    }

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

    public void setPassword(String contrasena) {
        this.contrasena = contrasena;
    }
}
 
