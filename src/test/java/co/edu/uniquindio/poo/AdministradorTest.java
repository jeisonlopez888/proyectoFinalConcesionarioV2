/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import org.junit.jupiter.api.Test;


public class AdministradorTest {

    private Administrador administrador;
    private Empleado empleado;

    @Test
    public void testManejoExcepciones() {
        // Inicializa el objeto Administrador con algunos datos de prueba
        administrador = new Administrador();
        administrador.setCorreo("jeison@e.com");
        administrador.setContrasena("12345");

        // Inicializa un objeto Empleado para las pruebas
        empleado = new Empleado();
        empleado.setNombre("Juan");

        // Crea una excepción de muestra
        Exception e = new Exception("Excepción de prueba");

        // Llama al método
        administrador.manejoExcepciones(e);

        // Dado que el método solo imprime en la consola, no podemos afirmar directamente su salida.
        // Solo podemos asegurarnos de que se ejecute sin excepciones.
    }
}

    
