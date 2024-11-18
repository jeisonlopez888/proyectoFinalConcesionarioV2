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
        return "\nVan " + super.toString() + ",numPasajeros = " + "15" + ",\n numPuertas = " + "4" + ",\n capacidadMaletero = "
                + "40 litros" + ",\n aireAcondicionado = " + "si" + ",\n camaraReversa = " + "si"
                + ",\n numBolsasAire = " + "2" + ",\n ABS = " + "no porque n hy plata" ;
    }

    
    
}
