package co.edu.uniquindio.poo;


public class VehiculoHibrido extends Vehiculo {
    public boolean enchufable;
    public boolean hibridoLigero;

    @Override
    public String toString() { 
        return "VehiculoHibrido " + super.toString() + ", \n enchufable = " + " Si " + ", \n hibridoLigero = " + " No "; }
} 
