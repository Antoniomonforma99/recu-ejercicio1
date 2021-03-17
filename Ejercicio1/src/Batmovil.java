public class Batmovil extends Vehiculo implements Calculos{
    Integer numRuedas;

    public Batmovil(String matricula, Double tamañoEnMetros, Integer añoDeFabricacion, Integer numRuedas) {
        super(matricula, tamañoEnMetros, añoDeFabricacion);
        this.numRuedas = numRuedas;
    }

    @Override
    public double calcularAlquiler(Vehiculo v){
        Double total = super.calcularAlquiler(v);
        total += this.numRuedas/10;
        return total;

    }

    @Override
    public String toString() {
        return "Batmovil{" +
                "numRuedas=" + numRuedas +
                '}';
    }
}
