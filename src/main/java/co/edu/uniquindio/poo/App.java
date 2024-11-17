package co.edu.uniquindio.poo;



import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuCarroUQ tuCarroUQ = new TuCarroUQ();

        Administrador admin = new Administrador();
        admin.setNombre("jeison");
        admin.setCorreo("jeison.com");
        admin.setContrasena("12345");


        // Intentar validar credenciales
        while (true) {
            System.out.print("Ingrese su correo: ");
            String correo = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            try {
                admin.validarCredenciales(correo, contrasena); // Validar credenciales
                break; // Salir del bucle si las credenciales son válidas
            } catch (ExcepcionCredenciales e) {
                admin.manejoExcepciones(e); // Manejo de la excepción
                System.out.print("¿Desea recuperar su contraseña? (si/no): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.print(admin.getPreguntaSeguridad() + ": ");
                    String respuestaSeguridad = scanner.nextLine();
                    admin.recuperarContrasenaPorPregunta(respuestaSeguridad); // Llamada al método para recuperar contraseña
                }
            }
        }

        // Configuración inicial: agregar empleados predefinidos
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Moises Vargas");
        empleado1.setCorreo("moiso@ejemplo.com");
        empleado1.setContrasena("12345");

        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Jeison Lopez");
        empleado2.setCorreo("jeison@ejemplo.com");
        empleado2.setContrasena("12345");

        Empleado empleado3 = new Empleado();
        empleado3.setNombre("Pepito Perez");
        empleado3.setCorreo("pepito@ejemplo.com");
        empleado3.setContrasena("12345");

        // Agregar empleados predefinidos al administrador
        admin.agregarEmpleadoPredefinido(empleado1);
        admin.agregarEmpleadoPredefinido(empleado2);
        admin.agregarEmpleadoPredefinido(empleado3);

        // Menú principal después de iniciar sesión exitosamente
        while (true) {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Realizar transacción");
            System.out.println("3. Mostrar transacciones realizadas");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    // Registrar nuevo empleado
                    Empleado nuevoEmpleado = new Empleado();
                    System.out.print("Ingrese el nombre del empleado: ");
                    nuevoEmpleado.setNombre(scanner.nextLine());
                    System.out.print("Ingrese el correo del empleado: ");
                    nuevoEmpleado.setCorreo(scanner.nextLine());
                    System.out.print("Ingrese la contraseña del empleado: ");
                    nuevoEmpleado.setContrasena(scanner.nextLine());
                    admin.gestionarEmpleado(nuevoEmpleado);
                    break;

                case 2:
                    // Realizar transacción
                    realizarTransaccion(scanner, tuCarroUQ, admin);
                    break;

                case 3:
                    // Mostrar transacciones realizadas
                    tuCarroUQ.generarReportes(); // Método para mostrar transacciones
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close(); // Cerrar el escáner al salir
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void realizarTransaccion(Scanner scanner, TuCarroUQ tuCarroUQ, Administrador admin) {
        // Seleccionar tipo de transacción
        System.out.println("\nTipo de transacción:");
        System.out.println("1. Alquiler");
        System.out.println("2. Venta");
        System.out.println("3. Compra");
        
        int tipoTransaccion = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        // Seleccionar un cliente (simplificado)
        Cliente cliente = new Cliente();
        System.out.print("Ingrese el nombre del cliente: ");
        cliente.setNombre(scanner.nextLine());
        System.out.print("Ingrese el documento del cliente: ");
        cliente.setDocumento(scanner.nextLine());
        System.out.print("Ingrese el teléfono del cliente: ");
        cliente.setTelefono(scanner.nextLine());
        System.out.print("Ingrese la dirección del cliente: ");
        cliente.setDireccion(scanner.nextLine());

        tuCarroUQ.registrarCliente(cliente); 

        // Seleccionar un vehículo (simplificado)
        Vehiculo vehiculo = new Sedan(); // Aquí deberías permitir al usuario seleccionar un vehículo

        switch (tipoTransaccion) {
            case 1:
                tuCarroUQ.realizarAlquiler(vehiculo, cliente, seleccionarEmpleado(admin));
                break;
            case 2:
                tuCarroUQ.realizarVenta(vehiculo, cliente, seleccionarEmpleado(admin));
                break;
            case 3:
                tuCarroUQ.realizarCompra(vehiculo, cliente, seleccionarEmpleado(admin));
                break;
            default:
                System.out.println("Tipo de transacción no válido.");
                break;
        }
    }

    private static Empleado seleccionarEmpleado(Administrador admin) {
        List<Empleado> empleados = admin.getEmpleados();
        
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados disponibles.");
            return null; // O manejar el caso según sea necesario
        }

        System.out.println("\nSeleccione un empleado:");
        
        for (int i = 0; i < empleados.size(); i++) {
            System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
        }

        Scanner scanner = new Scanner(System.in);
        
        int seleccion = scanner.nextInt() - 1; // Restar 1 para obtener el índice correcto
        
        if (seleccion >= 0 && seleccion < empleados.size()) {
            return empleados.get(seleccion);
        } else {
            System.out.println("Selección no válida.");
            return null; // O manejar el caso según sea necesario
        }
    }
}