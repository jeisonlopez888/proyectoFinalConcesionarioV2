package co.edu.uniquindio.poo;

public class Van extends Vehiculo {
    protected String numPasajeros;
    protected String numPuertas;
    protected String capacidadMaletero;
    protected String aireAcondicionado;
    protected String camaraReversa;
    protected String numBolsasAire;
    protected String ABS;
    @Override
    public String toString() {
        return "\n\n\nVan " + super.toString() + ",numPasajeros = " + numPasajeros + ",\n numPuertas = " + numPuertas + ",\n capacidadMaletero = "
                + capacidadMaletero + ",\n aireAcondicionado = " + aireAcondicionado + ",\n camaraReversa = " + camaraReversa
                + ",\n numBolsasAire = " + numBolsasAire + ",\n ABS = " + ABS + "]";
    }

    
    
}
