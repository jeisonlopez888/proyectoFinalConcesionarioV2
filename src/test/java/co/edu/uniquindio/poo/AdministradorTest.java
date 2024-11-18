package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import java.util.logging.Logger;



public class AdministradorTest {

    private static final Logger LOG = Logger.getLogger(AdministradorTest.class.getName());

    
    @org.junit.jupiter.api.Test
    public void validarCredencialesIncorrectas() {
        LOG.info("Iniciado test validarCredencialesIncorrectas");

        // Crear una instancia de Administrador
        Administrador administrador = new Administrador();
        
        // Probar con credenciales inválidas
        try {
            administrador.validarCredenciales("incorrecto@e.com", "wrongpassword");
            fail("Se esperaba una excepción para credenciales inválidas.");
        } catch (ExcepcionCredenciales e) {
            LOG.info("Excepción esperada lanzada: " + e.getMessage());
        }

        LOG.info("Finalizando test validarCredencialesIncorrectas");
    }
}
