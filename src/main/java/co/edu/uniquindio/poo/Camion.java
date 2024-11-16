package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    protected int capacidadCarga;
    protected boolean aireAcondicionado;
    protected boolean frenosAire;
    protected boolean ABS;
    protected int numeroEjes;
    protected String tipoCamion;
    @Override
    public String toString() {
        return "\n Camion "+ super.toString() +" \n capacidadCarga=" + capacidadCarga + ",\n aireAcondicionado=" + aireAcondicionado + ", \n frenosAire="
                + frenosAire + ",\n ABS=" + ABS + ",\n numeroEjes=" + numeroEjes + ",\n tipoCamion=" + tipoCamion ;
    }

}
