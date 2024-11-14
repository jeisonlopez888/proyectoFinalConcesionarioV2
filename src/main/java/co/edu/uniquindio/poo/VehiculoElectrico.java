package co.edu.uniquindio.poo;



public class VehiculoElectrico extends Vehiculo {
    int autonomiaCargaCompleta;
    int tiempoCarga;

    @Override
    public String toString() { 
        return "VehiculoElectrico " + super.toString() + ", \n autonomiaCargaCompleta=" + autonomiaCargaCompleta + ", \n tiempoCarga=" + tiempoCarga + '}'; }
} 
