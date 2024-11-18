package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculoElectricoTest {

    @Test
    public void testToString() {
        // Crear un objeto VehiculoElectrico y asignar valores a sus atributos
        VehiculoElectrico vehiculoElectrico = new VehiculoElectrico();
        vehiculoElectrico.marca = "Tesla";
        vehiculoElectrico.modelo = "Model S";
        vehiculoElectrico.autonomiaCargaCompleta = 430; // km
        vehiculoElectrico.tiempoCarga = 8; // horas

        // Llamar al método toString()
        String resultadoEsperado = "\n\n\nVehiculoElectrico Marca: 'Tesla', Modelo: 'Model S', " +
                                    ", \n autonomiaCargaCompleta = 430 km" + 
                                    ", \n tiempoCarga = 8 horas}";

        String resultadoObtenido = vehiculoElectrico.toString();

        // Verificar si el resultado obtenido es igual al esperado
        assertEquals(resultadoEsperado.trim(), resultadoObtenido.trim());
    }
}