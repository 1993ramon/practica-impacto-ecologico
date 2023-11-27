public class Bicicleta implements ImpactoEcologico {
    private String tipoUso;
    private String materialConstruccion;
    private double eficienciaProduccion;
    private double huellaCarbono;

    public Bicicleta(String tipoUso, String materialConstruccion, double eficienciaProduccion, double huellaCarbono) {
        this.tipoUso = tipoUso;
        this.materialConstruccion = materialConstruccion;
        this.eficienciaProduccion = eficienciaProduccion;
        this.huellaCarbono = huellaCarbono;
    }

    @Override
    public double calcularImpactoEcologico() {
        return huellaCarbono - eficienciaProduccion;
    }

    @Override
    public String getIdentificacion() {
        return "Bicicleta: " + tipoUso;
    }
}
