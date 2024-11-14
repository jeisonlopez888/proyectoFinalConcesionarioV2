package co.edu.uniquindio.poo;


public class Cliente {
    public String nombre;
    public String documento;
    public String telefono;
    public String direccion;

    

    @Override
    public String toString() { 
        return "Cliente " + "\n nombre='" + nombre + '\'' + ", \n documento='" + documento + '\'' + ", \n telefono='" + telefono + '\'' + ", \n direccion='" + direccion ; }
} 
