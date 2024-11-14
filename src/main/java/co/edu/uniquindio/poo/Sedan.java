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
        return " Sedan \n numPasajeros=" + "2" + ", \n numPuertas=" + "4" + ", \n capacidadMaletero="
                + "35 litros" + ", \n aireAcondicionado=" + "si" + ", \n camaraReversa=" + "si"
                + ", \n velocidadCrucero=" + "no" + ", \n numBolsasAire=" + "6" + ", \n ABS=" + "no"
                + ", \n sensoresColision=" + "no" + ", \n sensorTraficoCruzado=" + "no"
                + ", \n asistentePermanenciaCarril=" + "no" ;
    }

   
}