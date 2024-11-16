package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    protected String numPasajeros;
    protected String numPuertas;
    protected String aireAcondicionado;
    protected String camaraReversa;
    protected String numBolsasAire;
    protected String ABS;
    protected String cuatroXCuatro;
    protected String capacidadCarga;
    @Override
    public String toString() {
        return "\n\n\nPickUp " + super.toString() + ",numPasajeros = " + numPasajeros + ",\n numPuertas = " + numPuertas + ",\n aireAcondicionado = "
                + aireAcondicionado + ",\n camaraReversa = " + camaraReversa + ",\n numBolsasAire = " + numBolsasAire + ",\n ABS = "
                + ABS + ",\n cuatroxcuatro = " + cuatroXCuatro + ",\n capacidadCarga = " + capacidadCarga + "]";
    }

    
    
}
