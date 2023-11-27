public class Edificio implements ImpactoEcologico {
    private String ubicacion;
    private String sistemaEnergetico;
    private String materialPrincipal;
    private double usoEnergia;
    private double impactoReciclaje;

    public Edificio(String ubicacion, String sistemaEnergetico, String materialPrincipal, double usoEnergia, double impactoReciclaje) {
        this.ubicacion = ubicacion;
        this.sistemaEnergetico = sistemaEnergetico;
        this.materialPrincipal = materialPrincipal;
        this.usoEnergia = usoEnergia;
        this.impactoReciclaje = impactoReciclaje;
    }

    @Override
    public double calcularImpactoEcologico() {
        // Lógica simplificada para el cálculo del impacto ecológico
        return usoEnergia - impactoReciclaje;
    }

    @Override
    public String getIdentificacion() {
        return "Edificio: " + ubicacion;
    }
}
