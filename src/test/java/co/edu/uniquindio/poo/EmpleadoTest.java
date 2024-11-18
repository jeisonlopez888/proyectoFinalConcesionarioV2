/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;


import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Unit test for simple App.
 */
public class EmpleadoTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoTest.class.getName());

    
    @Test
    public void GestionarEmpleadoNulo() {
        LOG.info("Iniciado test GestionarEmpleadoNulo");

        Administrador administrador = new Administrador();
        
        administrador.gestionarEmpleado(null);
        
        assertEquals(0, administrador.getEmpleados().size());
        LOG.info("Finalizando test dGestionarEmpleadoNulo");
    }
      
}
    
