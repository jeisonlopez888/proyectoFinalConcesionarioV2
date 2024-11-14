package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
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
    
    @Override
    public String toString() {
        return "Sedan \n numPasajeros=" + numPasajeros + ", \n numPuertas=" + numPuertas + ", \n capacidadMaletero="
                + capacidadMaletero + ", \n aireAcondicionado=" + aireAcondicionado + ", \n camaraReversa=" + camaraReversa
                + ", \n velocidadCrucero=" + velocidadCrucero + ", \n numBolsasAire=" + numBolsasAire + ", \n ABS=" + ABS
                + ", \n sensoresColision=" + sensoresColision + ", \n sensorTraficoCruzado=" + sensorTraficoCruzado
                + ", \n asistentePermanenciaCarril=" + asistentePermanenciaCarril ;
    }

   
}