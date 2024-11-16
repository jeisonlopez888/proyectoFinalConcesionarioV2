package co.edu.uniquindio.poo;


public class VehiculoHibrido extends Vehiculo {
    protected boolean enchufable;
    protected boolean hibridoLigero;

    @Override
    public String toString() { 
        return "\n\n VehiculoHibrido " + super.toString() + ", \n enchufable = " + " Si " + ", \n hibridoLigero = " + " No "; }
} 
