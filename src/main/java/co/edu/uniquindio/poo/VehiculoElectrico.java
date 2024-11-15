package co.edu.uniquindio.poo;



public class VehiculoElectrico extends Vehiculo {
    public int autonomiaCargaCompleta;
    public int tiempoCarga;

    @Override
    public String toString() { 
        return "\n \n VehiculoElectrico " + super.toString() + ", \n autonomiaCargaCompleta = " + "430 km/h" + ", \n tiempoCarga = " + "8 horas" + '}'; }
} 
