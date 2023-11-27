import java.util.ArrayList;

public class Calculo {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Ciudad", "Solar", "Acero", 500, 100);
        Vehiculo vehiculo = new Vehiculo("Rural", "Híbrido", 0.05, 80);
        Bicicleta bicicleta = new Bicicleta("Recreativa", "Aluminio", 20, 5);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(vehiculo);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.getIdentificacion() + " - Impacto Ecológico: " + objeto.calcularImpactoEcologico());
        }
    }
}
