package co.edu.uniquindio.poo;



public interface ITransacciones {
    public void realizarAlquiler(Vehiculo vehiculo, Cliente cliente);
    public void realizarVenta(Vehiculo vehiculo, Cliente cliente);
    public void realizarCompra(Vehiculo vehiculo, Cliente cliente);
}
