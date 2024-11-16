package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    protected String numPasajeros;
    protected String numPuertas;
    protected String numBolsasAire;
    protected String numCaballosFuerza;
    protected String tiempoVelMax;
    
    @Override
    public String toString() {
        return "\n\n\nDeportivo  numPasajeros = " + numPasajeros + ", \n numPuertas = " + numPuertas + ", \n numBolsasAire = "
                + numBolsasAire + ", \n numCaballosFuerza = " + numCaballosFuerza + ", \n tiempoVelMax = " + tiempoVelMax ;
    }
    
    
}
