package co.edu.uniquindio.poo;


public abstract class Vehiculo {
    public String marca;
    public String nuevo;
    public String modelo;
    public String cambios;
    public String velocidadMaxima;
    public String cilindraje;
    public String tipoTransmision;
    public String tipoCombustible;

    @Override
    public String toString() {
        return "\n marca = " + marca + '\'' + ", \n nuevo = " + nuevo +
                ", \n modelo = '" + modelo + '\'' + ", \n cambios = " + cambios +
                ", \n velocidadMaxima = " + velocidadMaxima + ", \n cilindraje = " + cilindraje +
                ", \n tipoTransmision = '" + tipoTransmision + '\'' + ", \n tipoCombustible = '" + tipoCombustible + '\'';
    }
    
}
