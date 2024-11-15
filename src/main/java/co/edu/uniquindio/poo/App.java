package co.edu.uniquindio.poo;



public class App {
    public static void main(String[] args) {
        TuCarroUQ tuCarroUQ = new TuCarroUQ();

        Administrador admin = new Administrador();

        // Intentar validar credenciales
        try {
            admin.validarCredenciales("usuario@ejemplo.com", "incorrecta"); // Esto lanzará la excepción
        } catch (ExcepcionCredenciales e) {
            admin.manejoExcepciones(e); // Manejo de la excepción
        }
        

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
        vehiculo1.cilindraje = "1600 cc";
        vehiculo1.cambios = "5";
        vehiculo1.velocidadMaxima = "170 km/h";
        vehiculo1.nuevo ="si";
        vehiculo1.tipoTransmision = "Automatica";
        vehiculo1.tipoCombustible = "Gasolina";
        vehiculo1.toString();

        Vehiculo vehiculo2 = new Moto();
        vehiculo2.marca = "yamaha";
        vehiculo2.modelo= "YZF-1";
        vehiculo2.cilindraje = "1000 cc";
        vehiculo2.cambios ="6";
        vehiculo2.velocidadMaxima = "256 km/h";
        vehiculo2.nuevo = "usado";
        vehiculo2.tipoTransmision = "mecánica";
        vehiculo2.tipoCombustible = "gasolina";

        Vehiculo vehiculo3 = new Deportivo();
        vehiculo3.marca = "lamborgini";
        vehiculo3.modelo= "egoista";
        vehiculo3.cilindraje = "5200 cc";
        vehiculo3.cambios ="6";
        vehiculo3.velocidadMaxima = "350 km/h";
        vehiculo3.nuevo = "usado";
        vehiculo3.tipoTransmision = "automatica";
        vehiculo3.tipoCombustible = "gasolina alto";

        Vehiculo vehiculo4 = new Camioneta();
        vehiculo4.marca = "Mazda";
        vehiculo4.modelo= "Cx-30";
        vehiculo4.cilindraje = "2500 cc";
        vehiculo4.cambios ="6";
        vehiculo4.velocidadMaxima = "210 km/h";
        vehiculo4.nuevo = "usado";
        vehiculo4.tipoTransmision = "automatica";
        vehiculo4.tipoCombustible = "gasolina";

        Vehiculo vehiculo5 = new PickUp();
        vehiculo5.marca = "toyota";
        vehiculo5.modelo= "hilux";
        vehiculo5.cilindraje = "2400 cc";
        vehiculo5.cambios ="6";
        vehiculo5.velocidadMaxima = "180 km/h";
        vehiculo5.nuevo = "nuevo";
        vehiculo5.tipoTransmision = "mecánica";
        vehiculo5.tipoCombustible = "diesel";

        Vehiculo vehiculo6 = new Van();
        vehiculo6.marca = "toyota";
        vehiculo6.modelo= "hiace";
        vehiculo6.cilindraje = "2750 cc";
        vehiculo6.cambios ="6";
        vehiculo6.velocidadMaxima = "190 km/h";
        vehiculo6.nuevo = "usado";
        vehiculo6.tipoTransmision = "automatica";
        vehiculo6.tipoCombustible = "gasolina ";

        Vehiculo vehiculo7 = new Bus();
        vehiculo7.marca = "mercedez benz";
        vehiculo7.modelo= "sprinter";
        vehiculo7.cilindraje = "2950 cc";
        vehiculo7.cambios ="6";
        vehiculo7.velocidadMaxima = "110 km/h";
        vehiculo7.nuevo = "nuevo";
        vehiculo7.tipoTransmision = "automatica";
        vehiculo7.tipoCombustible = "gasolina ";

        Vehiculo vehiculo8 = new Camion();
        vehiculo8.marca = "mercedez benz ";
        vehiculo8.modelo= "actros";
        vehiculo8.cilindraje = "12880";
        vehiculo8.cambios ="12";
        vehiculo8.velocidadMaxima = "90 km/h";
        vehiculo8.nuevo = "nuevo";
        vehiculo8.tipoTransmision = "automatica";
        vehiculo8.tipoCombustible = "gasolina alto";

        Vehiculo vehiculo9 = new VehiculoElectrico();
        vehiculo9.marca = " Tesla ";
        vehiculo9.modelo = " 3 Standard Range Plus";
        vehiculo9.cilindraje = " no por que no es de motor a combustion";
        vehiculo9.cambios ="1";
        vehiculo9.velocidadMaxima = "225 km/h";
        vehiculo9.nuevo = "nuevo";
        vehiculo9.tipoTransmision = "automatica";
        vehiculo9.tipoCombustible = "electrico 100%";

        Vehiculo vehiculo10 = new VehiculoHibrido();
        vehiculo10.marca = " Toyota ";
        vehiculo10.modelo = " Prius 2023";
        vehiculo10.cilindraje = " 1.8 L";
        vehiculo10.cambios =" 1";
        vehiculo10.velocidadMaxima = " 180 km/h";
        vehiculo10.nuevo = " Usado";
        vehiculo10.tipoTransmision = " automatica";
        vehiculo10.tipoCombustible = " Hibrido (gasolina y electrico)";


        // Registro de cliente y vehículo
        tuCarroUQ.registrarCliente(cliente1);
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

    

    
       // Realización de transacciones
       tuCarroUQ.realizarVenta(vehiculo1, cliente1, empleado1);
       tuCarroUQ.realizarCompra(vehiculo2, cliente2, empleado3);
       tuCarroUQ.realizarAlquiler(vehiculo3, cliente3, empleado1);
       tuCarroUQ.realizarAlquiler(vehiculo4, cliente1, empleado3);
       tuCarroUQ.realizarCompra(vehiculo5, cliente2, empleado2);
       tuCarroUQ.realizarVenta(vehiculo6, cliente3, empleado3);
       tuCarroUQ.realizarCompra(vehiculo7, cliente1, empleado3);
       tuCarroUQ.realizarAlquiler(vehiculo8, cliente2, empleado1);
       tuCarroUQ.realizarCompra(vehiculo9, cliente3, empleado3);
       tuCarroUQ.realizarVenta(vehiculo10, cliente1, empleado2);



        // Generar reportes
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.generarReportes();
        tuCarroUQ.almacenarDatos();
        tuCarroUQ.recuperarDatos();
    }
}