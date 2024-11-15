package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private int capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenosAire;
    private boolean ABS;
    private int numeroEjes;
    private String tipoCamion;
    @Override
    public String toString() {
        return "\n Camion "+ super.toString() +" \n capacidadCarga=" + capacidadCarga + ",\n aireAcondicionado=" + aireAcondicionado + ", \n frenosAire="
                + frenosAire + ",\n ABS=" + ABS + ",\n numeroEjes=" + numeroEjes + ",\n tipoCamion=" + tipoCamion ;
    }

}
