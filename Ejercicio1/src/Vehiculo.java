public class Vehiculo implements Calculos {
    String matricula;
    Double tamañoEnMetros;
    Integer añoDeFabricacion;

    public Vehiculo(String matricula, Double tamañoEnMetros, Integer añoDeFabricacion){
        this.matricula = matricula;
        this.tamañoEnMetros = tamañoEnMetros;
        this.añoDeFabricacion = añoDeFabricacion;
    }


    @Override
    public double calcularAlquiler(Vehiculo v) {
        Double total;
        total = (v.tamañoEnMetros*v.añoDeFabricacion)/100;
        return total;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", tamañoEnMetros=" + tamañoEnMetros +
                ", añoDeFabricacion=" + añoDeFabricacion +
                '}';
    }
}
