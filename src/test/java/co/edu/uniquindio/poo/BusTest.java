package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusTest {

    @Test
    public void testToString() {
        // Crear un objeto Bus con valores conocidos
        Bus bus = new Bus("Mercedes", "Sprinter", 20, 2, "1000L",
                           true, true, 6, true, 2, 4);

        // Llamar al método toString()
        String resultadoEsperado = "\n\n\nBus \n Marca: 'Mercedes', Modelo: 'Sprinter',\n numPasajeros = 20," +
                                    "\n numPuertas = 2," +
                                    "\n capacidadMaletero = 1000L," +
                                    "\n aireAcondicionado = true," +
                                    "\n camaraReversa = true," +
                                    "\n numBolsasAire = 6," +
                                    "\n ABS = true," +
                                    "\n numeroEjes = 2," +
                                    "\n salidasEmergencia = 4";

        String resultadoObtenido = bus.toString();

        // Verificar si el resultado obtenido es igual al esperado
        assertEquals(resultadoEsperado.trim(), resultadoObtenido.trim());
    }
}