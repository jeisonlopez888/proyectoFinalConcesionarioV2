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
        return "\n\n\nCamioneta " + super.toString() + ",numPasajeros = " + numPasajeros + ",\n numPuertas = " + numPuertas + ",\n capacidadMaletero = "
                + capacidadMaletero + ",\n aireAcondicionado = " + aireAcondicionado + ",\n camaraReversa = " + camaraReversa
                + ",\n velocidadCrucero = " + velocidadCrucero + ",\n numBolsasAire = " + numBolsasAire + ",\n ABS = " + ABS
                + ",\n sensoresColision = " + sensoresColision + ",\n sensorTraficoCruzado = " + sensorTraficoCruzado
                + ",\n asistentePermanenciaCarril = " + asistentePermanenciaCarril + ",\n cuatroXCuatro = " + cuatroXCuatro
                + "]";
    }
    
    ....
}
