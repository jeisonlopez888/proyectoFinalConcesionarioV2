package co.edu.uniquindio.poo;



public class App {
    public static void main(String[] args) {
        TuCarroUQ tuCarroUQ = new TuCarroUQ();
        Administrador administrador = new Administrador();
        empleados.add(admin);

        Empleado empleado1 = new Empleado();
        empleado1.nombre ="moises vargas";
        empleado1.correo ="moiso@.com";
        empleado1.contrasena = "12345";

        Empleado empleado2 = new Empleado();
        empleado2.nombre ="Jeison lopez";
        empleado2.correo ="Jeison@.com";
        empleado2.contrasena = "12345";

        Empleado empleado3 = new Empleado();
        empleado3.nombre ="pepito perez";
        empleado3.correo ="pepito@.com";
        empleado3.contrasena = "12345";

        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Juan Perez";
        cliente1.documento = "123456789";
        cliente1.telefono = "555-1234";
        cliente1.direccion = "Calle Falsa 123";

        Cliente cliente2 = new Cliente();
        cliente2.nombre = "carlos trujillo";
        cliente2.documento = "56789";
        cliente2.telefono = "3104443442";
        cliente2.direccion = "Calle 45a # 2021";

        Cliente cliente3 = new Cliente();
        cliente3.nombre = "mariana yepes";
        cliente3.documento = "987654321";
        cliente3.telefono = "1234-555";
        cliente3.direccion = "Avenida siempre viva";

        Vehiculo vehiculo1 = new Sedan();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Corolla";
        vehiculo1.cilindraje = "1600";
        vehiculo1.cambios = "5";
        vehiculo1.velocidadMaxima = "170 km/h";
        vehiculo1.nuevo ="si";
        vehiculo1.tipoTransmision = "Automatica";
        vehiculo1.tipoCombustible = "Gasolina";

        Vehiculo vehiculo2 = new Moto();
        vehiculo2.marca = "yamaha";
        vehiculo2.modelo= "YZF-1";
        vehiculo2.cilindraje = "1000 cc";
        vehiculo2.cambios ="6";
        vehiculo2.velocidadMaxima = "256 km/h";
        vehiculo2.nuevo = "usado";
        vehiculo2.tipoTransmision = "mecánica";
        vehiculo2.tipoCombustible = "gasolina";

        Vehiculo vehiculo3 = new Depotivo();
        vehiculo2.marca = "lamborgini";
        vehiculo2.modelo= "egoista";
        vehiculo2.cilindraje = "5200";
        vehiculo2.cambios ="6";
        vehiculo2.velocidadMaxima = "350 km/h";
        vehiculo2.nuevo = "usado";
        vehiculo2.tipoTransmision = "automatica";
        vehiculo2.tipoCombustible = "gasolina alto";

        // Registro de cliente y vehículo
        tuCarroUQ.registrarCliente(cliente1);
        tuCarroUQ.registrarVehiculo(vehiculo1);
        tuCarroUQ.registrarVehiculo(vehiculo2);
        tuCarroUQ.registrarVehiculo(vehiculo3);

    
       // Realización de transacciones
       tuCarroUQ.realizarVenta(vehiculo1, cliente1, empleado1);
       tuCarroUQ.realizarCompra(vehiculo2, cliente3, empleado3);
       tuCarroUQ.realizarAlquiler(vehiculo3, cliente1, empleado1);


        // Generar reportes
     
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.almacenarDatos();
        tuCarroUQ.recuperarDatos();
    }
}