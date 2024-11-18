package co.edu.uniquindio.poo;


/**
 * Clase abstracta que representa un Vehículo.
 */
public abstract class Vehiculo {

    protected String marca;          // Cambiado a protected para permitir acceso en subclases
    protected String nuevo;         // Cambiado a booleano para representar verdadero/falso
    protected String modelo;
    protected String cambios; 
    protected String velocidadMaxima; 
    protected String cilindraje; 
    protected String tipoTransmision; 
    protected String tipoCombustible;
 
    // Constructor opcional si se desea inicializar atributos al crear una instancia
 
    @Override
    public String toString() { 
       return "\n Marca: '" + marca +
              "', \n Nuevo: " + nuevo +
              ", \n Modelo: '" + modelo +
              "', \n Cambios: '" + cambios +
              "', \n Velocidad Máxima: '" + velocidadMaxima +
              "', \n Cilindraje: '" + cilindraje +
              "', \n Tipo de Transmisión: '" + tipoTransmision +
              "', \n Tipo de Combustible: '" + tipoCombustible +
              "'";
   }
 }