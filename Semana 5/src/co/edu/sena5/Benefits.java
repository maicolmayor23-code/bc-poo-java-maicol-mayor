package co.edu.sena5;

public class Benefits {

    protected String nombre;
    protected String descripcion;
    protected double porcentajeDescuento;

    public Benefits(String nombre, String descripcion, double porcentajeDescuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double aplicarDescuento(double precioOriginal) {
        if (esAplicable(null, null)) {
            return precioOriginal - (precioOriginal * (porcentajeDescuento / 100.0));
        }
        return precioOriginal;
    }

    public double aplicarDescuento(double precioOriginal, double porcentaje) {
        return precioOriginal - (precioOriginal * (porcentaje / 100.0));
    }

    public double aplicarDescuento(Object cliente, double precioOriginal) {
        if (esAplicable(cliente, null)) {
            return precioOriginal - (precioOriginal * (porcentajeDescuento / 100.0));
        }
        return precioOriginal;
    }


    public void mostrarInfo() {
        System.out.println("Beneficio: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Descuento: " + porcentajeDescuento + "%");
    }

    public boolean esAplicable(Object cliente, Object producto) {
        return false;
    }


    // Getters y Setters...
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

