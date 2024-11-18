package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuCarroUQ tuCarroUQ = new TuCarroUQ(); // Cambia a tu implementación concreta

        // Crear y configurar el administrador
        Administrador administrador = new Administrador();
        administrador.setNombre("jeison");
        administrador.setCorreo("jeison@.com");
        administrador.setContrasena("12345");

        // Intentar validar credenciales
        while (true) {
            System.out.print("Ingrese su correo: ");
            String correo = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = scanner.nextLine();

            try {
                administrador.validarCredenciales(correo, contrasena); // Validar credenciales
                System.out.println("Credenciales válidas"); // Mensaje de éxito
                break; // Salir del bucle si las credenciales son válidas
            } catch (ExceptionCredenciales e) {
                System.err.println(e.getMessage()); // Mostrar mensaje de error
                System.out.print("¿Desea recuperar su contraseña? (si/no): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.print(administrador.getPreguntaSeguridad() + ": ");
                    String respuestaSeguridad = scanner.nextLine();
                    administrador.recuperarContrasenaPorPregunta(respuestaSeguridad);
                }
            }
        }

        // Registro de empleados
        registrarEmpleados(administrador);

        // Registro de clientes
        registrarClientes(tuCarroUQ);

        // Registro de vehiculos predefinidos
        registrarVehiculos(tuCarroUQ);

        // Menú principal después de iniciar sesión exitosamente
        mostrarMenuPrincipal(scanner, tuCarroUQ, administrador);
    }

    private static void mostrarMenuPrincipal(Scanner scanner, TuCarroUQ tuCarroUQ, Administrador administrador) {
        while (true) {
            System.out.println("\n¿Qué desea hacer?");
            System.out.println("1. Gestionar Empleado");
            System.out.println("2. Realizar transacción");
            System.out.println("3. Agregar Vehiculo"); // Opción para agregar vehiculo
            System.out.println("4. Mostrar transacciones realizadas");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    gestionarEmpleado(scanner, administrador); // Método para gestionar empleados
                    break;

                case 2:
                    realizarTransaccion(scanner, tuCarroUQ, administrador); // Método para realizar transacciones
                    break;

                case 3:
                    agregarVehiculo(scanner, tuCarroUQ); // Método para agregar un vehiculo
                    break;

                case 4:
                    tuCarroUQ.generarReportes(); // Método para mostrar transacciones
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    scanner.close(); // Cerrar el escáner al salir
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    protected static void agregarVehiculo(Scanner scanner, TuCarroUQ tuCarroUQ) {
        Vehiculo nuevoVehiculo;

        System.out.print(
                "\nIngrese el tipo de vehiculo (\n 1.Sedan\n 2.Moto\n 3.Deportivo\n 4.Camioneta\n 5.PickUp\n 6.Van\n 7.Bus\n 8.Camion\n 9.VehiculoElectrico\n 10.VehiculoHibrido):\n ");
        String tipoVehiculo = scanner.nextLine();

        switch (tipoVehiculo.toLowerCase()) {
            case "1":
                nuevoVehiculo = new Sedan();
                break;
            case "2":
                nuevoVehiculo = new Moto();
                break;
            case "3":
                nuevoVehiculo = new Deportivo();
                break;
            case "4":
                nuevoVehiculo = new Camioneta();
                break;
            case "5":
                nuevoVehiculo = new PickUp();
                break;
            case "6":
                nuevoVehiculo = new Van();
                break;
            case "7":
                nuevoVehiculo = new Bus();
                break;
            case "8":
                nuevoVehiculo = new Camion();
                break;
            case "9":
                nuevoVehiculo = new VehiculoElectrico();
                break;
            case "10":
                nuevoVehiculo = new VehiculoHibrido();
                break;
            default:
                System.out.println("Tipo de vehiculo no válido.");
                return;
        }

        // Solicitar atributos comunes a todos los vehiculos
        System.out.print("\nIngrese la marca: ");
        nuevoVehiculo.marca = scanner.nextLine();

        System.out.print("\nIngrese el modelo: ");
        nuevoVehiculo.modelo = scanner.nextLine();

        System.out.print("\nIngrese el cilindraje: ");
        nuevoVehiculo.cilindraje = scanner.nextLine();

        System.out.print("\nIngrese la cantidad de cambios: ");
        nuevoVehiculo.cambios = scanner.nextLine();

        System.out.print("\nIngrese la velocidad máxima: ");
        nuevoVehiculo.velocidadMaxima = scanner.nextLine();

        System.out.print("\n¿Es nuevo o usado? (nuevo/usado): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        nuevoVehiculo.nuevo = respuesta.equals("nuevo"); // Asignar true o false


        System.out.print("\nIngrese el tipo de transmisión: ");
        nuevoVehiculo.tipoTransmision = scanner.nextLine();

        System.out.print("\nIngrese el tipo de combustible: ");
        nuevoVehiculo.tipoCombustible = scanner.nextLine();

        tuCarroUQ.registrarVehiculo(nuevoVehiculo); // Registrar el vehiculo en TuCarroUQ

        System.out.println("\nVehiculo agregado exitosamente.");
    }

    protected static void gestionarEmpleado(Scanner scanner, Administrador administrador) {
        System.out.print("\nIngrese el nombre del nuevo empleado: ");
        String nombreEmpleado = scanner.nextLine();

        System.out.print("\nIngrese el correo del nuevo empleado: ");
        String correoEmpleado = scanner.nextLine();

        System.out.print("\nIngrese la contraseña del nuevo empleado: ");
        String contrasenaEmpleado = scanner.nextLine();

        Empleado nuevoEmpleado = new Empleado();
        nuevoEmpleado.setNombre(nombreEmpleado);
        nuevoEmpleado.setCorreo(correoEmpleado);
        nuevoEmpleado.setContrasena(contrasenaEmpleado);

        administrador.gestionarEmpleado(nuevoEmpleado);
    }

    protected static void realizarTransaccion(Scanner scanner, TuCarroUQ tuCarroUQ, Administrador administrador) {
       // Seleccionar el tipo de transacción
       System.out.println("\nTipo de transacción:");
       System.out.println("1. Alquiler");
       System.out.println("2. Venta");
       System.out.println("3. Compra");

       int tipoTransaccion = scanner.nextInt();
       scanner.nextLine(); // Consumir nueva línea

       // Seleccionar empleado
       Empleado empleadoSeleccionado = seleccionarEmpleado(administrador);
       if (empleadoSeleccionado == null)
           return; // Seleccionar cliente
       Cliente clienteSeleccionado = seleccionarCliente(scanner, tuCarroUQ);
       if (clienteSeleccionado == null)
           return;

       // Obtener vehiculos disponibles
       List<Vehiculo> vehiculosDisponibles = tuCarroUQ.getVehiculos();
       if (vehiculosDisponibles.isEmpty()) {
           System.out.println("No hay vehiculos disponibles.");
           return;
       }

       // Mostrar vehiculos disponibles
       System.out.println("\nseleccione uno de los Vehiculos disponibles:");
       for (int i = 0; i < vehiculosDisponibles.size(); i++) {
           Vehiculo v = vehiculosDisponibles.get(i);
           System.out.println((i + 1) + ". " + v.toString() );
       }

       // Seleccionar vehiculo
       int seleccionVehiculo = scanner.nextInt() - 1;
       if (seleccionVehiculo < 0 || seleccionVehiculo >= vehiculosDisponibles.size()) {
           System.out.println("Selección no válida.");
           return;
       }

       Vehiculo vehiculoSeleccionado = vehiculosDisponibles.get(seleccionVehiculo);

       // Realizar la transacción según el tipo seleccionado
       switch (tipoTransaccion) {
           case 1:
               tuCarroUQ.realizarAlquiler(vehiculoSeleccionado, clienteSeleccionado, empleadoSeleccionado);
               break;
           case 2:
               tuCarroUQ.realizarVenta(vehiculoSeleccionado, clienteSeleccionado, empleadoSeleccionado);
               break;
           case 3:
               tuCarroUQ.realizarCompra(vehiculoSeleccionado, clienteSeleccionado, empleadoSeleccionado);
               break;
           default:
               System.out.println("Tipo de transacción no válido.");
               return;
       }

       // Mostrar resumen de la transacción
       System.out.println("\nTransacción realizada con éxito:");
       System.out.println("Tipo de transacción: "
               + (tipoTransaccion == 1 ? "Alquiler" : tipoTransaccion == 2 ? "Venta" : "Compra"));
       System.out.println("Empleado: " + empleadoSeleccionado.getNombre());
       System.out.println("Cliente: " + clienteSeleccionado.getNombre());
       System.out.println("Vehículo: " + vehiculoSeleccionado.toString());
       System.out.println("Fecha de la transacción: " + LocalDate.now());
    }

    protected static Cliente seleccionarCliente(Scanner scanner, TuCarroUQ tuCarroUQ) {
      List<Cliente> clientesDisponibles = tuCarroUQ.getClientes();

      if (clientesDisponibles.isEmpty()) {
          System.out.println("No hay clientes registrados.");
          return null;
      }

      System.out.println("\nSeleccione un cliente existente o registre uno nuevo:");
      for (int i = 0; i < clientesDisponibles.size(); i++) {
          Cliente c = clientesDisponibles.get(i);
          System.out.println((i + 1) + ". " + c.getNombre());
      }

      System.out.println((clientesDisponibles.size() + 1) + ". Registrar nuevo cliente");

      int seleccionCliente = scanner.nextInt() - 1;
      scanner.nextLine(); // Consumir nueva línea

      if (seleccionCliente >= 0 && seleccionCliente < clientesDisponibles.size()) {
          return clientesDisponibles.get(seleccionCliente);
      } else if (seleccionCliente == clientesDisponibles.size()) {
          registrarCliente(scanner, tuCarroUQ);
          return null;
      } else {
          System.out.println("Selección no válida.");
          return null;
      }
    }

    protected static void registrarCliente(Scanner scanner, TuCarroUQ tuCarroUQ) {
      Cliente nuevoCliente = new Cliente();

      System.out.print("\nIngrese el nombre del cliente: ");
      nuevoCliente.setNombre(scanner.nextLine());

      System.out.print("\nIngrese el documento del cliente: ");
      nuevoCliente.setDocumento(scanner.nextLine());

      System.out.print("\nIngrese el teléfono del cliente: ");
      nuevoCliente.setTelefono(scanner.nextLine());

      System.out.print("\nIngrese la dirección del cliente: ");
      nuevoCliente.setDireccion(scanner.nextLine());

      tuCarroUQ.registrarCliente(nuevoCliente);
    }

    protected static Empleado seleccionarEmpleado(Administrador administrador) {
      List<Empleado> empleados = administrador.getEmpleados();

      if (empleados.isEmpty()) {
          System.out.println("No hay empleados disponibles.");
          return null;
      }

      Scanner scanner = new Scanner(System.in); 
      System.out.println("\nSeleccione un empleado:");
      for (int i = 0; i < empleados.size(); i++) {
          System.out.println((i + 1) + ". " + empleados.get(i).getNombre());
      }

      int seleccion = scanner.nextInt() - 1;

      if (seleccion >= 0 && seleccion < empleados.size()) {
          return empleados.get(seleccion);
      } else {
          System.out.println("Selección no válida.");
          return null;
      }
    }

    private static void registrarEmpleados(Administrador administrador) {
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

      // Agregar empleados al administrador
      administrador.gestionarEmpleado(empleado1);
      administrador.gestionarEmpleado(empleado2);
      administrador.gestionarEmpleado(empleado3);
    }

    private static void registrarClientes(TuCarroUQ tuCarroUQ) {
     Cliente cliente1 = new Cliente();
     cliente1.setNombre("Juan Perez");
     cliente1.setDocumento("123456789");
     cliente1.setTelefono("555-1234");
     cliente1.setDireccion("Calle Falsa 123");

     Cliente cliente2 = new Cliente();
     cliente2.setNombre("Carlos Trujillo");
     cliente2.setDocumento("56789");
     cliente2.setTelefono("3104443442");
     cliente2.setDireccion("Calle 45a # 2021");

     Cliente cliente3 = new Cliente();
     cliente3.setNombre("Mariana Yepes");
     cliente3.setDocumento("987654321");
     cliente3.setTelefono("1234-555");
     cliente3.setDireccion("Avenida Siempre Viva");

     tuCarroUQ.registrarCliente(cliente1);
     tuCarroUQ.registrarCliente(cliente2);
     tuCarroUQ.registrarCliente(cliente3);
    }


    // Registro de vehículos
    private static void registrarVehiculos(TuCarroUQ tuCarroUQ) {
        Vehiculo vehiculo1 = new Sedan();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Corolla";
        vehiculo1.cilindraje = "1600 cc";
        vehiculo1.cambios = "5";
        vehiculo1.velocidadMaxima = "170 km/h";
        vehiculo1.nuevo = true;
        vehiculo1.tipoTransmision = "Automatica";
        vehiculo1.tipoCombustible = "Gasolina";

        Vehiculo vehiculo2 = new Moto();
        vehiculo2.marca = "Yamaha";
        vehiculo2.modelo = "YZF-1";
        vehiculo2.cilindraje = "1000 cc";
        vehiculo2.cambios = "6";
        vehiculo2.velocidadMaxima = "256 km/h";
        vehiculo2.nuevo = true;
        vehiculo2.tipoTransmision = "mecánica";
        vehiculo2.tipoCombustible = "gasolina";

        Vehiculo vehiculo3 = new Deportivo();
        vehiculo3.marca = "Lamborghini";
        vehiculo3.modelo = "Egoista";
        vehiculo3.cilindraje = "5200 cc";
        vehiculo3.cambios = "6";
        vehiculo3.velocidadMaxima = "350 km/h";
        vehiculo3.nuevo = true;
        vehiculo3.tipoTransmision = "automatica";
        vehiculo3.tipoCombustible = "gasolina alto";

        Vehiculo vehiculo4 = new Camioneta();
        vehiculo4.marca = "Mazda";
        vehiculo4.modelo = "Cx-30";
        vehiculo4.cilindraje = "2500 cc";
        vehiculo4.cambios = "6";
        vehiculo4.velocidadMaxima = "210 km/h";
        vehiculo4.nuevo = true;
        vehiculo4.tipoTransmision = "automatica";
        vehiculo4.tipoCombustible = "gasolina";

        Vehiculo vehiculo5 = new PickUp();
        vehiculo5.marca = "toyota";
        vehiculo5.modelo = "hilux";
        vehiculo5.cilindraje = "2400 cc";
        vehiculo5.cambios = "6";
        vehiculo5.velocidadMaxima = "180 km/h";
        vehiculo5.nuevo =true;
        vehiculo5.tipoTransmision = "mecánica";
        vehiculo5.tipoCombustible = "diesel";

        Vehiculo vehiculo6 = new Van();
        vehiculo6.marca = "toyota";
        vehiculo6.modelo = "hiace";
        vehiculo6.cilindraje = "2750 cc";
        vehiculo6.cambios = "6";
        vehiculo6.velocidadMaxima = "190 km/h";
        vehiculo6.nuevo = true;
        vehiculo6.tipoTransmision = "automatica";
        vehiculo6.tipoCombustible = "gasolina ";

        Vehiculo vehiculo7 = new Bus();
        vehiculo7.marca = "mercedez benz";
        vehiculo7.modelo = "sprinter";
        vehiculo7.cilindraje = "2950 cc";
        vehiculo7.cambios = "6";
        vehiculo7.velocidadMaxima = "110 km/h";
        vehiculo7.nuevo = true;
        vehiculo7.tipoTransmision = "automatica";
        vehiculo7.tipoCombustible = "gasolina ";

        Vehiculo vehiculo8 = new Camion();
        vehiculo8.marca = "mercedez benz ";
        vehiculo8.modelo = "actros";
        vehiculo8.cilindraje = "12880";
        vehiculo8.cambios = "12";
        vehiculo8.velocidadMaxima = "90 km/h";
        vehiculo8.nuevo = true;
        vehiculo8.tipoTransmision = "automatica";
        vehiculo8.tipoCombustible = "gasolina alto";

        Vehiculo vehiculo9 = new VehiculoElectrico();
        vehiculo9.marca = " Tesla ";
        vehiculo9.modelo = " 3 Standard Range Plus";
        vehiculo9.cilindraje = " no por que no es de motor a combustion";
        vehiculo9.cambios = "1";
        vehiculo9.velocidadMaxima = "225 km/h";
        vehiculo9.nuevo = true;
        vehiculo9.tipoTransmision = "automatica";
        vehiculo9.tipoCombustible = "electrico 100%";

        Vehiculo vehiculo10 = new VehiculoHibrido();
        vehiculo10.marca = " Toyota ";
        vehiculo10.modelo = " Prius 2023";
        vehiculo10.cilindraje = " 1.8 L";
        vehiculo10.cambios = " 1";
        vehiculo10.velocidadMaxima = " 180 km/h";
        vehiculo10.nuevo = true;
        vehiculo10.tipoTransmision = " automatica";
        vehiculo10.tipoCombustible = " Hibrido (gasolina y electrico)";

        tuCarroUQ.registrarVehiculo(vehiculo1);
        tuCarroUQ.registrarVehiculo(vehiculo2);
        tuCarroUQ.registrarVehiculo(vehiculo3);
        tuCarroUQ.registrarVehiculo(vehiculo4);
        tuCarroUQ.registrarVehiculo(vehiculo5);
        tuCarroUQ.registrarVehiculo(vehiculo6);
        tuCarroUQ.registrarVehiculo(vehiculo7);
        tuCarroUQ.registrarVehiculo(vehiculo8);
        tuCarroUQ.registrarVehiculo(vehiculo9);
        tuCarroUQ.registrarVehiculo(vehiculo10);

    }
}