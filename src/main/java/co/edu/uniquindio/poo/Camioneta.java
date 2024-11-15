package co.edu.uniquindio.poo;

public class Camioneta extends Vehiculo {
    private String numPasajeros;
    private String numPuertas;
    private String capacidadMaletero;
    private String aireAcondicionado;
    private String camaraReversa;
    private String velocidadCrucero;
    private String numBolsasAire;
    private String ABS;
    private String sensoresColision;
    private String sensorTraficoCruzado;
    private String asistentePermanenciaCarril;
    private String cuatroXCuatro;
    
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
