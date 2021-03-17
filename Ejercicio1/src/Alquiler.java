public class Alquiler {
    String nombreAlquilador;
    String dni;
    Integer numDiasAlquiler;
    Vehiculo v;
    Vehiculo listadoVehiculos[];

    public Alquiler(String nombreAlquilador, String dni, Integer numDiasAlquiler, Vehiculo v){
        this.nombreAlquilador = nombreAlquilador;
        this.dni = dni;
        this.numDiasAlquiler = numDiasAlquiler;
        this.v = v;
    }

    public double calcularAlquilerUnVehiculo(Vehiculo v){
        return v.calcularAlquiler(v);
    }

    public void mostrarListado(){
        for (int i = 0; i < listadoVehiculos.length; i++){
            listadoVehiculos[i].toString();
        }
    }

}
