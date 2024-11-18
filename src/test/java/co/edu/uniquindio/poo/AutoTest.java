package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;




public class AutoTest {

    @Test
    public void testToString() {
        // Crear un objeto Auto (subclase de Vehiculo) y asignar valores a sus atributos
        Auto auto = new Auto();
        auto.marca = "Toyota";
        
        // Asignar el valor booleano directamente
        String estado = "nuevo"; // Simulando una entrada que podría venir como String
        auto.nuevo = estado.equals("nuevo"); // Convertir String a booleano
        
        auto.modelo = "Corolla";
        auto.cambios = "Automático";
        auto.velocidadMaxima = "180 km/h";
        auto.cilindraje = "1600 cc";
        auto.tipoTransmision = "Automática";
        auto.tipoCombustible = "Gasolina";

        // Llamar al método toString()
        String resultadoEsperado = "\n Marca: 'Toyota', \n Nuevo: true, \n Modelo: 'Corolla', " +
                                    "\n Cambios: 'Automático', \n Velocidad Máxima: '180 km/h', " +
                                    "\n Cilindraje: '1600 cc', \n Tipo de Transmisión: 'Automática', " +
                                    "\n Tipo de Combustible: 'Gasolina'";
        
        String resultadoObtenido = auto.toString();

        // Verificar si el resultado obtenido es igual al esperado
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}