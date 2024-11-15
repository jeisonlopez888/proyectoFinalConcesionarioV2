package co.edu.uniquindio.poo;

public class Bus extends Vehiculo{
    private int numPasajeros;
    private int numPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean ABS;
    private int numeroEjes;
    private int salidasEmergencia;
    @Override
    public String toString() {
        return "\n Bus "+ super.toString() +" \n numPasajeros = " + numPasajeros + ",\n numPuertas = " + numPuertas + ",\n capacidadMaletero = "
                + capacidadMaletero + ",\n aireAcondicionado = " + aireAcondicionado + ",\n camaraReversa = " + camaraReversa
                + ",\n numBolsasAire = " + numBolsasAire + ",\n ABS = " + ABS + ",\n numeroEjes = " + numeroEjes
                + ",\n salidasEmergencia = " + salidasEmergencia ;
    }
   
}
