package co.edu.sena4;

/**
 * Beneficio aplicado a clientes inscritos.
 */
public class RegisteredCustomerBenefit extends Benefits {

    protected double descuentoAdicional;

    public RegisteredCustomerBenefit(String nombre, String descripcion,
                                    double porcentajeDescuento, double descuentoAdicional) {
        super(nombre, descripcion, porcentajeDescuento);
        this.descuentoAdicional = descuentoAdicional;
    }

    @Override
    public boolean esAplicable(Object cliente, Object producto) {
        return true; // Sí se puede aplicar
    }

    @Override
    public double aplicarDescuento(double precioOriginal) {
        return precioOriginal - (precioOriginal * (descuentoAdicional / 100));
    }

    // 🔥 CAMBIO CLAVE: solo se muestra UN descuento
    @Override
    public void mostrarInfo() {
        System.out.println("Beneficio: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Descuento: " + descuentoAdicional + "%");
    }
}




