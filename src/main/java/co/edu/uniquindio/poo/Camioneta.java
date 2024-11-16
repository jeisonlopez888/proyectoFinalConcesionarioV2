package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo {
    protected String numPasajeros;
    protected String numPuertas;
    protected String capacidadMaletero;
    protected String aireAcondicionado;
    protected String camaraReversa;
    protected String velocidadCrucero;
    protected String numBolsasAire;
    protected String ABS;
    protected String sensoresColision;
    protected String sensorTraficoCruzado;
    protected String asistentePermanenciaCarril;
    protected String cuatroXCuatro;
    
    @Override
    public String toString() {
        return "Camioneta [numPasajeros=" + numPasajeros + ", numPuertas=" + numPuertas + ", capacidadMaletero="
                + capacidadMaletero + ", aireAcondicionado=" + aireAcondicionado + ", camaraReversa=" + camaraReversa
                + ", velocidadCrucero=" + velocidadCrucero + ", numBolsasAire=" + numBolsasAire + ", ABS=" + ABS
                + ", sensoresColision=" + sensoresColision + ", sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", asistentePermanenciaCarril=" + asistentePermanenciaCarril + ", cuatroXCuatro=" + cuatroXCuatro
                + "]";
    }
    
    
}
