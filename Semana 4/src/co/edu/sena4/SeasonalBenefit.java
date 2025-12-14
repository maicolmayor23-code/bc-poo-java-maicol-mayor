package co.edu.sena4;

/**
 * Beneficio aplicado por temporada especial.
 */
public class SeasonalBenefit extends Benefits {

    protected String temporada;

    public SeasonalBenefit(String nombre, String descripcion,
                              double porcentajeDescuento, String temporada) {
        super(nombre, descripcion, porcentajeDescuento);
        this.temporada = temporada;
    }

    @Override
    public boolean esAplicable(Object cliente, Object producto) {
        return false; //  No puede aplicar
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Temporada aplicable: " + temporada);
    }
}

