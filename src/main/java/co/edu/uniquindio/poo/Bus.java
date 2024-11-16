package co.edu.uniquindio.poo;

public class Bus extends Vehiculo{
    protected int numPasajeros;
    protected int numPuertas;
    protected int capacidadMaletero;
    protected boolean aireAcondicionado;
    protected boolean camaraReversa;
    protected int numBolsasAire;
    protected boolean ABS;
    protected int numeroEjes;
    private int salidasEmergencia;
    @Override
    public String toString() {
        return "\n Bus "+ super.toString() +" \n numPasajeros = " + numPasajeros + ",\n numPuertas = " + numPuertas + ",\n capacidadMaletero = "
                + capacidadMaletero + ",\n aireAcondicionado = " + aireAcondicionado + ",\n camaraReversa = " + camaraReversa
                + ",\n numBolsasAire = " + numBolsasAire + ",\n ABS = " + ABS + ",\n numeroEjes = " + numeroEjes
                + ",\n salidasEmergencia = " + salidasEmergencia ;
    }
   
}
