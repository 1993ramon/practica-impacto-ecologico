public class Vehiculo implements ImpactoEcologico {
    private String zonaOperacion;
    private String tecnologiaMotor;
    private double emisionesKm;
    private double eficiencia;

    public Vehiculo(String zonaOperacion, String tecnologiaMotor, double emisionesKm, double eficiencia) {
        this.zonaOperacion = zonaOperacion;
        this.tecnologiaMotor = tecnologiaMotor;
        this.emisionesKm = emisionesKm;
        this.eficiencia = eficiencia;
    }

    @Override
    public double calcularImpactoEcologico() {
        return emisionesKm / eficiencia;
    }

    @Override
    public String getIdentificacion() {
        return "Vehiculo: " + tecnologiaMotor;
    }
}
