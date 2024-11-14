package co.edu.uniquindio.poo;


public class VehiculoHibrido extends Vehiculo {
    boolean enchufable;
    boolean hibridoLigero;

    @Override
    public String toString() { 
        return "VehiculoHibrido " + super.toString() + ", \n enchufable=" + enchufable + ", \n hibridoLigero=" + hibridoLigero; }
} 
