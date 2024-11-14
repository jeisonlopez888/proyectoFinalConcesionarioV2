package co.edu.uniquindio.poo;



public class VehiculoElectrico extends Vehiculo {
    public int autonomiaCargaCompleta;
    public int tiempoCarga;

    @Override
    public String toString() { 
        return "VehiculoElectrico " + super.toString() + ", \n autonomiaCargaCompleta=" + autonomiaCargaCompleta + ", \n tiempoCarga=" + tiempoCarga + '}'; }
} 
