package co.edu.sena5;

public class SeasonalBenefit extends Benefits {

    protected String temporada;

    public SeasonalBenefit(String nombre, String descripcion,
                           double porcentajeDescuento, String temporada) {
        super(nombre, descripcion, porcentajeDescuento);
        this.temporada = temporada;
    }

    @Override
    public boolean esAplicable(Object cliente, Object producto) { // Simulación de temporada actual
        String temporadaActual = "Invierno"; // cambiar según convenga
        return temporada.equalsIgnoreCase(temporadaActual);
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        if (esAplicable(null, null)) {
            double precioConDescuento = super.aplicarDescuento(precioOriginal);
            System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
            return precioConDescuento;
        } else {
            System.out.println("Es temporada de " + temporada + ", no se aplica descuento.");
            return precioOriginal;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Beneficio: " + nombre);
        System.out.println("Descripción: " + descripcion);
        if (esAplicable(null, null)) {
            System.out.println("Descuento: " + porcentajeDescuento + "%");
        } else {
            System.out.println("No aplica descuento: fuera de temporada");
        }
        System.out.println("Temporada aplicable: " + temporada);
    }
}
