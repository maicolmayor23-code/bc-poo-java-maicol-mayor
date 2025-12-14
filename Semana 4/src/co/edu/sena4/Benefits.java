package co.edu.sena4;

/*
 Clase padre que representa un beneficio general de la tienda.
 */
public class Benefits {

    protected String nombre;
    protected String descripcion;
    protected double porcentajeDescuento;

    public Benefits(String nombre, String descripcion, double porcentajeDescuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    // Aplica el descuento SOLO si es aplicable
    public double aplicarDescuento(double precioOriginal) {

        if (esAplicable(null, null)) {
            return precioOriginal - (precioOriginal * (porcentajeDescuento / 100));
        }

        // Si NO es aplicable, se devuelve el precio original
        return precioOriginal;
    }

    // Metodo para mostrar información del beneficio (CLAVE para polimorfismo)
    public void mostrarInfo() {
        System.out.println("Beneficio: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Descuento: " + porcentajeDescuento + "%");
    }

    // Metodo que puede ser sobrescrito por las clases hijas
    public boolean esAplicable(Object cliente, Object producto) {
        return false; // comportamiento por defecto
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
