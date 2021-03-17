public class PatineteVolador extends Vehiculo implements Calculos{
    Integer caballos;
    public PatineteVolador(String matricula, Double tamañoEnMetros, Integer añoDeFabricacion, Integer caballos) {
        super(matricula, tamañoEnMetros, añoDeFabricacion);
        this.caballos = caballos;
    }

    @Override
    public double calcularAlquiler(Vehiculo v){
        Double total = super.calcularAlquiler(v);
        total += this.caballos;
        return total;
    }

    @Override
    public String toString() {
        return "PatineteVolador{" +
                "caballos=" + caballos +
                '}';
    }
}
