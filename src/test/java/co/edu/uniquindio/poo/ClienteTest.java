package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    
public class ClienteTest {

    @Test
    public void testClienteGettersAndSetters() {
        // Crear una instancia de Cliente
        Cliente cliente = new Cliente();

        // Establecer valores utilizando los setters
        cliente.setNombre("Juan Pérez");
        cliente.setDocumento("123456789");
        cliente.setTelefono("555-1234");
        cliente.setDireccion("Calle Falsa 123");

        // Verificar que los valores se establecieron correctamente utilizando los getters
        assertEquals("Juan Pérez", cliente.getNombre());
        assertEquals("123456789", cliente.getDocumento());
        assertEquals("555-1234", cliente.getTelefono());
        assertEquals("Calle Falsa 123", cliente.getDireccion());
    }

    
}
