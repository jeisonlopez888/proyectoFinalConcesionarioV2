package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private String capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private boolean velocidadCrucero;
    private int numBolsasAire;
    private boolean ABS;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;

    @Override
    public String toString() {
         return "Sedan " + super.toString() + ", \n numPasajeros=" + numPasajeros + ", \n numPuertas=" + numPuertas + ", \n capacidadMaletero=" + capacidadMaletero + ", \n aireAcondicionado=" + aireAcondicionado + ", \n camaraReversa=" + camaraReversa + ", \n velocidadCrucero=" + velocidadCrucero + ", \n numBolsasAire=" + numBolsasAire + ", \n ABS=" + ABS + ", \n sensoresColision=" + sensoresColision + ", \n sensorTraficoCruzado=" + sensorTraficoCruzado + ", \n asistentePermanenciaCarril=" + asistentePermanenciaCarril ; }
} 
