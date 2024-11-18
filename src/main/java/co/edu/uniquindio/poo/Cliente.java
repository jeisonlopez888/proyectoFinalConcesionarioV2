package co.edu.uniquindio.poo;


public class Cliente {
    public String nombre;
    public String documento;
    public String telefono;
    public String direccion;

    
        
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente \n nombre=" + nombre + ", \n documento=" + documento + ", \n telefono=" + telefono + ", \n direccion="
                + direccion;
    }

 } 
