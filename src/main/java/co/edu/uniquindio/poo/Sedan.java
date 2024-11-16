package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo {
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
    @Override
    public String toString() {
        return "\n\n\nSedan " + super.toString() + ", numPasajeros = " + " 4 " + ",\n numPuertas = " + " 5 " + ",\n capacidadMaletero = "
                + "40 litros" + ",\n aireAcondicionado = " + aireAcondicionado + ",\n camaraReversa = " + camaraReversa
                + ",\n velocidadCrucero = " + velocidadCrucero + ",\n numBolsasAire = " + numBolsasAire + ",\n ABS = " + ABS
                + ",\n sensoresColision = " + sensoresColision + ",\n sensorTraficoCruzado = " + sensorTraficoCruzado
                + ",\n asistentePermanenciaCarril = " + asistentePermanenciaCarril + "]";
    }
    
    

   
}