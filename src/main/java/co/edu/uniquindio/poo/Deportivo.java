package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private String numPasajeros;
    private String numPuertas;
    private String numBolsasAire;
    private String numCaballosFuerza;
    private String tiempoVelMax;
    @Override
    public String toString() {
        return "Deportivo \n numPasajeros=" + numPasajeros + ", \n numPuertas=" + numPuertas + ", \n numBolsasAire="
                + numBolsasAire + ", \n numCaballosFuerza=" + numCaballosFuerza + ", \n tiempoVelMax=" + tiempoVelMax ;
    }
    
    
}
