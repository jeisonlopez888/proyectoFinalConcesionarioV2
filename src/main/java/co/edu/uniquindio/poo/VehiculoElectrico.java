package co.edu.uniquindio.poo;



public class VehiculoElectrico extends Vehiculo {
    protected int autonomiaCargaCompleta;
    protected int tiempoCarga;

    @Override
    public String toString() { 
        return "\n \n VehiculoElectrico " + super.toString() + ", \n autonomiaCargaCompleta = " + "430 km/h" + ", \n tiempoCarga = " + "8 horas" + '}'; }
} 
