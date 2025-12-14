package co.edu.sena5;

// Subclase RegisteredCustomerBenefit
public class RegisteredCustomerBenefit extends Benefits {

    protected double descuentoAdicional;

    public RegisteredCustomerBenefit(String nombre, String descripcion,
                                     double porcentajeDescuento, double descuentoAdicional) {
        super(nombre, descripcion, porcentajeDescuento);
        this.descuentoAdicional = descuentoAdicional;
    }

    @Override
    public boolean esAplicable(Object cliente, Object producto) {
        return true; // siempre aplicable
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * (descuentoAdicional / 100));
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Beneficio: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Descuento adicional: " + descuentoAdicional + "%");
    }
}